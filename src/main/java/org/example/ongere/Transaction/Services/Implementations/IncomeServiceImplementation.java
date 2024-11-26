package org.example.ongere.Transaction.Services.Implementations;

import org.example.ongere.Transaction.DTOs.Mappers.TransactionMapper;
import org.example.ongere.Transaction.DTOs.RequestDTOs.TransactionRequestDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.TransactionResponseDTO;
import org.example.ongere.Transaction.Entities.Income;
import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.example.ongere.Transaction.Repositories.IncomeCategoryRepository;
import org.example.ongere.Transaction.Repositories.IncomeRepository;
import org.example.ongere.Transaction.Services.IncomeService;
import org.example.ongere.UserManagement.User;
import org.example.ongere.UserManagement.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImplementation implements IncomeService {
    private final IncomeRepository incomeRepository;
    private final TransactionMapper transactionMapper;
    private final IncomeCategoryRepository incomeCategoryRepository;
    private final UserRepository userRepository;

    public IncomeServiceImplementation(IncomeRepository incomeRepository, TransactionMapper transactionMapper, IncomeCategoryRepository incomeCategoryRepository, UserRepository userRepository) {
        this.incomeRepository = incomeRepository;
        this.transactionMapper = transactionMapper;
        this.incomeCategoryRepository = incomeCategoryRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void addIncome(TransactionRequestDTO transactionRequestDTO, String userId) {
        IncomeCategory incomeCategory = incomeCategoryRepository
                .findById(transactionRequestDTO.getCategoryId()).orElseThrow();
        User user = userRepository.findById(Integer.valueOf(userId)).orElseThrow();
        Income income = transactionMapper.mapToIncome(
                transactionRequestDTO,
                incomeCategory,
                user);
        incomeRepository.save(income);
    }

    @Override
    public void deleteIncome(Long id) {

    }

    @Override
    public void updateIncome(Income income, Long id) {

    }

    @Override
    public void getIncome(Long id) {

    }

    @Override
    public List<TransactionResponseDTO> getAllIncome() {
        List<TransactionResponseDTO> transactionResponseDTOS = incomeRepository.findAll()
                .stream()
                .map(transactionMapper::mapToIncomeResponseDTO)
                .toList();
        return transactionResponseDTOS;
    }

    @Override
    public double getTotalIncome() {
        return incomeRepository.findAll()
                .stream()
                .mapToDouble(Income::getAmount)
                .sum();
    }
}
