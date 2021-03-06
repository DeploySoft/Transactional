package com.deploysoft.application.persistence.repositories;

import com.deploysoft.application.domain.constant.TypeTransactionEnum;
import com.deploysoft.application.persistence.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 20/09/20
 **/
@Repository
public interface ITransferRepository extends JpaRepository<Transaction, Transaction.TransactionKey> {
    long countDistinctByIdAccountIdAndIdDateAndTypeTransactionEnum(Long account, LocalDate date, TypeTransactionEnum typeTransactionEnum);
}
