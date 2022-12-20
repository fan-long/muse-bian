package org.museframework.bian.corcuracc;

import org.museframework.bian.corcuracc.dto.ExecuteDepositsandWithdrawalsRequest;
import org.museframework.bian.corcuracc.dto.ExecuteDepositsandWithdrawalsResponse;
import org.museframework.bian.corcuracc.dto.InitiateDepositsandWithdrawalsRequest;
import org.museframework.bian.corcuracc.dto.InitiateDepositsandWithdrawalsResponse;
import org.museframework.bian.corcuracc.dto.RetrieveDepositsandWithdrawalsRequest;
import org.museframework.bian.corcuracc.dto.RetrieveDepositsandWithdrawalsResponse;
import org.museframework.bian.corcuracc.dto.UpdateDepositsandWithdrawalsRequest;
import org.museframework.bian.corcuracc.dto.UpdateDepositsandWithdrawalsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateCurrentAccount", group="DepositsandWithdrawals")
public interface BqDepositsandWithdrawals {
    @GenericDtxEndpoint
    @Description("InBQ Initialize deposit or withdrawal transaction")
    InitiateDepositsandWithdrawalsResponse initiateDepositsandWithdrawals(InitiateDepositsandWithdrawalsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update/correct a deposit or withdrawal transaction")
    UpdateDepositsandWithdrawalsResponse updateDepositsandWithdrawals(UpdateDepositsandWithdrawalsRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a deposit or withdrawal transaction")
    ExecuteDepositsandWithdrawalsResponse executeDepositsandWithdrawals(ExecuteDepositsandWithdrawalsRequest req);

    @Description("ReBQ Retrieve details about a deposit or withdrawal transaction")
    RetrieveDepositsandWithdrawalsResponse retrieveDepositsandWithdrawals(RetrieveDepositsandWithdrawalsRequest req);
}