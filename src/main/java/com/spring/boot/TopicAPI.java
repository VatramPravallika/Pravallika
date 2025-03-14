package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class TopicAPI {

	public static void main(String[] args) {
		Log.info("started");
		SpringApplication.run(TopicAPI.class, args);
		Log.info("ended Here :)");
	}

}
