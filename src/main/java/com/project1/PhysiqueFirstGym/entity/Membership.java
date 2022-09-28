package com.project1.PhysiqueFirstGym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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


}
