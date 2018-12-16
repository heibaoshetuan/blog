package xyz.yescn.blog.service.impl;

import org.springframework.stereotype.Service;
import xyz.yescn.blog.app.dto.UserDto;
import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.service.IUserService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Override
    public UserDto getUser(Long id) {
        return  getUserDtoFromUser(new User(1L,"张珊","张珊是女的，且是高级管理员","13580567593"));
    }

    @Override
    public List<UserDto> getUserList() {
        List<UserDto> userDtoList = new ArrayList<>(2);
        userDtoList.add( getUserDtoFromUser(new User(1L,"张珊","张珊是女的，且是高级管理员","13580567593")));
        userDtoList.add( getUserDtoFromUser(new User(2L,"liSi","liSiSha","13880567593")));
        return userDtoList;
    }

    /**
     * 简单封装实体对象的转换Dto
     * @param user
     * @return
     */
    private UserDto getUserDtoFromUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setDesc(user.getDesc());
        userDto.setPhone(user.getPhone());
        return userDto;
    }
}
