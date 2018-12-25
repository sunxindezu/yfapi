package com.sunxin.springboot.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SpringbootController {
	@RequestMapping("/hello")
	public String hello(Model m) {
		m.addAttribute("yes","优秀呢");
		return "hello";
	}
}
