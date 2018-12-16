package xyz.yescn.blog.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.yescn.blog.app.dto.UserDto;
import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.service.IUserService;


@RestController
@RequestMapping("/app/user")
public class UserAPI {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public UserDto getUser(Long id){
        UserDto userDto = new UserDto();
        User user = userService.getUser(id);
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setDesc(user.getDesc());
        userDto.setPhone(user.getPhone());
        return userDto;
    }
}
