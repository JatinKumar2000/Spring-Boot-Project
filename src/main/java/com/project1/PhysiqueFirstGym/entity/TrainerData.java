package com.project1.PhysiqueFirstGym.entity;


import javax.persistence.*;

@Entity
public class TrainerData {

    @Id
    @SequenceGenerator(name = "MY_ENTITY_SEQ", sequenceName = "MY_ENTITY_SEQ", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "MY_ENTITY_SEQ" )
    private Long tid; //Trainer ID
    private String tname;  //Trainer Name
    private String tgender;  //Trainer Gender
    private String tage;    //Trainer Age
    private Long tcontact;    //Trainer Contact no
    private String temail;    //Trainer email
    private String taddress;   //Trainer Address

    public TrainerData() {
    }

    public TrainerData(Long tid, String tname, String tgender, String tage, Long tcontact, String temail, String taddress) {
        this.tid = tid;
        this.tname = tname;
        this.tgender = tgender;
        this.tage = tage;
        this.tcontact = tcontact;
        this.temail = temail;
        this.taddress = taddress;
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
                '}';
    }
}
