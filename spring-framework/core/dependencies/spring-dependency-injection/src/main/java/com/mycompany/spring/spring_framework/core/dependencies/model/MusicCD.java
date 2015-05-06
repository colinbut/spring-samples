/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * A music CD
 * 
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

	/**
	 * @return the artist
	 */
	public Artist getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param numberOfTracks the numberOfTracks to set
	 */
	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	/**
	 * @return the tracks
	 */
	public String[] getTracks() {
		return tracks;
	}

	/**
	 * @param tracks the tracks to set
	 */
	public void setTracks(String[] tracks) {
		this.tracks = tracks;
	}

	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}

	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
}
