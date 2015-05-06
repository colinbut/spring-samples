/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * A video game
 * 
 * @author colin
 *
 */
public class VideoGame {
	
	private String name;
	private int numberOfPlayers;
	private int releaseYear;
	private String publisher;
	private VideoGameDeveloper videoGameDeveloper;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the numberOfPlayers
	 */
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	/**
	 * @param numberOfPlayers the numberOfPlayers to set
	 */
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}
	
	/**
	 * @param releaseYear the releaseYear to set
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	/**
	 * @return the videoGameDeveloper
	 */
	public VideoGameDeveloper getVideoGameDeveloper() {
		return videoGameDeveloper;
	}
	
	/**
	 * @param videoGameDeveloper the videoGameDeveloper to set
	 */
	public void setVideoGameDeveloper(VideoGameDeveloper videoGameDeveloper) {
		this.videoGameDeveloper = videoGameDeveloper;
	}
	
}
