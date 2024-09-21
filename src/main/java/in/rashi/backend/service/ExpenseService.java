package in.rashi.backend.service;

import in.rashi.backend.dto.ExpenseDTO;

import java.util.List;

/**
 * Service interface for Expense module
 * @author Rashi
 * */
public interface ExpenseService {

    /**
     * It will fetch the expenses from database
     * @return list
     * */
    List<ExpenseDTO> getAllExpenses();
}
