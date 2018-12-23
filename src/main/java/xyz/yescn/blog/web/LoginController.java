package xyz.yescn.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
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
public class LoginController {
    @Autowired
    private IUserService userService;

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
    public ModelAndView login(HttpServletRequest request, UserDto userDto,Model model) {
        userDto = userService.getUserByNameAndPassword(userDto.getName(), userDto.getPassword());
        String skipUrl = (String) request.getSession().getAttribute("skipUrl");
        if (null == userDto.getId()) {
            model.addAttribute("error","用户或密码错误");
            return new ModelAndView("redirect:/login");
        }
        request.getSession().setAttribute("userDto", userDto);
        return new ModelAndView("redirect:" + skipUrl + "");
    }
}
