package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.ExecuteAccountSweepRequest;
import org.museframework.bian.casmanandaccser.dto.ExecuteAccountSweepResponse;
import org.museframework.bian.casmanandaccser.dto.InitiateAccountSweepRequest;
import org.museframework.bian.casmanandaccser.dto.InitiateAccountSweepResponse;
import org.museframework.bian.casmanandaccser.dto.RetrieveAccountSweepRequest;
import org.museframework.bian.casmanandaccser.dto.RetrieveAccountSweepResponse;
import org.museframework.bian.casmanandaccser.dto.UpdateAccountSweepRequest;
import org.museframework.bian.casmanandaccser.dto.UpdateAccountSweepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="AccountSweep")
public interface BqAccountSweep {
    @GenericDtxEndpoint
    @Description("InBQ Set up an account sweep")
    InitiateAccountSweepResponse initiateAccountSweep(InitiateAccountSweepRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an existing account sweep")
    UpdateAccountSweepResponse updateAccountSweep(UpdateAccountSweepRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Trigger an account sweep transaction")
    ExecuteAccountSweepResponse executeAccountSweep(ExecuteAccountSweepRequest req);

    @Description("ReBQ Retrieve details about an active sweep facility or specific sweep transaction")
    RetrieveAccountSweepResponse retrieveAccountSweep(RetrieveAccountSweepRequest req);
}