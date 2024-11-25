package org.example.ongere.Transaction.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.Entities.Income;
import org.example.ongere.Transaction.Services.IncomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/incomes")
@RequiredArgsConstructor
public class IncomeController {
    private final IncomeService incomeService;

    @PostMapping
    public void addIncome(
            @RequestBody TransactionRequestDTO income,
            @RequestParam String userId
    ) {

        incomeService.addIncome(income, userId);
    }

    @GetMapping("/{incomeId}")
    public void getIncomeById(
            @PathVariable("incomeId") Long incomeId) {
        incomeService.getIncome(incomeId);
    }

    @GetMapping
    public List<Income> getAllIncome() {
        return incomeService.getAllIncome();
    }

    @PutMapping("/{incomeId}")
    public void updateIncome(
            @PathVariable Long incomeId,
            @RequestBody Income income
    ) {
        incomeService.updateIncome(income, incomeId);
    }

}

