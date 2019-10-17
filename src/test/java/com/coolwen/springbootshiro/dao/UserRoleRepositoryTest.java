package com.coolwen.springbootshiro.dao;

import com.coolwen.springbootshiro.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRoleRepositoryTest {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Test
    public void findByUserIdAndRoleId() {
        System.out.println( userRoleRepository.findByUserIdAndRoleId(53, 1));
    }

    @Test
    public void deleteByUserId() {
        userRoleRepository.deleteByUserId(52);
    }
}