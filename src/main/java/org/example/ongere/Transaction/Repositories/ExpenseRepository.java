package org.example.ongere.Transaction.Repositories;

import org.example.ongere.Transaction.Entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
