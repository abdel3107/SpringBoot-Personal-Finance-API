package org.example.ongere.Transaction.Entities;

import java.util.Date;
import java.util.List;

public class Report {

    private Date startDate;
    private Date endDate;
    private double totalIncome;
    private double totalExpense;
    private double netBalance;

    public Report(List<Income> incomes, List<Expense> expenses) {
        this.startDate = incomes.isEmpty() ? new Date() : incomes.getFirst().getDate();
        this.endDate = expenses.isEmpty() ? new Date() : expenses.getLast().getDate();
        this.totalIncome = incomes.stream().mapToDouble(Income::getAmount).sum();
        this.totalExpense = expenses.stream().mapToDouble(Expense::getAmount).sum();
        this.netBalance = totalIncome - totalExpense;
    }

    // Getters
}
