package com.sample.sampledata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	@Autowired
	Rep r;
	@GetMapping("/all")
	public List<Tab> t() {
		return r.findAll();
	}
	@GetMapping("/tt")
	public List<Tab> t() {
		return r.findAll();
	}
	
}
