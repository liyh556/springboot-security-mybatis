package com.icss.springbootsecurityjwt.model;

import com.icss.springbootsecurityjwt.type.Enabled;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 角色表
 */
@Table(name = "t_role")
@Data
public class SysRole implements Serializable {
	private static final long serialVersionUID = 6320941908222932112L;
	/*** 角色ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	/*** 角色名*/
	@Column(name = "role_name")
	private String roleName;
	/*** 有效标志*/
	@Column(name = "enabled")
	private Enabled enabled;



}
