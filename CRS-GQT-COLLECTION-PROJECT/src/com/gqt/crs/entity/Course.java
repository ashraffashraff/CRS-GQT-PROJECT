/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author MD Ashraff
 *
 */
public class Course {
	private int course_id;
	private String course_name;
	private int duration;
	private int fee;
	/**
	 * @param course_id
	 * @param course_name
	 * @param duration
	 * @param fee
	 */
	public Course(int course_id, String course_name, int duration, int fee) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.duration = duration;
		this.fee = fee;
	}
	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	/**
	 * @param course_name the course_name to set
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}
	/**
	 * @return the course_id
	 */
	public int getCourse_id() {
		return course_id;
	}
	/**
	 * @return the course_name
	 */
	public String getCourse_name() {
		return course_name;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @return the fee
	 */
	public int getFee() {
		return fee;
	}
	
	
}
