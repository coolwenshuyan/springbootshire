package com.coolwen.springbootshiro.dao.basedao;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * @author CoolWen
 * @version 2018-10-24 23:11
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    private final EntityManager entityManager;

    //父类没有不带参数的构造方法，这里手动构造父类
    public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }

    //通过EntityManager来完成查询
    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> listBySQL(String sql) {
        return entityManager.createNativeQuery(sql).getResultList();
    }

    @Override
    public void updateBySql(String sql, Object... args) {
        Query query = entityManager.createNativeQuery(sql);
        int i = 0;
        for (Object arg : args) {
            System.out.println(arg);
            query.setParameter(++i, arg);

        }
        query.executeUpdate();

    }

    @Override
    public void updateByHql(String hql, Object... args) {
        Query query = entityManager.createQuery(hql);
        int i = 0;
        for (Object arg : args) {
            System.out.println(arg);
            query.setParameter(i++, arg);

        }
        query.executeUpdate();
    }
}
