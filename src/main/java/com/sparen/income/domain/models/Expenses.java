package com.sparen.income.domain.models;

import java.util.Date;

public class Expenses {
    private Integer idExpense;
    private String expenseDescription;
    private double amount;
    private ExpenseCategories expenseCategorie;
    private Date dateExpense;
    private Priorities priorities;


    public Expenses() {
    }

    public Expenses(Integer idExpense, String expenseDescription, double amount, ExpenseCategories expenseCategorie, Date dateExpense) {
        this.idExpense = idExpense;
        this.expenseDescription = expenseDescription;
        this.amount = amount;
        this.expenseCategorie = expenseCategorie;
        this.dateExpense = dateExpense;
    }

    public Integer getIdExpense() {
        return idExpense;
    }

    public void setIdExpense(Integer idExpense) {
        this.idExpense = idExpense;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseCategories getExpenseCategorie() {
        return expenseCategorie;
    }

    public void setExpenseCategorie(ExpenseCategories expenseCategorie) {
        this.expenseCategorie = expenseCategorie;
    }

    public Date getDateExpense() {
        return dateExpense;
    }

    public void setDateExpense(Date dateExpense) {
        this.dateExpense = dateExpense;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "idExpense=" + idExpense +
                ", expenseDescription='" + expenseDescription + '\'' +
                ", amount=" + amount +
                ", expenseCategorie=" + expenseCategorie +
                ", dateExpense=" + dateExpense +
                '}';
    }
}
