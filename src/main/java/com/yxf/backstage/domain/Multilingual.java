package com.yxf.backstage.domain;

import lombok.Data;

@Data
public class Multilingual extends ParentUtils {

	private static final long serialVersionUID = -4010451258651702436L;
	
	private Long id;
	private String languageCode;
	private String languageKey;
	private String languageText;
	private int sort;
	private String description;

}
