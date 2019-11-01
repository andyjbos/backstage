package com.yxf.backstage.service;

import java.util.List;

import com.yxf.backstage.domain.Multilingual;

public interface MultilingualService {
	
	List<Multilingual> queryLanguagesByKey(String code,String key);
	
	List<Multilingual> queryAllLanguageType();
}
