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
    @SequenceGenerator(name = "program_sequence",sequenceName = "program_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "program_sequence")
    private Long pid;
    private String pname;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ppid_fk")
    private ProgramPrice programPrice;
}
