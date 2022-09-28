package com.project1.PhysiqueFirstGym.repository;

import com.project1.PhysiqueFirstGym.entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership,Long> {
}
