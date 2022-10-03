package com.project1.PhysiqueFirstGym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Membership {
    @Id
    @GeneratedValue
    private Long mid;
    private String mtype;
    private String validity;
    private String discount;

    //create user FK
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "Membership_Id",referencedColumnName = "mid")
    private List<UserData> userData;



}
