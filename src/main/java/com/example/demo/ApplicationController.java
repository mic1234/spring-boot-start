package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public @ResponseBody String home() {
		return "Hello World!";
	}
	
	@RequestMapping(value="/endpoint2", method = RequestMethod.GET)
	public @ResponseBody String endpoint2() {
		return "endpoint2";
	}
}
