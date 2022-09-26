package com.project1.PhysiqueFirstGym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgramPrice {
    @Id
    @SequenceGenerator(name="Program_price_sequence",sequenceName = "Program_price_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "Program_price_sequence")
    private Long ppid;      //Program Price ID
    private Long pid;       //Program ID
    private Long monthlyFees;
    private Long quaterlyFees;
    private Long yearlyFees;

}
