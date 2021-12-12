package com.jhengtom.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xd_to
 *
 */
@Controller
public class initController {

	@ResponseBody
	@RequestMapping("/info")
	public String init() {
		return "hello init....";
	}
}
