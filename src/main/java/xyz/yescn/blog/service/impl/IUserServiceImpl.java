package xyz.yescn.blog.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.yescn.blog.dao.UserMapper;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.exception.CustomException;
import xyz.yescn.blog.service.IUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author issuser
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * 根据用户ID，查询用户信息
     *
     * @param id
     * @return userDto
     */
    @Override
    public UserDto getUserById(Long id) {
        if (StringUtils.isEmpty(id)) {
            throw new CustomException("查询用户ID为空");
        }
        return getUserDtoFromUser(userMapper.getUserById(id));
    }

    @Override
    public UserDto getUserByNameAndPassword(String name, String password) {
        return getUserDtoFromUser(userMapper.getUserByNameAndPassword(name,password));
    }

    /**
     * 新增用户
     *
     * @param userDto
     */
    @Override
    public void insertUser(UserDto userDto) {
        userMapper.insertUser(userDto);
    }

    /**
     * 更新用户
     *
     * @param userDto
     */
    @Override
    public void updateUser(UserDto userDto) {
        userMapper.updateUser(userDto);
    }

    /**
     * 删除用户
     *
     * @param id
     */
    @Override
    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }

    /**
     * 查询用户列表信息，未进行分页查询
     *
     * @return userDtoList
     */
    @Override
    public List<UserDto> getUserList(Integer pageNum,Integer pageSize) {
       List<UserDto> userDtoList = new ArrayList<>();
       PageHelper.startPage(pageNum, pageSize);
       List<User> userList = userMapper.getUserList();
       for(User user:userList){
           userDtoList.add(getUserDtoFromUser(user));
       }
        return userDtoList;
    }

    /**
     * 通过toKey查询用户授权信息，进行权限验证
     *
     * @param toKen
     * @return
     */
    @Override
    public UserDto getLoginUserByToKen(String toKen) {
        return getUserDtoFromUser(userMapper.getLoginUserByToKen(toKen));
    }

    /**
     * 封装实体对象的转换Dto
     *
     * @param user
     * @return userDto
     */
    private UserDto getUserDtoFromUser(User user) {
        UserDto userDto = new UserDto();
        if(null != user){
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setPhone(user.getPhone());
            userDto.setCreateTime(user.getCreateTime());
            userDto.setStatus(user.getStatus());
        }
        return userDto;
    }
}
