package com.yxf.backstage.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ParentUtils implements Serializable{

	private static final long serialVersionUID = 2853707485325068148L;
	
	private Date createTime;
	private String createBy;
	private Date updateTime;
	private String updateBy;

}
