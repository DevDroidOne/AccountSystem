package za.ac.nwu.ac.logic.flow;


import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.util.List;


public interface FetchAccountTypeFlow {
    List<AccountTypeDto> getAllAccountTypes();
}
