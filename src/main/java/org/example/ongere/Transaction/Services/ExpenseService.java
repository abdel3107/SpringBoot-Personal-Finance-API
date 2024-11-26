package org.example.ongere.Transaction.Services;

import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.TransactionResponseDTO;
import org.example.ongere.Transaction.Entities.Expense;

import java.util.List;

public interface ExpenseService {
    void addExpense(TransactionRequestDTO expenseRequestDTO, String userId);
    void deleteExpense(Long id);
    void updateExpense();
    void getExpense();
    List<TransactionResponseDTO> getAllExpenses();
    double getTotalExpense();
}
