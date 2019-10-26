package com.icss.springbootsecurityjwt.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 权限表
 */
@Table(name = "t_privilege")
@Data
public class SysPrivilege implements Serializable {
	private static final long serialVersionUID = 6315662516417216377L;
	/*** 权限ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	/*** 权限名称*/
	@Column(name = "privilege_name")
	private String privilegeName;
	/*** 权限URL*/
	@Column(name = "privilege_url")
	private String privilegeUrl;


}
