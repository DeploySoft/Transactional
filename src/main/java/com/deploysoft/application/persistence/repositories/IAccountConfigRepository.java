package com.deploysoft.application.persistence.repositories;

import com.deploysoft.application.persistence.model.AccountConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 20/09/20
 **/
@Repository
public interface IAccountConfigRepository extends JpaRepository<AccountConfig, AccountConfig.AccountConfigKey> {

}