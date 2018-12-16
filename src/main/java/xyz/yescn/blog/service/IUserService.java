package xyz.yescn.blog.service;

import xyz.yescn.blog.dto.UserDto;

import java.util.List;

public interface IUserService {
    UserDto getUserById(Long id);
    List<UserDto> getUserList();
}
