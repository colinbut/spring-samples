package com.mycompany.spring.spring_framework.core.beans.admin;

/**
 * AdminUser
 * 
 * @author colin
 *
 */
public class AdminUser {

	private String name;
	
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
	 * AdminUserBuilder
	 * 
	 * @author colin
	 *
	 */
	static class AdminUserBuilder{
		
		private String name;

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
		
		public AdminUser buildAdminUser(){
			return new AdminUser();
		}
		
	}
}
