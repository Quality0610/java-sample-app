package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.model.response.HogeResponse;
import com.example.demo.domain.model.FindHogeInput;
import com.example.demo.domain.model.FindHogeOutput;
import com.example.demo.service.HogeService;

@RestController
@RequestMapping("/api/users")
public class Sample1Controller {
	
	@Autowired
	HogeService hogeService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<HogeResponse> getHoge(@PathVariable("id") String id){
		
		FindHogeInput findHogeInput = new FindHogeInput(id);
		
		FindHogeOutput findHoge = hogeService.findHoge(findHogeInput);
		return new ResponseEntity<>(hoge, new HttpHeaders(), HttpStatus.OK);
		
	}
}
