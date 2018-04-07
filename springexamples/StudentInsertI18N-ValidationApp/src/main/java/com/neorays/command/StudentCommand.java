package com.neorays.command;

import org.hibernate.validator.constraints.NotEmpty;


public class StudentCommand {

	//@NotEmpty(message="id is required")
	Integer id;
	@NotEmpty(message="name is required")
	String name;
	@NotEmpty(message="address is required")
	String add;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "StudentCommand [id=" + id + ", name=" + name + ", add=" + add
				+ "]";
	}
	
	
}
