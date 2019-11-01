package com.yxf.backstage.domain;

import lombok.Data;

/**
 * 实例类
 * @author win
 */
@Data
public class Users extends ParentUtils {
	private static final long serialVersionUID = 5791529580133167492L;
	private Long id;
	private String userName;
	private String nickName;
	private String password; 
	private String idCard;
	private String phone;
	private String tel;
	private String postalCode;
}
