package com.coolwen.springbootshiro.dao;

import com.coolwen.springbootshiro.dao.basedao.BaseRepository;
import com.coolwen.springbootshiro.model.Resource;
import com.coolwen.springbootshiro.model.UserRole;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author CoolWen
 * @version 2018-10-31 8:25
 */

public interface UserRoleRepository extends BaseRepository<UserRole, Integer>, JpaSpecificationExecutor<UserRole> {

    UserRole findByUserIdAndRoleId(int uid, int roleId);

    //    @Modifying
//    @Query("delete from UserRole where userId=?1")
    @Transactional
    public void deleteByUserId(int uid);
    //    @Modifying
}
