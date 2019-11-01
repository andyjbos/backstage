package com.yxf.backstage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxf.backstage.dao.MultilingualDao;
import com.yxf.backstage.domain.Multilingual;
import com.yxf.backstage.service.MultilingualService;

@Service
public class MultilingualServiceImpl implements MultilingualService {
	
	@Autowired
	private MultilingualDao multilingualDao;
	
	@Override
	public List<Multilingual> queryLanguagesByKey(String code, String key) {
		return multilingualDao.queryLanguages(code, key);
	}

	@Override
	public List<Multilingual> queryAllLanguageType() {		
		return multilingualDao.queryAllLanguageType();
	}

}
