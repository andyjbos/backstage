package com.yxf.backstage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 实例类
 * @author win
 */
@Data
@AllArgsConstructor
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
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
