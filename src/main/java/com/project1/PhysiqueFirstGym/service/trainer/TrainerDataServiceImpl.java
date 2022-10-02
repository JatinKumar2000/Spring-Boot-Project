package com.project1.PhysiqueFirstGym.service.trainer;

import com.project1.PhysiqueFirstGym.entity.TrainerData;
import com.project1.PhysiqueFirstGym.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public TrainerData updateTrainerData(Long id, TrainerData trainerData) {
        TrainerData newTrainerData=trainerRepo.findById(id).get();
        if(Objects.nonNull(trainerData.getTname()) && !"".equalsIgnoreCase(trainerData.getTname())){
            newTrainerData.setTname(trainerData.getTname());
        }
        if(Objects.nonNull(trainerData.getTage()) && !"".equals(trainerData.getTage())){
            newTrainerData.setTage(trainerData.getTage());
        }
        if(Objects.nonNull(trainerData.getTgender()) && !"".equalsIgnoreCase(trainerData.getTgender())){
            newTrainerData.setTgender(trainerData.getTgender());
        }
        if(Objects.nonNull(trainerData.getTemail()) && !"".equalsIgnoreCase(trainerData.getTemail())){
            newTrainerData.setTname(trainerData.getTname());
        }
        if(Objects.nonNull(trainerData.getTcontact()) && !"".equals(trainerData.getTcontact())){
            newTrainerData.setTcontact(trainerData.getTcontact());
        }
        if(Objects.nonNull(trainerData.getTaddress()) && !"".equalsIgnoreCase(trainerData.getTaddress())){
            newTrainerData.setTaddress(trainerData.getTaddress());
        }
        if(Objects.nonNull(trainerData.getJoinedDate()) && !"".equals(trainerData.getJoinedDate())){
            newTrainerData.setJoinedDate(trainerData.getJoinedDate());
        }
        if(Objects.nonNull(trainerData.getAvailableHrs()) && !"".equalsIgnoreCase(trainerData.getAvailableHrs())){
            newTrainerData.setAvailableHrs(trainerData.getAvailableHrs());
        }
        return trainerRepo.save(newTrainerData);
    }


}
