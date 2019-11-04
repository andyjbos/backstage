package com.yxf.backstage.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yxf.backstage.service.GoogleTransferService;
/**
 * Google plugins controller
 * @author win
 */
@RestController
@RequestMapping("/google")
public class GooglController {
	
	@Autowired
	private GoogleTransferService googleTransferService;
	
	@PostMapping("/transfer")
	public Map<String,String> transfer(@RequestBody Map<String,String> languageMap) {
		return googleTransferService.getGoogleLanguage(languageMap.get("text"), languageMap.get("targetLang"));
	}
}
