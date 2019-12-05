package com.monster.mybatis.model;

/**
 * 角色权限关联表
 * @Author wuhan
 * @Date 2019/12/5 16:34
 */
public class SysRolePrivilege {

    /**
     * 角色ID
     */
    private Long role_id;

    /**
     * 权限ID
     */
    private Long privilege_id;

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public Long getPrivilege_id() {
        return privilege_id;
    }

    public void setPrivilege_id(Long privilege_id) {
        this.privilege_id = privilege_id;
    }
}
