/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.spring.spring_framework.core.configuration.annotations.annotations.MovieQualifier;

/**
 * @author colin
 *
 */
public class GenreFormatMovieRecommender extends MovieRecommender {

	@Autowired
	@MovieQualifier(format=Format.VHS, genre="Action")
	private MovieCatalog actionVHSCatalog;
	
	@Autowired
	@MovieQualifier(format=Format.VHS, genre="Comedy")
	private MovieCatalog comedyVHSCatalog;
	
	@Autowired
	@MovieQualifier(format=Format.DVD, genre="Action")
	private MovieCatalog actionDVDCatalog;
	
	@Autowired
	@MovieQualifier(format=Format.BLURAY, genre="Comedy")
	private MovieCatalog comedyBluRayCatalog;
	
	// ...
	
	
}
