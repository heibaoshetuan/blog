package xyz.yescn.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.service.IUserService;

import java.util.List;

/**
 * Gavin_Wang
 * 用户信息管理控制器，后台编辑操作使用
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * create by: Gavin_Wang
     *description:a
     * create time: 11:28 2018/12/17 0017
     *
     * @eturn a
     * @Param: null
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public UserDto getUserById(Long id) {
        return userService.getUserById(id);
    }

    /**
     * create by: Gavin_Wang
     *description:a
     * create time: 11:28 2018/12/17 0017
     *
     * @eturn a
     * @Param: null
     */
    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public List<UserDto> getUserList() {
        return userService.getUserList();
    }

}
