package org.example.ongere.Transaction;

import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.example.ongere.Transaction.Repositories.ExpenseCategoryRepository;
import org.example.ongere.Transaction.Repositories.IncomeCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final IncomeCategoryRepository incomeCategoryRepository;

    private final ExpenseCategoryRepository expenseCategoryRepository;

    public DataLoader(IncomeCategoryRepository incomeCategoryRepository, ExpenseCategoryRepository expenseCategoryRepository) {
        this.incomeCategoryRepository = incomeCategoryRepository;
        this.expenseCategoryRepository = expenseCategoryRepository;
    }

    @Override
    public void run(String... args) {
        if (incomeCategoryRepository.count() == 0) {
            incomeCategoryRepository.save(new IncomeCategory("Salary", true));
            incomeCategoryRepository.save(new IncomeCategory("Business", true));
        }
        if (expenseCategoryRepository.count() == 0) {
            expenseCategoryRepository.save(new ExpenseCategory("Food", true));
            expenseCategoryRepository.save(new ExpenseCategory("Transport", true));
        }
    }
}

