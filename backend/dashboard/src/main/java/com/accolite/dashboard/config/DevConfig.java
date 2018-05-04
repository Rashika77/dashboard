package com.accolite.dashboard.config;


import javax.sql.DataSource;

import org.h2.Driver;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * 
 * @author rashika.devadiga
 *
 */
public class DevConfig {

	@Bean
	@Profile("dev-postgres")
	public DataSource dataSource() {
		return DataSourceBuilder.create().driverClassName(org.postgresql.Driver.class.getName()).username("postgres")
				.password("admin").url("jdbc:postgresql://localhost:5433/dashboard").build();
	}

	@Bean
	@Profile("dev-h2")
	public DataSource dataSource2() {
		return DataSourceBuilder.create().driverClassName(Driver.class.getName())
				.url("jdbc:h2:mem:accolite-apps;INIT=create schema if not exists dashboard;").build();
	}

}
