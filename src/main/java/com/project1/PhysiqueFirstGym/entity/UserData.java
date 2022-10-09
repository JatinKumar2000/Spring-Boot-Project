package com.project1.PhysiqueFirstGym.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
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


    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "membershipid",insertable = false,updatable = false)
    private Membership membership;
    private Long membershipid;

    @OneToMany(cascade = {CascadeType.ALL},mappedBy = "userData")
    @JsonBackReference
    private List<Transaction> transaction;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "trainerid",updatable = false,insertable = false)
    private TrainerData trainerData;
    private Long trainerid;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    @JoinTable(name = "user_program_table",joinColumns = @JoinColumn(name = "Client_Id"),
            inverseJoinColumns = @JoinColumn(name = "programid",updatable = false,insertable = false))

    private Set<program> programs;
    private Long programid;





}
