package com.example.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.poc.service.SMCPAsynService;

@Controller
@RequestMapping("smcp")
public class SMCPController {
	
	@Autowired
	private SMCPAsynService smcpAsyncService;
	
	@GetMapping("byName/{name}")
	public List<SMCPProfile> getSMCPVersionInfo(@PathVariable("name")  String name) {
		List<SMCPProfile> smcpProfiles = smcpAsyncService.
		
				
		return smcpProfiles;
	}

}
