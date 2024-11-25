package org.example.ongere.Transaction.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.example.ongere.Transaction.Services.IncomeCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories/incomes")
@RequiredArgsConstructor
public class IncomeCategoryController {
    private final IncomeCategoryService incomeCategoryService;

    @PostMapping
    public void addIncomeCategory(
            @RequestBody CategoryRequestDTO incomeCategoryDTO
            ) {
        incomeCategoryService.addIncomeCategory(incomeCategoryDTO);
    }

    @GetMapping
    public List<IncomeCategory> getAllIncomeCategories() {

        return incomeCategoryService.getAllIncomeCategories();
    }


}
