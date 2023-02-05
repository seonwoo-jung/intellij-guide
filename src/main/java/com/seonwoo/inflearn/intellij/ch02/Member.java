package com.seonwoo.inflearn.intellij.ch02;

public class Member {

	private Long id;
	private String course;

	public Member(Long id, String course) {
		this.id = id;
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
