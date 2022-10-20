package com.nestdigital.xyzbackendnew.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private int rollNo;
    private int admissionNo;
    private String college;
    private String department;
    private String bloodGroup;
    private String dOB;
    private String parentName;
    private String parentEmailId;
    private String guardianAddress;

    public StudentModel() {
    }

    public StudentModel(int id, String name, int rollNo, int admissionNo, String college, String department, String bloodGroup, String dOB, String parentName, String parentEmailId, String guardianAddress) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.admissionNo = admissionNo;
        this.college = college;
        this.department = department;
        this.bloodGroup = bloodGroup;
        this.dOB = dOB;
        this.parentName = parentName;
        this.parentEmailId = parentEmailId;
        this.guardianAddress = guardianAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmailId() {
        return parentEmailId;
    }

    public void setParentEmailId(String parentEmailId) {
        this.parentEmailId = parentEmailId;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }
}
