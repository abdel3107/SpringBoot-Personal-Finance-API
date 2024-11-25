package org.example.ongere.Transaction.DTOs.Mappers;

import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.Entities.Expense;
import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.example.ongere.Transaction.Entities.Income;
import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.example.ongere.UserManagement.User;
import org.springframework.stereotype.Service;

@Service
public class TransactionMapper {

    public Income mapToIncome(
            TransactionRequestDTO transactionRequestDTO,
            IncomeCategory incomeCategory,
            User user) {
        return Income.builder()
                .amount(transactionRequestDTO.getAmount())
                .date(transactionRequestDTO.getDate())
                .description(transactionRequestDTO.getDescription())
                .category(incomeCategory)
                .user(user)
                .build();
    }

    public Expense mapToExpense(
            TransactionRequestDTO expenseRequestDTO,
            ExpenseCategory expenseCategory,
            User user) {
        return Expense.builder()
                .amount(expenseRequestDTO.getAmount())
                .date(expenseRequestDTO.getDate())
                .description(expenseRequestDTO.getDescription())
                .category(expenseCategory)
                .user(user)
                .build();
    }

}
