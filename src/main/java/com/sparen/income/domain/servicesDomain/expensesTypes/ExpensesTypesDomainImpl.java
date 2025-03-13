package com.sparen.income.domain.servicesDomain.expensesTypes;

import java.time.LocalDate;
import java.util.Date;

public class ExpensesTypesDomainImpl implements ExpensesTypesDomain {

    @Override
    public void validateDate(String expenseType, LocalDate dateExpense) {
        if(expenseType.equals("PLANIFICADO") && dateExpense.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Si es planificada no puede ser una fecha del pasasdo");
        }else{
            throw new IllegalArgumentException("Si es real no puede ser una fecha del futuro");
        }
    }
}
