package com.coolwen.springbootshiro.service;

import com.coolwen.springbootshiro.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;


    @Test
    public void add() {
        User user = new User();
        user.setNickname("总裁");
        user.setUsername("Ronaldo");
        user.setPassword("123");
        user.setStatus(false);
        userService.add(user);

        user = new User();
        user.setNickname("煤老板");
        user.setUsername("Messi");
        user.setPassword("123");
        user.setStatus(false);
        userService.add(user);

        user = new User();
        user.setNickname("开心");
        user.setUsername("Coolwen");
        user.setPassword("123");
        user.setStatus(false);
        userService.add(user);
    }

    @Test
    public void add1() {
    }

    @Test
    public void delete() {
        userService.delete(52);
    }

    @Test
    public void updateRole() {
        User u = userService.load(3);
        System.out.println("用户信息:" + u);
        List<Integer> rids = new ArrayList<>();
        rids.add(98);
        rids.add(99);
        userService.update(u, rids);
    }

    @Test
    public void update() {
    }

    @Test
    public void load() {
        System.out.println(userService.load(1));
    }

    @Test
    public void loadByUsername() {
        System.out.println(userService.findByUsername("coolwen"));
    }

    @Test
    public void login() {
        userService.login("coolwen", "cool");
    }

    @Test
    public void list() {
        System.out.println(userService.list());
    }

    @Test
    public void listByRole() {
        System.out.println(userService.listByRole(1));
    }

    @Test
    public void listAllResource() {
        System.out.println(userService.listAllResource(1));
    }

    @Test
    public void listRoleSnByUser() {
        System.out.println(userService.listRoleSnByUser(1));
    }

    @Test
    public void listUserRole() {
        System.out.println(userService.listUserRole(1));
    }

}