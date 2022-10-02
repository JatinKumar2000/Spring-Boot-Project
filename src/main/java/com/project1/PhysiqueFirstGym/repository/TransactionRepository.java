package com.project1.PhysiqueFirstGym.repository;

import com.project1.PhysiqueFirstGym.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
