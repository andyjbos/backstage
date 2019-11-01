package com.yxf.backstage.domain;

import java.util.Date;

import lombok.Data;

/**
 * 实例类
 * @author win
 */
@Data
public class Users {
	private Long id;
	private String userName;
	private String nickName;
	private String password; 
	private String idCard;
	private String phone;
	private String tel;
	private String postalCode;
	private Date createTime;
	private String createBy;
	private Date updateTime;
	private String updateBy;
}
