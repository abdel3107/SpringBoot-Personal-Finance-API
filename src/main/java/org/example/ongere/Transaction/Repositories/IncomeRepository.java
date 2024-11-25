package org.example.ongere.Transaction.Repositories;

import org.example.ongere.Transaction.Entities.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
