package org.example.ongere.Transaction.Services.Implementations;

import org.example.ongere.Transaction.DTOs.Mappers.TransactionMapper;
import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.Entities.Expense;
import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.example.ongere.Transaction.Repositories.ExpenseCategoryRepository;
import org.example.ongere.Transaction.Repositories.ExpenseRepository;
import org.example.ongere.Transaction.Services.ExpenseService;
import org.example.ongere.UserManagement.User;
import org.example.ongere.UserManagement.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImplementation implements ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final ExpenseCategoryRepository expenseCategoryRepository;
    private final UserRepository userRepository;
    private final TransactionMapper transactionMapper;

    public ExpenseServiceImplementation(
            ExpenseRepository expenseRepository,
            ExpenseCategoryRepository expenseCategoryRepository,
            UserRepository userRepository,
            TransactionMapper transactionMapper) {
        this.expenseRepository = expenseRepository;
        this.expenseCategoryRepository = expenseCategoryRepository;
        this.userRepository = userRepository;
        this.transactionMapper = transactionMapper;
    }

    @Override
    public void addExpense(TransactionRequestDTO expenseRequestDTO, String userId) {
        ExpenseCategory expenseCategory = expenseCategoryRepository
                .findById(expenseRequestDTO.getCategoryId()).orElseThrow();
        User user = userRepository.findById(Integer.valueOf(userId)).orElseThrow();
        Expense expense = transactionMapper.mapToExpense(
                expenseRequestDTO,
                expenseCategory,
                user);
        expenseRepository.save(expense);

    }

    @Override
    public void deleteExpense(Long id) {

    }

    @Override
    public void updateExpense() {

    }

    @Override
    public void getExpense() {

    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
