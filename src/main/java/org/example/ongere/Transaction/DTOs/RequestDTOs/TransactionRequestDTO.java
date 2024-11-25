package org.example.ongere.Transaction.DTOs.RequestDTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDTO {

    private double amount;

    private Date date;

    private String description;

    private Long categoryId;
}
