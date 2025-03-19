package com.sparen.income.application.usecases.expenses;

import com.sparen.income.application.dtos.ExpenseDto;
import com.sparen.income.domain.models.Expenses;

public interface ExpensesService {
    public ExpenseDto saveExpense(Expenses expenses);
}
