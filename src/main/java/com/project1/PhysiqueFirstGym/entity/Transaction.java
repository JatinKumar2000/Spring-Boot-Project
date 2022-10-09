package com.project1.PhysiqueFirstGym.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long tran_Id;
    private Long amount;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="userid",insertable = false,updatable = false)
    private UserData userData;
    private Long userid;

    public Transaction() {
    }

    public Transaction(Long tran_Id, Long amount, Date date, UserData userData, Long userid) {
        this.tran_Id = tran_Id;
        this.amount = amount;
        this.date = date;
        this.userData = userData;
        this.userid = userid;
    }

    public Long getTran_Id() {
        return tran_Id;
    }

    public void setTran_Id(Long tran_Id) {
        this.tran_Id = tran_Id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }


}
