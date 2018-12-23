package xyz.yescn.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.dto.UserDto;

import java.util.List;

/**
 * @author issuser
 */
@Repository
public interface UserMapper {
    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 通过名称和密码查询用户是否存在
     *
     * @param name
     * @param password
     * @return
     */
    User getUserByNameAndPassword(@Param("name") String name, @Param("password") String password);

    /**
     * 新增用户
     *
     * @param userDto
     */
    void insertUser(UserDto userDto);

    /**
     * 更新用户
     *
     * @param userDto
     */
    void updateUser(UserDto userDto);

    /**
     * 删除用户
     *
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 通过toKey查询用户授权信息，进行权限验证
     *
     * @param toKen
     * @return
     */
    User getLoginUserByToKen(String toKen);

    /**
     * 获取用户列表，未进行分页
     *
     * @return
     */
    List<User> getUserList();
}
