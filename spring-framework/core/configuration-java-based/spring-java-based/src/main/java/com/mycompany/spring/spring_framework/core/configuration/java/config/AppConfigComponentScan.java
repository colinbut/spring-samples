/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.java.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author colin
 *
 */
@Component
//component scan for classes annotated with @Component, @Service, @Repository, etc...
@ComponentScan(basePackages = "com.mycompany") 
public class AppConfigComponentScan {

	// no need to declare bean definitions with @Bean annotation
}
