package org.example.ongere.Transaction.Repositories;

import org.example.ongere.Transaction.Entities.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Long> {
}
