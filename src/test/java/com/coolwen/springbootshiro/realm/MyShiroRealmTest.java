package com.coolwen.springbootshiro.realm;

import com.coolwen.springbootshiro.controller.LoginController;
import com.coolwen.springbootshiro.service.UserService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.security.auth.Subject;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyShiroRealmTest {

    @Test
    public void testEncode() {
        System.out.println(new Date()+"------------->>>>>>>>>>>>>"+new Md5Hash("123","user").toBase64());
    }

}