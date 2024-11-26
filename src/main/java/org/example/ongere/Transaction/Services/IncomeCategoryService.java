package org.example.ongere.Transaction.Services;

import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.CategoryResponseDTO;
import org.example.ongere.Transaction.Entities.Income;
import org.example.ongere.Transaction.Entities.IncomeCategory;

import java.util.List;

public interface IncomeCategoryService {
    void addIncomeCategory(CategoryRequestDTO incomeCategoryDTO);
    void deleteIncomeCategory();
    void updateIncomeCategory(Income income, Long id);
    void getIncomeCategory();
    List<CategoryResponseDTO> getAllIncomeCategories();
}
