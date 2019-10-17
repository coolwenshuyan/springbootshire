package com.coolwen.springbootshiro.dao;

import com.coolwen.springbootshiro.model.Role;
import com.coolwen.springbootshiro.dao.basedao.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author CoolWen
 * @version 2018-10-31 8:25
 */
public interface RoleRepository extends BaseRepository<Role, Integer>,  JpaSpecificationExecutor<Role> {
}
