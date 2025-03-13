package com.sparen.income.domain.models;

public class ExpensesTypes {
    private Integer idExpenseType;
    private String expenseType;

    public ExpensesTypes() {
    }

    public ExpensesTypes(Integer idExpenseType, String expenseType) {
        this.idExpenseType = idExpenseType;
        this.expenseType = expenseType;
    }

    public Integer getIdExpenseType() {
        return idExpenseType;
    }

    public void setIdExpenseType(Integer idExpenseType) {
        this.idExpenseType = idExpenseType;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }
}
