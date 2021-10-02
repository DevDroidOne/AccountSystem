package za.ac.nwu.ac.domain.persistance;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="DEMO_ACCOUNT_TYPE", schema = "JANCO")
public class AccountType implements Serializable {

    @Id
    @Column(name = "ACCOUNT_TYPE_ID", nullable = false)
    private Long accountType_Id;

    @Column(name="MNEMONIC")
    private String mnemonic;

    @Column(name="ACCOUNT_TYPE_NAME")
    private String accountTypeName;

    @Column(name="CREATION_DATE")
    private LocalDate creationDate;

    public AccountType(Long accountType_Id, String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.accountType_Id = accountType_Id;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountType() {
    }

    public Long getAccountType_Id() {
        return accountType_Id;
    }

    public void setAccountType_Id(Long accountType_Id) {
        this.accountType_Id = accountType_Id;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(accountType_Id, that.accountType_Id) && Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType_Id, mnemonic, accountTypeName, creationDate);
    }

    @Override
    public String toString(){
        return "AccountType{" +
                "accountType_Id=" + accountType_Id +
                ", mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
