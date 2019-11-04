package com.yxf.backstage.service;

import java.util.Map;

public interface BaiduTransferService {
	Map<String,String> getBaiduLanguages(String text,String targetLang);
}
