/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author MD Ashraff
 *
 */
public class student {
	private int student_id;
	private String student_name;
	private int student_email;
	private int student_password;
	/**
	 * @param student_id
	 * @param student_name
	 * @param student_email
	 * @param student_password
	 */
	public student(int student_id, String student_name, int student_email, int student_password) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_password = student_password;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @param student_email the student_email to set
	 */
	public void setStudent_email(int student_email) {
		this.student_email = student_email;
	}
	/**
	 * @param student_password the student_password to set
	 */
	public void setStudent_password(int student_password) {
		this.student_password = student_password;
	}
	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @return the student_email
	 */
	public int getStudent_email() {
		return student_email;
	}
	/**
	 * @return the student_password
	 */
	public int getStudent_password() {
		return student_password;
	}
	
	
}
