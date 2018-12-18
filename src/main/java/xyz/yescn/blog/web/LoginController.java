package xyz.yescn.blog.web;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.yescn.blog.dto.UserDto;

import javax.servlet.http.HttpServletRequest;

/**
 * @author issuser
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    public String toLogin(UserDto userDto){
        return "/admin/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, UserDto userDto){
        request.getSession().setAttribute("toKey", "toKey");
        return "/api/user/getUser?id=1";
    }
}
