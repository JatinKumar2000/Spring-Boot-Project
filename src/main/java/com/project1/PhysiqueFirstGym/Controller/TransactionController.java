package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.Transaction;
import com.project1.PhysiqueFirstGym.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions/get")
    public List<Transaction> getTransaction(){
        return transactionService.getTransaction();
    }

    @DeleteMapping("/transaction/delete/{id}")
    public String deleteTransaction(@PathVariable("id") Long id){
        transactionService.deleteTransaction(id);
        return "Transaction Deleted Successfully";
    }

    @PutMapping("/transaction/update/{id}")
    public Transaction updateTransaction(@PathVariable("id") Long id,@RequestBody Transaction transaction){
        return transactionService.updateTransaction(id,transaction);
    }

    @PostMapping("/transaction/save")
    public Transaction saveTransaction(@RequestBody Transaction transaction){
        return transactionService.saveTransaction(transaction);
    }
}
