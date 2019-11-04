package com.yxf.backstage.service;

import java.util.Map;

public interface GoogleTransferService {
	Map<String,String> getGoogleLanguage(String text, String targetLang);
}
