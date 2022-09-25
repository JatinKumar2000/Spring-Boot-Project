package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.TrainerData;
import com.project1.PhysiqueFirstGym.service.trainer.TrainerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainerController {

    @Autowired
    private TrainerDataService trainerDataService;

    @PostMapping("/saveTrainerData")
    public String saveTrainerData(@RequestBody TrainerData Tdata){
        trainerDataService.saveTrainerData(Tdata);
        return "Saved Trainer Data Successfully";
    }

    @GetMapping("/trainerData")
    public List<TrainerData> getTrainerData(){
        return trainerDataService.getTrainerData();
    }
}
