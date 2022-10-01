package com.project1.PhysiqueFirstGym.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {

    @Id
    @Column(name = "UserId")
    @GeneratedValue
    private Long userId;
    private String name;
    private Long age;
    private String gender;
    private String email;
    private Long contact;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date joinDate;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "Membership_End_Date")
    private Date membEnddate;   //User Membership end date

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Membership_Id")
    private Membership membership;



}
