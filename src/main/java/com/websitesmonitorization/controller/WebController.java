package com.websitesmonitorization.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebController {

	@GetMapping(value = "/{id}")
	public ResponseEntity<String> getWebById(@PathVariable int id) {

		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}
