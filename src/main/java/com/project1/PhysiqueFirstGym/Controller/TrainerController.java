package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.TrainerData;
import com.project1.PhysiqueFirstGym.service.trainer.TrainerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainerController {

    @Autowired
    private TrainerDataService trainerDataService;

    @GetMapping("/trainer/get")
    public List<TrainerData> getTrainerData(){
        return trainerDataService.getTrainerData();
    }

    @PostMapping("/trainer/save")
    public TrainerData saveTrainerData(@RequestBody TrainerData tdata){
        return trainerDataService.saveTrainerData(tdata);
    }
    @DeleteMapping("/trainer/delete/{id}")
    public String deleteTrainerDataById(@PathVariable("id") Long tid){
        trainerDataService.deleteTrainerDataById(tid);
        return "Deleted Trainer Data Successfully";
    }


    @PutMapping("/trainer/update/{id}")
    public TrainerData updateTrainerData(@PathVariable("id") Long id,@RequestBody TrainerData trainerData){
        return trainerDataService.updateTrainerData(id,trainerData);
    }
}
