package com.bruce.carmanager.common.enums;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:09
 */
public enum RoleEnum {
    USER("user", "普通用户"),
    ADMIN("admin", "管理员");

    private String roleId;

    private String roleName;

    RoleEnum(String roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
