package xyz.yescn.blog.service.impl;

import org.springframework.stereotype.Service;
import xyz.yescn.blog.domain.User;
import xyz.yescn.blog.service.IUserService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("zhangshan");
        user.setDesc("zhanshan");
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setPhone("13580567593");
        user.setToKey("sEdsfsdere&%ererre");
        return user;
    }

    @Override
    public List<User> getUserList() {
        List<User> users = new ArrayList<User>(2);
        User user1 = new User();
        user1.setId(1L);
        user1.setName("zhangshan");
        user1.setDesc("zhanshan");
        user1.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user1.setPhone("13580567593");
        user1.setToKey("sEdsfsdere&%ererre");
        User user2 = new User();
        user2.setId(2L);
        user2.setName("zhangshan2");
        user2.setDesc("zhanshan2");
        user2.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user2.setPhone("13580567593");
        user2.setToKey("sEdsfsdere&%ererre2");
        users.add(user1);
        users.add(user2);
        return users;
    }
}
