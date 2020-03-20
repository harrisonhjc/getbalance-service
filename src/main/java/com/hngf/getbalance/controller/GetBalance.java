package com.hngf.getbalance.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBalance {

	@GetMapping("/getbalance")
    public Map<String, Object> getRequest() {
		Map<String, Object> data = new HashMap<>();
        data.put("balance", "2000");
        data.put("date", new Date());
        return data;
    }
	
	
}
