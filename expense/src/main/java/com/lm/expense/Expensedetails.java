package com.lm.expense;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Expensedetails {

    private Integer id;
    private String head;
    private String details;
    private String name;
    private double amount;
    private String status;
    private String user;
    private Date date;

    public Expensedetails(){}

    public Expensedetails(Integer id, String head, String details, String name, double amount, String status, String user, Date date) {
        this.id = id;
        this.head = head;
        this.details = details;
        this.name = name;
        this.amount = amount;
        this.status = status;
        this.user = user;
        this.date = date;
    }

    @Id
   // @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "user",length = 20)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expensedetails{" +
                "id=" + id +
                ", head='" + head + '\'' +
                ", details='" + details + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", user='" + user + '\'' +
                ", date=" + date +
                '}';
    }
}
