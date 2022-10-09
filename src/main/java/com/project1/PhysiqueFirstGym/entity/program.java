package com.project1.PhysiqueFirstGym.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class program {
    @Id
    @Column(name = "ProgramId")
    @GeneratedValue
    private Long pid;
    @Column(name = "Program_name")
    private String pname;
    @Column(name = "Description")
    private String description;
    //create price id FK , user_id FK


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Program_priceId")
    private ProgramPrice programPrice;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST},mappedBy = "programs")
    @JsonBackReference
    private Set<UserData> usersData;
}
