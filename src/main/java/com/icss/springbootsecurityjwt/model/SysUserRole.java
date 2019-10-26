package com.icss.springbootsecurityjwt.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户角色关联表
 */
@Table(name = "t_user_role_mapping")
@Data
public class SysUserRole {
	/*** 用户ID*/
	@Id
	@Column(name = "user_id")
	private Long userId;
	/*** 角色ID*/
	@Id
	@Column(name = "role_id")
	private Long roleId;


}
