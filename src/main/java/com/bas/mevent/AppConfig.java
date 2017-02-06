package com.bas.mevent;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("com.bas.mevent*")
@EnableAsync
@EnableScheduling
@Configuration
public class AppConfig {

	
	
}
