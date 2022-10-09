package com.project1.PhysiqueFirstGym.service.transaction;

import com.project1.PhysiqueFirstGym.entity.Transaction;
import com.project1.PhysiqueFirstGym.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepo;
    @Override
    public List<Transaction> getTransaction() {
        return transactionRepo.findAll();
    }

    @Override
    public void deleteTransaction(Long id) {
        transactionRepo.deleteById(id);
    }

    @Override
    public Transaction updateTransaction(Long id, Transaction transaction) {
        Transaction newTransaction = transactionRepo.findById(id).get();
        if (Objects.nonNull(transaction.getAmount()) && !"".equals(transaction.getAmount())) {
            newTransaction.setAmount(transaction.getAmount());
        }
        if (Objects.nonNull(transaction.getDate()) && !"".equals(transaction.getDate())) {
            newTransaction.setDate(transaction.getDate());
        }
        return transactionRepo.save(newTransaction);
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepo.save(transaction);
    }


}
