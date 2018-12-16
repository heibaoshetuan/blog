package xyz.yescn.blog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.service.IUserService;


@RestController
@RequestMapping(value = "/app/user")
public class UserApi {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public UserDto getUser(Long id){
        return userService.getUserById(id);
    }
}
