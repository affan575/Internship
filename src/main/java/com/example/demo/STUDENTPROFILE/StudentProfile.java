package com.example.demo.STUDENTPROFILE;
public class StudentProfile {
    private String name;
    private Long studentid;
    private String branch;
    private String section;
    private String startingYear;
    private String collegeName;
    private String status;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(String startingYear) {
        this.startingYear = startingYear;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "name='" + name + '\'' +
                ", studentid=" + studentid +
                ", branch='" + branch + '\'' +
                ", section='" + section + '\'' +
                ", startingYear='" + startingYear + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}