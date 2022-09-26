package com.project1.PhysiqueFirstGym.service.trainer;

import com.project1.PhysiqueFirstGym.entity.TrainerData;
import com.project1.PhysiqueFirstGym.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerDataServiceImpl implements TrainerDataService {
    @Autowired
    private TrainerRepository trainerRepo;
    @Override
    public List<TrainerData> getTrainerData() {
        return trainerRepo.findAll();
    }

    @Override
    public void deleteTrainerDataById(Long tid) {
        trainerRepo.deleteById(tid);
    }

    @Override
    public TrainerData saveTrainerData(TrainerData tdata) {
        return trainerRepo.save(tdata);
    }


}
