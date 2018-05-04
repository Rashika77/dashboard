package com.accolite.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.accolite.dashboard.config.AppConfig;

/**
 * 
 * @author rashika.devadiga
 *
 */
@SpringBootApplication
@Import(AppConfig.class)
public class DashboardApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(DashboardApplicationRunner.class, args);
	}
}
