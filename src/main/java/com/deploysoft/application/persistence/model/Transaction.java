package com.deploysoft.application.persistence.model;

import com.deploysoft.application.domain.constant.TypeTransactionEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 19/09/20
 **/
@Data
@Entity
@Table(name = "transaction")
public class Transaction implements Serializable {

    @EmbeddedId
    private TransactionKey id;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TypeTransactionEnum typeTransactionEnum;

    private String description;

    @Data
    @Builder
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TransactionKey implements Serializable {

        private Long accountId;

        @Builder.Default
        private LocalDate date = LocalDate.now();

        @Builder.Default
        private LocalTime time =  LocalTime.now();
    }

}