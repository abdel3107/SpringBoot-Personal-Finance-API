package org.example.ongere.Transaction.Services;

import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.Entities.Income;

import java.util.List;

public interface IncomeService {
    void addIncome(TransactionRequestDTO transactionRequestDTO, String userId);
    void deleteIncome(Long id);
    void updateIncome(Income income, Long id);
    void getIncome(Long id);
    List<Income> getAllIncome();
}
