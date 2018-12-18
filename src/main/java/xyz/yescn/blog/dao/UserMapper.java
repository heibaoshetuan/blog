package xyz.yescn.blog.dao;

import org.springframework.stereotype.Repository;
import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.dto.UserDto;

import java.util.List;

/**
 * @author issuser
 */
@Repository
public interface UserMapper {
    User getUserById(Long id);
    void insertUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(Long id);
    User getLoginUserByToKey(String toKey);
    List<User> getUserList();
}
