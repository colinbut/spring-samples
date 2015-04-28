/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * @author colin
 *
 */
public class MusicCD {

	private Artist artist;
	private int numberOfTracks;
	private String[] tracks;
	private String album;
	
	/**
	 * Constructor
	 * 
	 * @param artist
	 * @param numberOfTracks
	 * @param tracks
	 * @param album
	 */
	public MusicCD(Artist artist, int numberOfTracks, String[] tracks,
			String album) {
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
		this.tracks = tracks;
		this.album = album;
	}
	
	
}
