package com.project1.PhysiqueFirstGym.service.schedule;

import com.project1.PhysiqueFirstGym.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    public List<Schedule> getSchedule();

    public Schedule saveSchedule(Schedule schedule);

    public Schedule updateSchedule(Long scheduleId, Schedule schedule);

    public String deleteSchedule(Long scheduleId);
}
