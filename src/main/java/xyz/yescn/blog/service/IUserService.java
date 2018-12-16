package xyz.yescn.blog.service;

import xyz.yescn.blog.app.dto.UserDto;
import xyz.yescn.blog.domain.User;

import java.util.List;

public interface IUserService {
    UserDto getUser(Long id);
    List<UserDto> getUserList();
}
