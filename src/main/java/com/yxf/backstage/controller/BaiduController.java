package com.yxf.backstage.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yxf.backstage.service.BaiduTransferService;
/**
 * Baidu plugins controller
 * @author win
 */
@RestController
@RequestMapping("/baidu")
public class BaiduController {
	
	@Autowired
	private BaiduTransferService baiduTransferService;
	
	@PostMapping("/transfer")
	public Map<String,String> transfer(@RequestBody Map<String,String> langMap) {
		return baiduTransferService.getBaiduLanguages(langMap.get("text"), langMap.get("targetLang"));
	}
}
