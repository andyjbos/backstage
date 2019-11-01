package com.yxf.backstage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Google plugins controller
 * @author win
 */
@RestController
@RequestMapping("/google")
public class GooglController {
	
	@RequestMapping("/transfre")
	public String transfer() {
		return "google";
	}
}
