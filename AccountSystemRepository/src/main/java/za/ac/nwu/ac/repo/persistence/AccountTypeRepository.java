package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistance.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
    @Query(value = "SELECT ACCOUNT_TYPE_ID, ACCOUNT_TYPE_NAME,CREATION_DATE,MNEMONIC FROM DEMO_SCHEMA.ACCOUNT_TYPE WHERE MNEMONIC = :mnemonic", nativeQuery = true)
    AccountType getAccountTypeByMnemonicNativeQuery(String mnemonic);

    @Query(value = "SELECT at FROM AccountType at WHERE at mnemonic = : mnemonic")
    AccountType getAccountTypeByMenemonic(String mnemonic);

    @Query(value = "SELECT new za.ac.nwu.av.domain.dto.AccountTypeDto(at.mnemonic,accountTypeName,at.creationDate) FROM AccountType at WHERE at.mnemonic = :mnemonic ")
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);
}
