package com.coolwen.springbootshiro;

import com.coolwen.springbootshiro.config.ShiroConfig;
import com.coolwen.springbootshiro.dao.basedao.BaseRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication
//指定自己的工厂类
@EnableJpaRepositories(basePackages = {"com.coolwen.springbootshiro"}, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@Import(ShiroConfig.class)
@EnableCaching
public class SpringbootshiroApplication {


/*//可以打印出当前事务管理使用的类
    @Bean
    public Object testBean(PlatformTransactionManager platformTransactionManager) {
        System.out.println(">>>>>>>>>>" + platformTransactionManager.getClass().getName());
        return new Object();
    }
*/

    public static void main(String[] args) {
        SpringApplication.run(SpringbootshiroApplication.class, args);
    }
}
