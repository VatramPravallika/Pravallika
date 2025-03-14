package com.spring.boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jdk.internal.org.jline.utils.Log;
//import lombok.Value;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Repository
@PropertySource("classpath:database.properties")
public class SpringDAO {

	@Autowired
	@Qualifier("traningJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	@Value("${SelectCount}")
	private String InfoCount;
	public int select() {
		Log.info("Select method started");
		int count = jdbcTemplate.queryForObject("select count(*) from employee", Integer.class);
		Log.info("Select method ended by returning"+count);
		return count;
	}

}
