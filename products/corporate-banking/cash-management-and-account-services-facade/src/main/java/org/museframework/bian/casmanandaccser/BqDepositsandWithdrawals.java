package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.ExecuteDepositsandWithdrawalsRequest;
import org.museframework.bian.casmanandaccser.dto.ExecuteDepositsandWithdrawalsResponse;
import org.museframework.bian.casmanandaccser.dto.InitiateDepositsandWithdrawalsRequest;
import org.museframework.bian.casmanandaccser.dto.InitiateDepositsandWithdrawalsResponse;
import org.museframework.bian.casmanandaccser.dto.RetrieveDepositsandWithdrawalsRequest;
import org.museframework.bian.casmanandaccser.dto.RetrieveDepositsandWithdrawalsResponse;
import org.museframework.bian.casmanandaccser.dto.UpdateDepositsandWithdrawalsRequest;
import org.museframework.bian.casmanandaccser.dto.UpdateDepositsandWithdrawalsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="DepositsandWithdrawals")
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