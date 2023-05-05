package com.example.HPManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/nurse")

public class NurseController {

    NurseService nurseService = new NurseService();

    @PostMapping("/add")
    public String addNurse(@RequestBody Nurse nurse){
        String ans = nurseService.addNurse(nurse);

        return ans;
    }

    @GetMapping("/getList")
    public List<Nurse> getNurseGreaterThanAge(@RequestParam("age") Integer age){
        List<Nurse>  nurseList = nurseService.getList(age);
        return nurseList;
    }

    @GetMapping("/getQualification")
    public List<Nurse> getNurseQualification(@RequestParam("qualification") String qualification){
        List<Nurse> nurseListQual = nurseService.getListWithQual(qualification);
        return nurseListQual;
    }
}
