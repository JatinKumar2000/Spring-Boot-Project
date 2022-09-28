package com.project1.PhysiqueFirstGym.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class TrainerData {

    @Id
    @GeneratedValue
    @Column(name = "TrainerId")
    private Long tid; //Trainer ID

    @Column(name = "Name")
    private String tname;  //Trainer Name

    @Column(name = "Gender")
    private String tgender;  //Trainer Gender

    @Column(name = "Age")
    private String tage;    //Trainer Age

    @Column(name = "Contact")
    private Long tcontact;    //Trainer Contact no

    @Column(name = "Email")
    private String temail;    //Trainer email

    @Column(name = "Address")
    private String taddress;   //Trainer Address
    private String AvailableHrs;  //Timing hrs of trainer

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date joinedDate;

    //create user FK

    public TrainerData() {
    }

    public TrainerData(Long tid, String tname, String tgender, String tage, Long tcontact, String temail, String taddress, String AvailableHrs) {
        this.tid = tid;
        this.tname = tname;
        this.tgender = tgender;
        this.tage = tage;
        this.tcontact = tcontact;
        this.temail = temail;
        this.taddress = taddress;
        this.AvailableHrs = AvailableHrs;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTgender() {
        return tgender;
    }

    public void setTgender(String tgender) {
        this.tgender = tgender;
    }

    public String getTage() {
        return tage;
    }

    public void setTage(String tage) {
        this.tage = tage;
    }

    public Long getTcontact() {
        return tcontact;
    }

    public void setTcontact(Long tcontact) {
        this.tcontact = tcontact;
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    public String getAvailableHrs() {
        return AvailableHrs;
    }

    public void setAvailableHrs(String availableHrs) {
        AvailableHrs = availableHrs;
    }

    @Override
    public String toString() {
        return "TrainerData{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tgender='" + tgender + '\'' +
                ", tage='" + tage + '\'' +
                ", tcontact=" + tcontact +
                ", temail='" + temail + '\'' +
                ", taddress='" + taddress + '\'' +
                ", AvailableHrs='" + AvailableHrs + '\'' +
                '}';
    }
}
