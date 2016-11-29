package me.gacl.web.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("index")
	public String index() {
		System.out.println("进入首页");
		return "index";
	}
}
