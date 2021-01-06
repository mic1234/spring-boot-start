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
		String s = "endpoint2";
		return s;
	}

	@RequestMapping(value="/endpoint3", method = RequestMethod.GET)
	public @ResponseBody String endpoint3() {
		String s = "endpoint3";
		return s;
	}

	@RequestMapping(value="/endpoint4", method = RequestMethod.GET)
	public @ResponseBody String endpoint4() {
		String s = "endpoint4";
		return s;
	}
}
