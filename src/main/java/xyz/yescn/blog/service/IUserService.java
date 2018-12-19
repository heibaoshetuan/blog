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
     * 通过名称和密码查询用户是否存在
     * @param name
     * @param password
     * @return
     */
    UserDto getUserByNameAndPassword(String name,String password);

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

    /**
     * 通过toKey查询用户授权信息，进行权限验证
     * @param toKey
     * @return
     */
    UserDto getLoginUserByToKey(String toKey);
}
