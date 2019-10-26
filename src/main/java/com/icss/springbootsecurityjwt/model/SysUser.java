package com.icss.springbootsecurityjwt.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 用户表
 */
@Table(name = "t_user")
@Data
public class SysUser  extends BaseModel implements Serializable {
	private static final long serialVersionUID = -328602757171077630L;
	/**
	 * 用户ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	/*** 用户名*/
	@Column(name = "user_name")
	private String userName;
	/*** 密码*/
	@Column(name = "pass_word")
	private String password;
	/**手机号*/
	@Column(name = "phone")
	private String phone;
	/***创建时间*/
	@Column(name = "create_time")
	private Date createTime;
	/***用户登录凭证*/
	@Column(name = "token")
	private String token;



	/***用户的角色集合*/
	@Transient
	private List<SysRole> roleList;

	public SysUser() {

	}
    public SysUser(String userName) {
    	this.userName = userName;
    }


}
