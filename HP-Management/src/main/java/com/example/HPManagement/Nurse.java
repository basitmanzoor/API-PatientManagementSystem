package com.example.HPManagement;

public class Nurse {

    private int nurseId;
    private String name;
    private int age;
    private String qualification;

    public Nurse(int nurseId, String name, int age, String qualification) {
        this.nurseId = nurseId;
        this.name = name;
        this.age = age;
        this.qualification = qualification;
    }

    public int getNurseId() {
        return nurseId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
