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
public class Income extends Transaction {

    @ManyToOne
    @JoinColumn(name = "category_id")
    private IncomeCategory category;

    // Getters, Setters, Constructors
}