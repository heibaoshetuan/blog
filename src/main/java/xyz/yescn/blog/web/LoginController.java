package xyz.yescn.blog.web;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import xyz.yescn.blog.dto.UserDto;

import javax.servlet.http.HttpServletRequest;

/**
 * @author issuser
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "admin/login";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(HttpServletRequest request, UserDto userDto) {
//        request.getSession().setAttribute("toKey", "toKey");
//        return "/api/user/getUser?id=1";
//    }
}
