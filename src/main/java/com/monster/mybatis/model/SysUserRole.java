package com.monster.mybatis.model;

/**
 * 用户角色关联表
 * @Author wuhan
 * @Date 2019/12/5 16:33
 */
public class SysUserRole {

    private Long userId;

    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
