package xyz.yescn.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.service.IUserService;

import java.util.List;

@Controller
@RequestMapping("/admin/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public UserDto getUser(Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public List<UserDto> getUserList() {
        return userService.getUserList();
    }

}
