package com.project1.PhysiqueFirstGym.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Schedule {
    @Id
    @GeneratedValue
    @Column(name = "ScheduleId")
    private Long schId;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    public Schedule() {
    }

    public Schedule(Long schId, Date startTime, Date endTime) {
        this.schId = schId;


        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getSchId() {
        return schId;
    }

    public void setSchId(Long schId) {
        this.schId = schId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schId=" + schId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
