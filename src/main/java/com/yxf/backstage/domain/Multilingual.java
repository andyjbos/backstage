package com.yxf.backstage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class Multilingual extends ParentUtils {

	private static final long serialVersionUID = -4010451258651702436L;
	
	private Long id;
	private String languageCode;
	private String languageKey;
	private String languageText;
	private int sort;
	private String description;

}
