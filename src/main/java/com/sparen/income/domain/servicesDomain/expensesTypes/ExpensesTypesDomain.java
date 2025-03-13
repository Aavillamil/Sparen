package com.sparen.income.domain.servicesDomain.expensesTypes;

import java.time.LocalDate;
import java.util.Date;

public interface ExpensesTypesDomain {
    public void validateDate(String expenseType, LocalDate dateExpense);
}
