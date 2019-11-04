package com.yxf.backstage.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yxf.backstage.plugins.google.GoogleTranslate;
import com.yxf.backstage.service.GoogleTransferService;

@Service
public class GoogleTransferServiceImpl implements GoogleTransferService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GoogleTransferServiceImpl.class);
	
	Map<String, String>  result = new HashMap<String, String>(16);
	@Override
	public Map<String, String> getGoogleLanguage(String text, String targetLang) {
		GoogleTranslate translate = GoogleTranslate.getInstance();
		String targetText = null;
		try {
			targetText = translate.translateText(text, "auto", targetLang);
			result.put("sourceText", text);
			result.put("targetText", targetText);
		} catch (Exception e) {
			LOGGER.info("翻译失败：源文本={},目标语言={}", text,targetLang);
			e.printStackTrace();
		}
		return result;
	}

}
