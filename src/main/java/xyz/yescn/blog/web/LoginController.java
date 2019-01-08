package xyz.yescn.blog.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.exception.CustomException;
import xyz.yescn.blog.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;


/**
 * @author issuser
 */
@Controller
@Slf4j
public class LoginController {
    private final IUserService userService;

    @Autowired
    public LoginController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 用户注册页面跳转
     *
     * @param model
     * @return
     */
    @GetMapping("/registry")
    public String registry(Model model) {
        model.addAttribute("title", "用户注册");
        model.addAttribute("user", new UserDto());
        return "registry";
    }

    /**
     * 用户注册保存操作
     *
     * @param userDto
     * @return
     */
    @PostMapping("/registry")
    public String registry(UserDto userDto, Model model) {
        try {
            userDto.setCreateTime(new Timestamp(System.currentTimeMillis()).toString());
            userDto.setStatus(1);
            userService.insertUser(userDto);
        } catch (CustomException ce) {
            log.error("用户注册错误");
            model.addAttribute("error", "用户注册错误");
            return "/registry";
        }
        return "login";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index() {
        return "redirect:/daily/list";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new UserDto());
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(HttpServletRequest request, UserDto userDto, Model model) {
        userDto = userService.getUserByNameAndPassword(userDto.getName(), userDto.getPassword());
        String skipUrl = (String) request.getSession().getAttribute("skipUrl");
        if (null == userDto.getId()) {
            model.addAttribute("error", "用户或密码错误");
            return new ModelAndView("redirect:/login");
        }
        request.getSession().setAttribute("userDto", userDto);
        if (StringUtils.isEmpty(skipUrl) || skipUrl.indexOf("error") > -1) {
            return new ModelAndView("redirect:/");
        }
        return new ModelAndView("redirect:" + skipUrl);
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        if (userDto != null) {
            request.getSession().removeAttribute("userDto");
        }
        return "redirect:/login";
    }
}
