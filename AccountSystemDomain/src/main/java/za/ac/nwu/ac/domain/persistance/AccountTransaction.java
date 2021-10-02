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
@Table(name = "DEMO_ACCOUNT_TX",schema = "JANCO")

public class AccountTransaction implements Serializable {
    @Id
    @Column(name = "ACCOUNT_TYPE_ID")
    private Long accountTypeId;

    @Column(name="ACCOUNT_TX_ID")
    private Long AccountTxId;

    @Column(name="AMOUNT")
    private int amount;

    @Column(name="MEMBER_ID")
    private Long MemberId;

    @Column(name="TX_DATE")
    private LocalDate TxDate;


}
