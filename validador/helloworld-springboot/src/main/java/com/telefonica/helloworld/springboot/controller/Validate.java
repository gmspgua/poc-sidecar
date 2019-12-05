package com.telefonica.helloworld.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/validate")
@CrossOrigin(origins = "*")
public class Validate {
	
	
	@GetMapping(value = "/apikey")
	public ResponseEntity<?> validateByApikey(@RequestParam("apikey") String apikey) {
		if(apikey.equals("f3e8970809d9c296429ad965d4e00d28")) {
			return ResponseEntity.ok().body("Usuario Permitido");
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Forbidden");		
	}
}
