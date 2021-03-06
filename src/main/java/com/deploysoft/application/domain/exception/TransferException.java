package com.deploysoft.application.domain.exception;

import com.deploysoft.application.domain.constant.ErrorEnum;
import lombok.Getter;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 20/09/20
 **/

@Getter
public class TransferException extends Exception {
    private ErrorEnum error;

    public TransferException(ErrorEnum error) {
        super(error.getMessage());
        this.error = error;
    }
}
