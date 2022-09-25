package com.project1.PhysiqueFirstGym.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Tid;     //Trainer ID
    private String Tname;  //Trainer Name
    private String Tgender;  //Trainer Gender
    private String Tage;    //Trainer Age
    private Long Tcontact;    //Trainer Contact no
    private String Temail;    //Trainer email
    private String Taddress;   //Trainer Address


}
