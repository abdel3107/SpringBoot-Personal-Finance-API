package org.example.ongere.Transaction.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Expense extends Transaction {

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ExpenseCategory category;

    // Getters, Setters, Constructors
}
