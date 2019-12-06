package com.monster.mybatis.mapper;

import com.monster.mybatis.model.SysRole;
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

    /**
     * 根据用户id获取角色信息
     */
    List<SysRole> selectRoleByUserId(Long userId);

    /**
     * 新增用户
     */
    int insert(SysUser sysUser);

    /**
     * 新增用户-主键自增
     * @param sysUser
     * @return
     */
    int autoGenerateInsert(SysUser sysUser);

    /**
     * 新增用户-使用selectKey方式
     * @param sysUser
     * @return
     */
    int selectKeyInsert(SysUser sysUser);

    /**
     * 根据主键更新
     *
     * @param sysUser
     * @return
     */
    int updateById(SysUser sysUser);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteById(Long id);
}
