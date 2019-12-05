package com.monster.mybatis.mapper;

import com.monster.mybatis.model.SysUser;

import java.util.List;

/**
 * @Author wuhan
 * @Date 2019/12/5 16:56
 */
public interface UserMapper {

    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    SysUser selectById(Long id);

    List<SysUser> selectAll();
}
