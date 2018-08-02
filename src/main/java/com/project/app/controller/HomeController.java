package com.project.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.profiles.EvnBasedConfig;
import com.project.app.whitelabel.Error;

@RestController
public class HomeController implements ErrorController {

	@Value(value = "${welcome.message}")
	private String message;
	
	@Autowired
	private EvnBasedConfig envBasedConfig; 
	
	@GetMapping("/")
	public String welcome() {
		envBasedConfig.setup();
		return message;
	}
	
	
	@GetMapping("/error")
	public ResponseEntity<Error> error() {
		Error er = new Error();
		er.setMessage("Resource Not found!!!!");
		er.setStatus("Not Found ");
		return new ResponseEntity<Error>(er, HttpStatus.BAD_REQUEST);
	}

	
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}
}
