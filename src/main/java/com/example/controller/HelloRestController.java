package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hi")
public class HelloRestController {
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Map<String, Object> printWelcome() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", "hyeonjae");
        result.put("age", 29);
		return result;
	}
}
