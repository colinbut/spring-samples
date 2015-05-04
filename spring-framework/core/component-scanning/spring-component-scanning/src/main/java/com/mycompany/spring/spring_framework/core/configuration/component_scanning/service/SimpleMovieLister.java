/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.component_scanning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.spring.spring_framework.core.configuration.component_scanning.dao.MovieFinder;

/**
 * @author colin
 *
 */
@Service
public class SimpleMovieLister {

	private MovieFinder movieFinder;
	
	@Autowired
	public SimpleMovieLister(MovieFinder movieFinder){
		this.movieFinder = movieFinder;
	}
}
