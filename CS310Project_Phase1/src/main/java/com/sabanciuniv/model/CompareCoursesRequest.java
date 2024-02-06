package com.sabanciuniv.model;

public class CompareCoursesRequest {
    private String program1;
    private String code1;
    private String type1;

    private String program2;
    private String code2;
    private String type2;

    // Constructors
    public CompareCoursesRequest() {
    }

    public CompareCoursesRequest(String program1, String code1, String type1, String program2, String code2, String type2) {
        this.program1 = program1;
        this.code1 = code1;
        this.type1 = type1;
        this.program2 = program2;
        this.code2 = code2;
        this.type2 = type2;
    }

    // Getters and Setters

    public String getProgram1() {
        return program1;
    }

    public void setProgram1(String program1) {
        this.program1 = program1;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getProgram2() {
        return program2;
    }

    public void setProgram2(String program2) {
        this.program2 = program2;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }
}
