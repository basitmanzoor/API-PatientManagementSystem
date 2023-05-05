package com.example.HPManagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NurseService {

    NurseRepo nurseRepo = new NurseRepo();
    public String addNurse(Nurse nurse){

        //we should write the logic
        //Logic and validations
        if(nurse.getNurseId()<0){
            return "Enter valid Nurse ID";
        }

        if(nurse.getName().equals(null)){
            return "Name should not be null";
        }

        //saving it to the database
        String ans = nurseRepo.addNurse(nurse);
        return ans;
    }

    public List<Nurse> getList(int age){
        //calling all the nurses from the database
        List<Nurse> nurses = nurseRepo.getAllNurses();

        //now writing the logic to extract required
        List<Nurse> finalList = new ArrayList<>();
        for(Nurse nurse: nurses){
            if(nurse.getAge()  > age){
                finalList.add(nurse);
            }
        }
        return finalList;
    }

    public List<Nurse> getListWithQual(String qualification){
        List<Nurse> nursesQua = nurseRepo.getAllNurses();

        List<Nurse> finalListAns = new ArrayList<>();
        for(Nurse nurse: nursesQua){
            if(nurse.getQualification().equals(qualification)){
                finalListAns.add(nurse);
            }
        }
        return finalListAns;
    }
}
