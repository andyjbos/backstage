package com.yxf.backstage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Baidu plugins controller
 * @author win
 */
@RestController
@RequestMapping("/baidu")
public class BaiduController {
	
	@RequestMapping("/transfer")
	public String transfer() {
		return "baidu";
	}
}
