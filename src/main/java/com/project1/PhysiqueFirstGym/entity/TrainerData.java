package com.project1.PhysiqueFirstGym.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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




}
