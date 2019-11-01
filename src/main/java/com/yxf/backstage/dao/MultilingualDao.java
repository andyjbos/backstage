package com.yxf.backstage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yxf.backstage.domain.Multilingual;

@Mapper
public interface MultilingualDao {
	
	@Select("select language_text as languageText from multilingual where 1=1 and language_code=#{code} and language_key=#{key} ORDER BY sort asc;")
	List<Multilingual> queryLanguages(@Param("code") String code,@Param("key") String key);
	
	@Select("select language_code as languageCode,language_text as languageText,sort from multilingual where 1=1 and language_key='com.yxf.language' ORDER BY sort asc")
	List<Multilingual> queryAllLanguageType();
}
