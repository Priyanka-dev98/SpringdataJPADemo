package com.example.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	@Bean
	public DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();

	 

	dataSource.setDriverClassName("org.elasticsearch.xpack.sql.jdbc.EsDriver");
	//dataSource.setUsername("root");
	//dataSource.setPassword("root");
	dataSource.setUrl("localhost:9200");

	return dataSource;
	}

}
