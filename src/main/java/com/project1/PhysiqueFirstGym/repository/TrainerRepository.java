package com.project1.PhysiqueFirstGym.repository;

import com.project1.PhysiqueFirstGym.entity.TrainerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<TrainerData,Long> {
}
