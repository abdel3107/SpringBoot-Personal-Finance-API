package org.example.ongere.Transaction.DTOs.Mappers;

import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
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

    public ExpenseCategory mapToExpenseCategory(
            CategoryRequestDTO categoryRequestDTO
    ) {
        return ExpenseCategory.builder()
                .name(categoryRequestDTO.getName())
                .isPredefined(false)
                .build();
    }
}
