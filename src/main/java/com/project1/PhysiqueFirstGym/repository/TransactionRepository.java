package com.project1.PhysiqueFirstGym.repository;

import com.project1.PhysiqueFirstGym.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
