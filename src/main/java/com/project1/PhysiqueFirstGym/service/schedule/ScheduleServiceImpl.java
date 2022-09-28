package com.project1.PhysiqueFirstGym.service.schedule;

import com.project1.PhysiqueFirstGym.entity.Schedule;
import com.project1.PhysiqueFirstGym.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    @Autowired
    private ScheduleRepository scheduleRepo;
    @Override
    public List<Schedule> getSchedule() {
        return scheduleRepo.findAll();
    }

    @Override
    public Schedule saveSchedule(Schedule schedule) {
        return scheduleRepo.save(schedule);
    }

    @Override
    public Schedule updateSchedule(Long scheduleId, Schedule schedule) {
        Schedule newSchedule=scheduleRepo.findById(scheduleId).get();
        if(Objects.nonNull(schedule.getStartTime()) && !"".equals(schedule.getStartTime())){
            newSchedule.setStartTime(schedule.getStartTime());
        }
        if(Objects.nonNull(schedule.getEndTime()) && !"".equals(schedule.getEndTime())){
            newSchedule.setEndTime(schedule.getEndTime());
        }
        return scheduleRepo.save(newSchedule);
    }

    @Override
    public String deleteSchedule(Long scheduleId) {
        scheduleRepo.deleteById(scheduleId);
        return "Schedule deleted Successfully";
    }


}
