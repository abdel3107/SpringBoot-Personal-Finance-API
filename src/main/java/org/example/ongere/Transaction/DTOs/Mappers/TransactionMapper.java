package org.example.ongere.Transaction.DTOs.Mappers;

import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.TransactionResponseDTO;
import org.example.ongere.Transaction.Entities.Expense;
import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.example.ongere.Transaction.Entities.Income;
import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.example.ongere.UserManagement.User;
import org.springframework.stereotype.Service;

import java.util.Map;

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

    public TransactionResponseDTO mapToIncomeResponseDTO(
            Income income
    ) {
        return TransactionResponseDTO.builder()
                .id(income.getId())
                .amount(income.getAmount())
                .date(income.getDate())
                .description(income.getDescription())
                .Category(Map.of(income.getCategory().getId(), income.getCategory().getName()))
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

    public TransactionResponseDTO mapToExpenseResponseDTO(
            Expense expense
    ) {
        return TransactionResponseDTO.builder()
                .id(expense.getId())
                .amount(expense.getAmount())
                .date(expense.getDate())
                .description(expense.getDescription())
                .Category(Map.of(expense.getCategory().getId(), expense.getCategory().getName()))
                .build();
    }
}


