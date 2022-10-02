package com.project1.PhysiqueFirstGym.service.trainer;

import com.project1.PhysiqueFirstGym.entity.TrainerData;

import java.util.List;

public interface TrainerDataService{
    public List<TrainerData> getTrainerData();

    public void deleteTrainerDataById(Long tid);

    public TrainerData saveTrainerData(TrainerData tdata);

    public TrainerData updateTrainerData(Long id, TrainerData trainerData);
}
