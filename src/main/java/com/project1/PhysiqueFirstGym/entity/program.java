package com.project1.PhysiqueFirstGym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Data
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


}
