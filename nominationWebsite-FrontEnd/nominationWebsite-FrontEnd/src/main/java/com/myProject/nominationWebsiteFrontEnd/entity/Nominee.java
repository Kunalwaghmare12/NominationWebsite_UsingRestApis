package com.myProject.nominationWebsiteFrontEnd.entity;

public class Nominee {
	private String id;
	private String name;
	private String sex;
	private String activity;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public Nominee(String id, String name, String sex, String activity) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.activity = activity;
	}
	public Nominee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Nominee [id=" + id + ", name=" + name + ", sex=" + sex + ", activity=" + activity + "]";
	}
	
}