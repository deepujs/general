package com.djs.controller;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
	Logger logger = LoggerFactory.getLogger(GeneralController.class);

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String currentTime() {
		String uid = UUID.randomUUID().toString();
		logger.info("currentTime with uid={}", uid);
		return uid +"_" + new Date();
	}
	
	@RequestMapping(value = "/showbody", method = RequestMethod.POST)
	public String showBody(String body) {
		logger.info("showBody={}", body);
		return body;
	}
}
