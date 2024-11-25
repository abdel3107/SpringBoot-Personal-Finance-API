package org.example.ongere.Transaction.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.Entities.Expense;
import org.example.ongere.Transaction.Services.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expenses")
@RequiredArgsConstructor
public class ExpenseController {
    private final ExpenseService expenseService;

    @PostMapping
    public void addExpense(
            @RequestBody TransactionRequestDTO expense,
            @RequestParam String userId
            ) {
        expenseService.addExpense(expense, userId);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

}
