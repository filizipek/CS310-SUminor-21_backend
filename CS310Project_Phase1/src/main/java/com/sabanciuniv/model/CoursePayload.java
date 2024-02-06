package com.sabanciuniv.model;

public class CoursePayload {
	private String program;
	private String code;
	private String type;
	
	public CoursePayload() {
		// TODO Auto-Generated Constructor Stub
	}
	
	public CoursePayload(String program, String code, String type) {
		super();
		this.program = program;
		this.code = code;
		this.type = type;
	}
	
	public String getProgram() {
		return this.program;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
