package com.example.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LogTest {

	static final Logger logger = LoggerFactory.getLogger(LogTest.class);


	@RequestMapping(value = "/test")
	public String test() throws Exception{
		
		logger.trace("trace Level �׽�Ʈ");
		logger.debug("debug level �׽�Ʈ");
		logger.info("info level �׽�Ʈ ");
		logger.warn("warn level �׽�Ʈ");
		logger.error("error level �׽�Ʈ");
		
		return "�α��Դϴ�";
		
		
	}

}