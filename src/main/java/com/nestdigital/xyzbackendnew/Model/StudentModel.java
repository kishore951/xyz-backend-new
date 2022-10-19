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
    private String Name;
    private int RollNo;
    private int AdmissionNo;
    private String College;
    private String department;
    private String BloodGroup;
    private int DOB;
    private String ParentName;
    private String ParentEmailId;
    private String GuardianAddress;


    public StudentModel(int id, String name, int rollNo, int admissionNo, String college, String department, String bloodGroup, int DOB, String parentName, String parentEmailId, String guardianAddress) {
        this.id = id;
        Name = name;
        RollNo = rollNo;
        AdmissionNo = admissionNo;
        College = college;
        this.department = department;
        BloodGroup = bloodGroup;
        this.DOB = DOB;
        ParentName = parentName;
        ParentEmailId = parentEmailId;
        GuardianAddress = guardianAddress;
    }

    public StudentModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public int getAdmissionNo() {
        return AdmissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        AdmissionNo = admissionNo;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public String getParentEmailId() {
        return ParentEmailId;
    }

    public void setParentEmailId(String parentEmailId) {
        ParentEmailId = parentEmailId;
    }

    public String getGuardianAddress() {
        return GuardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        GuardianAddress = guardianAddress;
    }
}
