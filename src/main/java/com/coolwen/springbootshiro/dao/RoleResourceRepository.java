package com.coolwen.springbootshiro.dao;

import com.coolwen.springbootshiro.dao.basedao.BaseRepository;
import com.coolwen.springbootshiro.model.Resource;
import com.coolwen.springbootshiro.model.RoleResource;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author CoolWen
 * @version 2018-11-02 10:15
 */
public interface RoleResourceRepository extends BaseRepository<RoleResource, Integer>, JpaSpecificationExecutor<RoleResource> {
    RoleResource findByRoleIdAndResId(int roleId, int resId);
}
