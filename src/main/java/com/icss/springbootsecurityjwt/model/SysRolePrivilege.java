package com.icss.springbootsecurityjwt.model;

import lombok.Data;

import javax.persistence.*;

/**
 * 角色权限关联表
 */
@Table(name = "t_role_privilege_mapping")
@Data
public class SysRolePrivilege {
	/*** 角色ID*/
	@Id
	@Column(name = "role_id")
	private Long roleId;
	/*** 权限ID*/
	@Id
	@Column(name = "privilege_id")
	private Long privilegeId;


}
