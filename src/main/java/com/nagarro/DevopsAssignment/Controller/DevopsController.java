package com.nagarro.DevopsAssignment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

	@GetMapping("/home")
	public String myhome() {
		return "this is home";
	}
  

}
