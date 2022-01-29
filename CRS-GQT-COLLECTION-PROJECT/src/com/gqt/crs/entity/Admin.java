/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author MD Ashraff
 *
 */
public class Admin {
	private int admin_id;
	private int admin_pwd;
	/**
	 * @param admin_id
	 * @param admin_pwd
	 */
	public Admin(int admin_id, int admin_pwd) {
		super();
		this.admin_id = admin_id;
		this.admin_pwd = admin_pwd;
	}
	/**
	 * @return the admin_id
	 */
	public int getAdmin_id() {
		return admin_id;
	}
	/**
	 * @return the admin_pwd
	 */
	public int getAdmin_pwd() {
		return admin_pwd;
	}
	/**
	 * @param admin_id the admin_id to set
	 */
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	/**
	 * @param admin_pwd the admin_pwd to set
	 */
	public void setAdmin_pwd(int admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	
	

}
