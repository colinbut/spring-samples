/**
 * 
 */
package com.mycompany.spring.spring_framework.core.autowiring;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author colin
 *
 */
@Component
public class MovieRecommender {

	@Autowired
	private MovieCatalog movieCatalog;
	
	
	public Movie recommendMovie(){
		
		Movie movie = null;
		
		int random = new Random().nextInt(movieCatalog.getMovies().length - 1);
		
		movie = movieCatalog.getMovies()[random];
		
		return movie;
		
	}
}
