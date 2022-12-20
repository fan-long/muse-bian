package org.museframework.bian.investmentaccount;

import org.museframework.bian.investmentaccount.dto.ExecuteDepositsandWithdrawalsRequest;
import org.museframework.bian.investmentaccount.dto.ExecuteDepositsandWithdrawalsResponse;
import org.museframework.bian.investmentaccount.dto.InitiateDepositsandWithdrawalsRequest;
import org.museframework.bian.investmentaccount.dto.InitiateDepositsandWithdrawalsResponse;
import org.museframework.bian.investmentaccount.dto.RetrieveDepositsandWithdrawalsRequest;
import org.museframework.bian.investmentaccount.dto.RetrieveDepositsandWithdrawalsResponse;
import org.museframework.bian.investmentaccount.dto.UpdateDepositsandWithdrawalsRequest;
import org.museframework.bian.investmentaccount.dto.UpdateDepositsandWithdrawalsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="InvestmentAccount", group="DepositsandWithdrawals")
public interface BqDepositsandWithdrawals {
    @GenericDtxEndpoint
    @Description("InBQ Initiate/set-up securities deposit and withdrawal processing for the account")
    InitiateDepositsandWithdrawalsResponse initiateDepositsandWithdrawals(InitiateDepositsandWithdrawalsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update securities deposit and withdrawal settings or transactions")
    UpdateDepositsandWithdrawalsResponse updateDepositsandWithdrawals(UpdateDepositsandWithdrawalsRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a securities deposit or withdrawal transaction")
    ExecuteDepositsandWithdrawalsResponse executeDepositsandWithdrawals(ExecuteDepositsandWithdrawalsRequest req);

    @Description("ReBQ Retrieve details about a securities deposit or withdrawal action")
    RetrieveDepositsandWithdrawalsResponse retrieveDepositsandWithdrawals(RetrieveDepositsandWithdrawalsRequest req);
}