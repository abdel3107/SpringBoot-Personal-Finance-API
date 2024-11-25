package org.example.ongere.Transaction.Repositories;


import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeCategoryRepository extends JpaRepository<IncomeCategory, Long> {
}
