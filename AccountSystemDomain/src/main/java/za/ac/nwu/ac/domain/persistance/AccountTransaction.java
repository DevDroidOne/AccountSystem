package za.ac.nwu.ac.domain.persistance;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Entity
@Table(name = "DEMO_ACCOUNT_TX",schema = "DEMO_SCHEMA")

public class AccountTransaction implements Serializable {
    @Id

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    private AccountType accountTypeId;

    @Column(name="ACCOUNT_TX_ID")
    private Long AccountTxId;

    @Column(name="AMOUNT")
    private int amount;

    @Column(name="MEMBER_ID")
    private Long MemberId;

    @Column(name="TX_DATE")
    private LocalDate TxDate;


}
