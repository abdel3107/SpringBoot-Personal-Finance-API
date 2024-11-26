package org.example.ongere.Transaction.Services.Implementations;

import org.example.ongere.Transaction.DTOs.Mappers.CategoryMapper;
import org.example.ongere.Transaction.DTOs.RequestDTOs.CategoryRequestDTO;
import org.example.ongere.Transaction.DTOs.ResponseDTO.CategoryResponseDTO;
import org.example.ongere.Transaction.Entities.Income;
import org.example.ongere.Transaction.Entities.IncomeCategory;
import org.example.ongere.Transaction.Repositories.IncomeCategoryRepository;
import org.example.ongere.Transaction.Services.IncomeCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeCategoryServiceImpl implements IncomeCategoryService {
    private final IncomeCategoryRepository incomeCategoryRepository;
    private final CategoryMapper categoryMapper;

    public IncomeCategoryServiceImpl(IncomeCategoryRepository incomeCategoryRepository, CategoryMapper categoryMapper) {
        this.incomeCategoryRepository = incomeCategoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void addIncomeCategory(CategoryRequestDTO incomeCategoryDTO) {
        IncomeCategory incomeCategory = categoryMapper
                .mapToIncomeCategory(incomeCategoryDTO);
        incomeCategoryRepository.save(incomeCategory);
    }

    @Override
    public void deleteIncomeCategory() {

    }

    @Override
    public void updateIncomeCategory(Income income, Long id) {

    }

    @Override
    public void getIncomeCategory() {

    }

    @Override
    public List<CategoryResponseDTO> getAllIncomeCategories() {
        List<CategoryResponseDTO>  categoryResponseDTOS = incomeCategoryRepository.findAll()
                .stream()
                .map(categoryMapper::mapToIncomeCategoryResponseDTO)
                .toList();
        return categoryResponseDTOS;
    }
}
