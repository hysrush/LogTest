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
		
		logger.trace("trace Level 테스트");
		logger.debug("debug level 테스트");
		logger.info("info level 테스트 ");
		logger.warn("warn level 테스트");
		logger.error("error level 테스트");
		
		return "로그입니다";
		
		
	}

}
