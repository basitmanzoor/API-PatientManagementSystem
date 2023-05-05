package com.example.HPManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepo {
    //this is a class that will contain the Database(HashMap, MySQL)
    HashMap<Integer, Nurse> nurseDb = new HashMap<>();

    public String addNurse(Nurse nurse){
        int key = nurse.getNurseId();
        nurseDb.put(key, nurse);

        return "Nurse added successfully";
    }

    public List<Nurse> getAllNurses(){
        return nurseDb.values().stream().toList();
    }
}
