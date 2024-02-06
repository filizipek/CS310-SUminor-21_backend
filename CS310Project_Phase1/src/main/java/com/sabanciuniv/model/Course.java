package com.sabanciuniv.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


@Document
public class Course {
	
	@Id
	private String id;
	
	private String program;
	private String code;
	private String type;
	
	public Course() {
		// TODO Auto-Generated Constructor Stub
	}
	
	public Course(String program, String code, String type) {
		super();
		this.program = program;
		this.code = code;
		this.type = type;
	}
	
	public Course(String id, String program, String code, String type) {
		super();
		this.id = id;
		this.program = program;
		this.code = code;
		this.type = type;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Course other = (Course) obj;
        return program.equals(other.program) && code.equals(other.code) && type.equals(other.type);
    }
	
	public String getId() {
		return this.id;
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
	
	public void setId(String id) {
		this.id = id;
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
