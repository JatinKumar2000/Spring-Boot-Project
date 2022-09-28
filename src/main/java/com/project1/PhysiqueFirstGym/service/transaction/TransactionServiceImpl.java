package com.project1.PhysiqueFirstGym.service.transaction;

import com.project1.PhysiqueFirstGym.entity.Transaction;
import com.project1.PhysiqueFirstGym.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepo;
    @Override
    public List<Transaction> getTransaction() {
        return transactionRepo.findAll();
    }
}
