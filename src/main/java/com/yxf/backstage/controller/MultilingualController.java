package com.yxf.backstage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yxf.backstage.domain.Multilingual;
import com.yxf.backstage.service.MultilingualService;

@RestController
@RequestMapping("/language")
public class MultilingualController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MultilingualController.class);
	
	@Autowired
	private MultilingualService multilingualService;
	
	@GetMapping("/details")
	public String queryByLanguages(@RequestParam(name="code") String code,@RequestParam(name="key") String key) {
		LOGGER.info("收到的参数是：code={},key={}",code,key);
		List<Multilingual> lists = multilingualService.queryLanguagesByKey(code, key);
		return lists.toString();
	}
	
	@GetMapping("/types")
	public String queryAllLanguages() {
		List<Multilingual> lists = multilingualService.queryAllLanguageType();
		LOGGER.info("返回的参数是：param={}",lists.toString());
		return lists.toString();
	}
}
