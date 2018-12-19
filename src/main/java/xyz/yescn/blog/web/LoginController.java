package xyz.yescn.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.service.IUserService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author issuser
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private IUserService userService;

    @GetMapping()
    public ModelAndView login(Model model) {
        model.addAttribute("user", new UserDto());
        model.addAttribute("title", "用户登陆");
        return new ModelAndView("login", "userModel", model);
    }

    @PostMapping()
    public ModelAndView login(HttpServletRequest request,UserDto userDto) {
        userDto = userService.getUserByNameAndPassword(userDto.getName(),userDto.getPassword());
        request.getSession().setAttribute("userDto", userDto);
        return new ModelAndView("redirect:/users");
    }
}
