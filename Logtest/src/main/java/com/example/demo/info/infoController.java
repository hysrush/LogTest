package com.example.demo.info;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.info.model.Project;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class infoController {

	@GetMapping("/info")
	public Object projectInfo() {
		log.debug("/info start");
		log.debug("info");
		Project project = new Project();
		project.projectName = "preword";
		project.author = "hello-bryan";
		project.createdDate = new Date();
		log.info("return {}", project.toString());		
		return project;
	}
}
