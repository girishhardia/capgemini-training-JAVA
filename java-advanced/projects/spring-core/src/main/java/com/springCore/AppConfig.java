package com.springCore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springCore")
public class AppConfig {
    // This class sets up the Spring context using component scanning
}
