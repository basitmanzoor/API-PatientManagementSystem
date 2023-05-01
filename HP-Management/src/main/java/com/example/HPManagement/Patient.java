package com.example.HPManagement;

public class Patient {
    private int patientId;
    private String name;
    private int wardNumber;
    private String address;
    private String disease;
    private int age;

    public Patient(int patientId, String name, int wardNumber, String address, String disease, int age) {
        this.patientId = patientId;
        this.name = name;
        this.wardNumber = wardNumber;
        this.address = address;
        this.disease = disease;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDisease() {
        return disease;
    }

    public int getAge() {
        return age;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
