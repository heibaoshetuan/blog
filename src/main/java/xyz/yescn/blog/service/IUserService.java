package xyz.yescn.blog.service;

import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.dto.UserDto;

import java.util.List;

/**
 * @author issuser
 * 用户业务服务层
 */
public interface IUserService {
    /**
     * 查询用户
     * @param id
     * @return
     */
    UserDto getUserById(Long id);

    /**
     * 新增用户
     * @param userDto
     */
    void insertUser(UserDto userDto);

    /**
     * 更新用户
     * @param userDto
     */
    void updateUser(UserDto userDto);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 获取用户列表，未进行分页
     * @return
     */
    List<UserDto> getUserList(Integer pageNum,Integer pageSize);
}
