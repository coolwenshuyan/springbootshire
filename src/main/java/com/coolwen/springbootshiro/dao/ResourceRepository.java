package com.coolwen.springbootshiro.dao;

import com.coolwen.springbootshiro.model.Resource;
import com.coolwen.springbootshiro.dao.basedao.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author CoolWen
 * @version 2018-10-31 8:25
 */
public interface ResourceRepository extends BaseRepository<Resource, Integer>, JpaSpecificationExecutor<Resource> {
    @Query("select res from Role role,Resource res,RoleResource rr where " +
            "role.id=rr.roleId and res.id=rr.resId and role.id=?1")
    List<Resource> listRoleResource(int roleId);
}
