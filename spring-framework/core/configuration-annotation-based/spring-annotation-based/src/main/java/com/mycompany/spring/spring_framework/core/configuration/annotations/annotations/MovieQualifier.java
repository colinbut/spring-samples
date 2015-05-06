/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

import com.mycompany.spring.spring_framework.core.configuration.annotations.model.Format;

/**
 * Annotation for specifying the movie Genre and (Media) Format
 * 
 * @author colin
 *
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MovieQualifier {

	String genre();
	
	Format format();
}
