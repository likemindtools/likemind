package com.lm.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public List<Expensedetails> getAllExpensedetails(){
    return expenseService.getAllExpensedetails();
    }

    @RequestMapping("/{id}")
    public Expensedetails getExpensedetails(@PathVariable Integer id){
        return expenseService.getExpensedetails(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void createExpensedetails(@RequestBody Expensedetails expensedetails){
        expenseService.createExpensedetails(expensedetails);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public HttpStatus updateExpensedetails(@PathVariable Integer id, @RequestBody Expensedetails expensedetails){
        return expenseService.updateExpensedetails(id,expensedetails);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public HttpStatus deleteExpensedetails(@PathVariable Integer id){
        return expenseService.deleteExpensedetails(id);
    }
}
