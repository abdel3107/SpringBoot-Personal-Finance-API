package org.example.ongere.Transaction.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.CategoryResponseDTO;
import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.example.ongere.Transaction.Services.ExpenseCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories/expenses")
@RequiredArgsConstructor
public class ExpenseCategoryController {
    private final ExpenseCategoryService expenseCategoryService;

    @PostMapping
    public void addExpenseCategory(
            @RequestBody CategoryRequestDTO expenseCategoryDTO
            ) {
        expenseCategoryService.addExpenseCategory(expenseCategoryDTO);
    }

    @GetMapping
    public List<CategoryResponseDTO> getAllExpenseCategories() {

        return expenseCategoryService.getAllExpenseCategories();
    }
}
