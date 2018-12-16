package xyz.yescn.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.service.IUserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(Long id){
        User user = userService.getUser(id);
        return user;
    }
    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUserList(){
        List<User> users = userService.getUserList();
        return users;
    }

}
