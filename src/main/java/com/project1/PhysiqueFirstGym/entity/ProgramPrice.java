package com.project1.PhysiqueFirstGym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramPrice {
    @Id
    @GeneratedValue
    @Column(name = "Program_PriceId")
    private Long ppid;

    @Column(name = "Bronze_Membership")
    private Long bronzeMemship;

    @Column(name = "Silver_Membership")
    private Long silverMemship;

    @Column(name = "Gold_Membership")
    private Long goldMemship;

    @Column(name = "Platinum_Membership")
    private Long platinumMemship;

    @Column(name = "Diamond_Membership")
    private Long diamondMemship;

    //create program id FK


}

