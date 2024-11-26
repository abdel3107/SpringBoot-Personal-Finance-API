package org.example.ongere.Transaction.DTOs.Mappers;

import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.CategoryResponseDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.TransactionResponseDTO;
import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapper {
    public IncomeCategory mapToIncomeCategory(
            CategoryRequestDTO categoryRequestDTO
    ) {
        return IncomeCategory.builder()
                .name(categoryRequestDTO.getName())
                .isPredefined(false)
                .build();
    }

    public CategoryResponseDTO mapToIncomeCategoryResponseDTO(
            IncomeCategory incomeCategory
    ) {
        return CategoryResponseDTO.builder()
                .id(incomeCategory.getId())
                .name(incomeCategory.getName())
                .build();
    }


    public ExpenseCategory mapToExpenseCategory(
            CategoryRequestDTO categoryRequestDTO
    ) {
        return ExpenseCategory.builder()
                .name(categoryRequestDTO.getName())
                .isPredefined(false)
                .build();
    }

    public CategoryResponseDTO mapToExpenseCategoryResponseDTO(
            ExpenseCategory expenseCategory
    ) {
        return CategoryResponseDTO.builder()
                .id(expenseCategory.getId())
                .name(expenseCategory.getName())
                .build();
    }

}
