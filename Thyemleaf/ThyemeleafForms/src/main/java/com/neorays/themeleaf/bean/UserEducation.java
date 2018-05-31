package com.neorays.themeleaf.bean;

import java.util.Arrays;

public class UserEducation {
	private String[] classX;
	private String[] classX1;
	private String[] graduation;
	private String[] masters;
	public String[] getClassX() {
		return classX;
	}
	public void setClassX(String[] classX) {
		System.out.println("Edu Setters");
		this.classX = classX;
		
	}
	public String[] getClassX1() {
		return classX1;
	}
	public void setClassX1(String[] classX1) {
		this.classX1 = classX1;
	}
	public String[] getGraduation() {
		return graduation;
	}
	public void setGraduation(String[] graduation) {
		this.graduation = graduation;
	}
	public String[] getMasters() {
		return masters;
	}
	public void setMasters(String[] masters) {
		this.masters = masters;
	}
	@Override
	public String toString() {
		return "UserEducation [classX=" + Arrays.toString(classX)
				+ ", classX1=" + Arrays.toString(classX1) + ", graduation="
				+ Arrays.toString(graduation) + ", masters="
				+ Arrays.toString(masters) + "]";
	}
	public UserEducation() {
		// TODO Auto-generated constructor stub
		System.out.println("Education");
	}
	
}
