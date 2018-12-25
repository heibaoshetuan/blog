package xyz.yescn.blog.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.service.IUserService;

import java.sql.Timestamp;


/**
 * Gavin_Wang
 * 用户信息管理控制器，后台编辑操作使用
 *
 * @author issuser
 */
@Controller
@Slf4j
@RequestMapping("/admin/users")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 查询所有用户信息
     *
     * @param model
     * @return
     */
    @GetMapping()
    public ModelAndView list(Model model) {
        try {
            model.addAttribute("userList", userService.getUserList(1, 10));
            model.addAttribute("title", "用户管理");
        } catch (Exception e) {
            log.error(e.toString());
        }
        return new ModelAndView("users/list", "userModel", model);
    }

    /**
     * 查看用户信息
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "{id}")
    public ModelAndView view(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        model.addAttribute("title", "查看用户");
        return new ModelAndView("users/view", "userModel", model);
    }

    /**
     * 获取新增用户页面
     *
     * @param model
     * @return
     */
    @GetMapping(value = "/form")
    public ModelAndView createFrom(Model model) {
        model.addAttribute("user", new UserDto());
        model.addAttribute("title", "新增用户");
        return new ModelAndView("users/form", "userModel", model);
    }

    /**
     * 保存用户
     *
     * @param userDto
     * @return
     */
    @PostMapping()
    public ModelAndView saveOrUpdateUser(UserDto userDto) {
        userDto.setCreateTime(new Timestamp(System.currentTimeMillis()).toString());
        userDto.setDescription("gavin_wang");
        userDto.setPhone("13580567593");
        userDto.setStatus(1);
        if (null != userDto && null != userDto.getId()) {
            userService.updateUser(userDto);
        } else {
            userService.insertUser(userDto);
        }
        return new ModelAndView("redirect:/admin/users");
    }

    /**
     * 获取修改用户的页面
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "modify/{id}")
    public ModelAndView modify(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        model.addAttribute("title", "修改用户");
        return new ModelAndView("users/form", "userModel", model);
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ModelAndView("redirect:/admin/users");
    }
}
