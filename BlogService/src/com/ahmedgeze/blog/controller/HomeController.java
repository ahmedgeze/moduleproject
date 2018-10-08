package com.ahmedgeze.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ahmedgeze.blog.returnxyz.*;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String home(){
		int a= math.sum(5,4);
		String json="{aaaaaa}"+a;

		return json;	
	}

}
