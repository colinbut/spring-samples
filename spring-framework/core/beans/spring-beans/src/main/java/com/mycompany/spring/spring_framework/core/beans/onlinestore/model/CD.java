/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans.onlinestore.model;

/**
 * A CD
 * 
 * @author colin
 *
 */
public class CD {

	private String title;
	private int noOfTracks;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @return the noOfTracks
	 */
	public int getNoOfTracks() {
		return noOfTracks;
	}
	
	/**
	 * @param noOfTracks the noOfTracks to set
	 */
	public void setNoOfTracks(int noOfTracks) {
		this.noOfTracks = noOfTracks;
	}
}
