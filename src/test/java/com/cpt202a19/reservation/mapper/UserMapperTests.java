package com.cpt202a19.reservation.mapper;

import com.cpt202a19.reservation.entity.User;
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

<<<<<<< HEAD
@RunWith(SpringRunner.class) // is a test launcher that can load Springboot test annotations
=======
// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@RunWith(SpringRunner.class)
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
@SpringBootTest
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

<<<<<<< HEAD
    // Test inserting a new user
=======
    //测试插入一个新用户
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("tim4");
        user.setPassword("123");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }
   
<<<<<<< HEAD
    // The test matches the newly registered user
    @Test
    public void findByUsername() {
        String username = "tim4";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }

    // Test update user information
=======
      //测试匹配到刚注册的新用户
      @Test
      public void findByUsername() {
          String username = "tim4";
          User result = userMapper.findByUsername(username);
          System.out.println(result);
      }
      //测试更新用户信息
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    @Test
    public void updatePasswordByUid() {
        userMapper.updatePasswordByUid(7,"8888","管理员",new Date());
    }
<<<<<<< HEAD

    // Test Modified Information
=======
    //测试修改的信息
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    @Test
    public void findByUid() {
        System.out.println(userMapper.findByUid(7));
    }

<<<<<<< HEAD
    // Test profile
=======
    //测试个人资料
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    @Test
    public void updateInfoByUid() {
        User user = new User();
        user.setUid(7);
        user.setPhone("17858802222");
        user.setEmail("admin@gmail.com");
        user.setGender(1);
        user.setModifiedUser("系统管理员");
        user.setModifiedTime(new Date());
        Integer rows = userMapper.updateInfoByUid(user);
        System.out.println("rows=" + rows);
    }

    @Test
    public void updateAvatarByUid() {
        userMapper.updateAvatarByUid(
                7,
                "/upload/avatar.png",
                "管理员",
                new Date());
    }
<<<<<<< HEAD

=======
  
     
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}