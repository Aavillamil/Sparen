package com.sparen.income.domain.models;

public class ExpenseCategories {
    private Integer idExpenseCategory;
    private String descriptionExpenseCategory;
    private ExpensesTypes expensesTypes;
    public ExpenseCategories() {
    }

    public ExpenseCategories(Integer idExpenseCategory, String descriptionExpenseCategory) {
        this.idExpenseCategory = idExpenseCategory;
        this.descriptionExpenseCategory = descriptionExpenseCategory;
    }

    public Integer getIdExpenseCategory() {
        return idExpenseCategory;
    }

    public void setIdExpenseCategory(Integer idExpenseCategory) {
        this.idExpenseCategory = idExpenseCategory;
    }

    public String getDescriptionExpenseCategory() {
        return descriptionExpenseCategory;
    }

    public void setDescriptionExpenseCategory(String descriptionExpenseCategory) {
        this.descriptionExpenseCategory = descriptionExpenseCategory;
    }

    public ExpensesTypes getExpensesTypes() {
        return expensesTypes;
    }

    public void setExpensesTypes(ExpensesTypes expensesTypes) {
        this.expensesTypes = expensesTypes;
    }

    @Override
    public String toString() {
        return "ExpenseCategories{" +
                "idExpenseCategory=" + idExpenseCategory +
                ", descriptionExpenseCategory='" + descriptionExpenseCategory + '\'' +
                '}';
    }
}
