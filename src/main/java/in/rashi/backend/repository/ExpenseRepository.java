package in.rashi.backend.repository;

import in.rashi.backend.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * JPA repository for Expense resource
 * 
 * @author rashi
 */

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
    /**
     * It will find the single expense from database
     * 
     * @param expenseId
     * @return Optional
     */
    Optional<ExpenseEntity> findByExpenseId(String expenseId);
}
