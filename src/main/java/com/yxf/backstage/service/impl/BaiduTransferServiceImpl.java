package com.yxf.backstage.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yxf.backstage.plugins.baidu.TransApi;
import com.yxf.backstage.service.BaiduTransferService;

@Service
public class BaiduTransferServiceImpl implements BaiduTransferService {
	
	private static final String APP_ID = "20191030000349230";
	private static final String SECURITY_KEY = "fAwEZUjRMH4XiI_dhot2";
	
	Map<String, String> resultMap = new HashMap<String,String>();
	@Override
	public Map<String, String> getBaiduLanguages(String text, String targetLang) {
		TransApi api = new TransApi(APP_ID, SECURITY_KEY);
		String targetText = api.getTransResult(text, "auto", targetLang);
		resultMap.put("sourceText", text);
		resultMap.put("targetText", targetText);
		return resultMap;
	}
	
}
