package com.project1.PhysiqueFirstGym.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class TrainerData {

    @Id
    @Column(name = "TrainerId")
    @GeneratedValue
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

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "trainerData")
    @JsonBackReference
    private List<UserData> userData;

    public TrainerData() {
    }

    public TrainerData(Long tid, String tname, String tgender, String tage, Long tcontact, String temail, String taddress, String availableHrs, Date joinedDate, List<UserData> userData) {
        this.tid = tid;
        this.tname = tname;
        this.tgender = tgender;
        this.tage = tage;
        this.tcontact = tcontact;
        this.temail = temail;
        this.taddress = taddress;
        AvailableHrs = availableHrs;
        this.joinedDate = joinedDate;
        this.userData = userData;
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

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public List<UserData> getUserData() {
        return userData;
    }

    public void setUserData(List<UserData> userData) {
        this.userData = userData;
    }
}
