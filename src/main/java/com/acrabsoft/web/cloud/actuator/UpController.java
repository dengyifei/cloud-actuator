package com.acrabsoft.web.cloud.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpController {
	
	@Autowired
	private MyHealthChecker myHealthChecker;
	@RequestMapping("/")
    public String home() {
        return "Hello world";
    }
	@RequestMapping("/up")
    public String up(@RequestParam("up") Boolean up) {
        myHealthChecker.setUp(up);
 
        return up.toString();
    }
}
