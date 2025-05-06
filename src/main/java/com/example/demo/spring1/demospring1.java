package com.example.demo.spring1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demospring1
{
	@RequestMapping("/test")
	public String test()
	{
		return "This is Test page";
	}
	
	
	@RequestMapping("/jenkins")
	public String jenkins()
	{
		return "This is Jenkins page";
	}
}
