package com.project1.PhysiqueFirstGym.service.transaction;

import com.project1.PhysiqueFirstGym.entity.Transaction;

import java.util.List;

public interface TransactionService {
    public List<Transaction> getTransaction();


    public void deleteTransaction(Long id);

    public Transaction updateTransaction(Long id, Transaction transaction);
}
