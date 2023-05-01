package com.example.HPManagement;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

@RestController
public class PatientController {

    HashMap<Integer, Patient> hm = new HashMap<>();

    @PostMapping("/addPatientViaParameters")
    public String addPatient(@RequestParam("patientId") Integer patientId, @RequestParam("name") String name,
                             @RequestParam("wardNumber") Integer wardNumber,@RequestParam("address") String address,
                             @RequestParam("disease") String disease, @RequestParam("age") Integer age){
        Patient patient = new Patient(patientId, name, wardNumber, address,disease,age);
        hm.put(patientId, patient);

        return "Patient added successfully";
    }
    @PostMapping("/addPatientViaRequestBody")
    public String addPatient(@RequestBody Patient patient){
        int key = patient.getPatientId();
        hm.put(key, patient);

        return "Patient added via Request body";
    }

    @GetMapping("/getPatientInfo")
    public Patient getPatient(@RequestParam("patientId") Integer patientId){
        Patient patient = hm.get(patientId);

        return patient;
    }

    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients(){
        List<Patient> patients = new ArrayList<>();

        for(Patient p : hm.values()){
            patients.add(p);
        }
        return patients;
    }

    @GetMapping("/getPatientByName")
    public Patient getPatientByName(@RequestParam("name") String name){
        for(Patient p: hm.values()){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    @GetMapping("/getPatientsGreaterThanAge")
    public List<Patient> getPatientsGreaterThanAge(@RequestParam("age") Integer age){

        List<Patient> patients = new ArrayList<>();

        for(Patient p: hm.values()){
            if(p.getAge() > age){
                patients.add(p);
            }
        }
        return patients;
    }


}
