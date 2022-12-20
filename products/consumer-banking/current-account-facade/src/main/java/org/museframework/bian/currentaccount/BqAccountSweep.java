package org.museframework.bian.currentaccount;

import org.museframework.bian.currentaccount.dto.ExecuteAccountSweepRequest;
import org.museframework.bian.currentaccount.dto.ExecuteAccountSweepResponse;
import org.museframework.bian.currentaccount.dto.InitiateAccountSweepRequest;
import org.museframework.bian.currentaccount.dto.InitiateAccountSweepResponse;
import org.museframework.bian.currentaccount.dto.RetrieveAccountSweepRequest;
import org.museframework.bian.currentaccount.dto.RetrieveAccountSweepResponse;
import org.museframework.bian.currentaccount.dto.UpdateAccountSweepRequest;
import org.museframework.bian.currentaccount.dto.UpdateAccountSweepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CurrentAccount", group="AccountSweep")
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

    @Description("ReBQ Retrieve details about a sweep facility or specific sweep transaction")
    RetrieveAccountSweepResponse retrieveAccountSweep(RetrieveAccountSweepRequest req);
}