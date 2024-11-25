package org.example.ongere.Transaction.Services;

import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
import org.example.ongere.Transaction.Entities.ExpenseCategory;

import java.util.List;

public interface ExpenseCategoryService {
    void addExpenseCategory(CategoryRequestDTO expenseCategoryDTO);
    void deleteExpenseCategory();
    void updateExpenseCategory();
    void getExpenseCategory();
    List<ExpenseCategory> getAllExpenseCategories();
}
