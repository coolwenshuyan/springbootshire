package com.coolwen.springbootshiro.service;

import com.coolwen.springbootshiro.model.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceServiceImplTest {

    @Autowired
    private ResourceService resourceService;

    @Test
    public void add() {
        Resource res = new Resource();
        res.setName("系统管理");
        res.setUrl("/admin/**");
        resourceService.add(res);

        res = new Resource();
        res.setName("用户管理");
        res.setUrl("/admin/user/*");
        resourceService.add(res);

        res = new Resource();
        res.setName("用户添加");
        res.setUrl("/admin/user/add");
        resourceService.add(res);

        res = new Resource();
        res.setName("用户删除");
        res.setUrl("/admin/user/delete");
        resourceService.add(res);

        res = new Resource();
        res.setName("角色管理");
        res.setUrl("/admin/role/*");
        resourceService.add(res);

        res = new Resource();
        res.setName("角色添加");
        res.setUrl("/admin/role/add");
        resourceService.add(res);

        res = new Resource();
        res.setName("角色修改");
        res.setUrl("/admin/role/update");
        resourceService.add(res);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void load() {
    }

    @Test
    public void listResource() {
    }
}