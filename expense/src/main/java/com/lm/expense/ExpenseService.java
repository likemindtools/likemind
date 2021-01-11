package com.lm.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expensedetails> getAllExpensedetails(){
        List<Expensedetails> expensedetails = new ArrayList<Expensedetails>();
        expenseRepository.findAll()
                .forEach(expensedetails::add);
        return expensedetails;
    }

    public Expensedetails getExpensedetails(Integer id){
        return expenseRepository.findById(id).get();
    }

    public HttpStatus createExpensedetails(Expensedetails expensedetails){
        expenseRepository.save(expensedetails);
        return HttpStatus.CREATED;
    }

    public HttpStatus updateExpensedetails(Integer id, Expensedetails expensedetails){
        expenseRepository.save(expensedetails);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus deleteExpensedetails(Integer id){
        expenseRepository.deleteById(id);
        return HttpStatus.ACCEPTED;
    }

}
