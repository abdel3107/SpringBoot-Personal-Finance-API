package org.example.ongere.Transaction.Services.Implementations;

import org.example.ongere.Transaction.DTOs.Mappers.CategoryMapper;
import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.example.ongere.Transaction.Repositories.ExpenseCategoryRepository;
import org.example.ongere.Transaction.Services.ExpenseCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {
    private final ExpenseCategoryRepository expenseCategoryRepository;
    private final CategoryMapper categoryMapper;

    public ExpenseCategoryServiceImpl(ExpenseCategoryRepository expenseCategoryRepository, CategoryMapper categoryMapper) {
        this.expenseCategoryRepository = expenseCategoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void addExpenseCategory(CategoryRequestDTO expenseCategoryDTO) {
        ExpenseCategory expenseCategory = categoryMapper
                .mapToExpenseCategory(expenseCategoryDTO);
        expenseCategoryRepository.save(expenseCategory);
    }

    @Override
    public void deleteExpenseCategory() {

    }

    @Override
    public void updateExpenseCategory() {

    }

    @Override
    public void getExpenseCategory() {

    }

    @Override
    public List<ExpenseCategory> getAllExpenseCategories() {
        return expenseCategoryRepository.findAll();
    }
}
