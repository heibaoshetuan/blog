package xyz.yescn.blog.service;

import xyz.yescn.blog.domain.User;

import java.util.List;

public interface IUserService {
    User getUser(Long id);
    List<User> getUserList();
}
