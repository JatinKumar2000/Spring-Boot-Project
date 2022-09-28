package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.Schedule;
import com.project1.PhysiqueFirstGym.service.schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedule")
    public List<Schedule> getSchedule(){
        return scheduleService.getSchedule();
    }

    @PostMapping("/schedule/save")
    public Schedule saveSchedule(@RequestBody Schedule schedule){
        return scheduleService.saveSchedule(schedule);
    }

    @PutMapping("/schedule/update/{id}")
    public Schedule updateSchedule(@PathVariable("id") Long scheduleId,@RequestBody Schedule schedule){
        return scheduleService.updateSchedule(scheduleId,schedule);
    }

    @DeleteMapping("schedule/delete/{id}")
    public String deleteSchedule(@PathVariable("id") Long scheduleId){
        return scheduleService.deleteSchedule(scheduleId);
    }
}
