package com.project1.PhysiqueFirstGym.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Membership {
    @Id
    @GeneratedValue
    private Long mid;
    private String mtype;
    private String validity;
    private String discount;

    //create user FK
    @OneToMany(cascade = {CascadeType.ALL},mappedBy = "membership")
    @JsonBackReference
    private List<UserData> userData;

    public Membership() {
    }

    public Membership(Long mid, String mtype, String validity, String discount, List<UserData> userData) {
        this.mid = mid;
        this.mtype = mtype;
        this.validity = validity;
        this.discount = discount;
        this.userData = userData;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public List<UserData> getUserData() {
        return userData;
    }

    public void setUserData(List<UserData> userData) {
        this.userData = userData;
    }


}
