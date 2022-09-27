package com.project1.PhysiqueFirstGym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramPrice {
    @Id
    @SequenceGenerator(name="Program_price_sequence",sequenceName = "Program_price_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "Program_price_sequence")
    @Column(name = "ppid")
    private Long ppid;//Program Price ID

    @Column(name="monthlyFees")
    private Long monthlyFees;

    @Column(name = "quaterlyFees")
    private Long quaterlyFees;

    @Column(name = "yearlyFees")
    private Long yearlyFees;


}
