package com.accolite.dashboard.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author rashika.devadiga
 *
 */
@Configuration
@ComponentScan(basePackageClasses={com.accolite.dashboard.rest.PackageInfo.class, PackageInfo.class, com.accolite.dashboard.dto.mapper.PackageInfo.class})
@EnableJpaRepositories(basePackageClasses={com.accolite.dashboard.repository.PackageInfo.class})
@EntityScan(basePackageClasses={com.accolite.dashboard.entity.PackageInfo.class})
@PropertySource("classpath:application.properties")
public class AppConfig {		

}
