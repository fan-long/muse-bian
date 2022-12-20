package org.museframework.bian.savingsaccount;

import org.museframework.bian.savingsaccount.dto.ExecuteDepositsandWithdrawalsRequest;
import org.museframework.bian.savingsaccount.dto.ExecuteDepositsandWithdrawalsResponse;
import org.museframework.bian.savingsaccount.dto.InitiateDepositsandWithdrawalsRequest;
import org.museframework.bian.savingsaccount.dto.InitiateDepositsandWithdrawalsResponse;
import org.museframework.bian.savingsaccount.dto.RetrieveDepositsandWithdrawalsRequest;
import org.museframework.bian.savingsaccount.dto.RetrieveDepositsandWithdrawalsResponse;
import org.museframework.bian.savingsaccount.dto.UpdateDepositsandWithdrawalsRequest;
import org.museframework.bian.savingsaccount.dto.UpdateDepositsandWithdrawalsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="SavingsAccount", group="DepositsandWithdrawals")
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