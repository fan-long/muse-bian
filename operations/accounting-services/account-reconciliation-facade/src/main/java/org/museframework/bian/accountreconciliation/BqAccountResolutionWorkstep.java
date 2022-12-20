package org.museframework.bian.accountreconciliation;

import org.museframework.bian.accountreconciliation.dto.ExchangeAccountResolutionWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.ExchangeAccountResolutionWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.ExecuteAccountResolutionWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.ExecuteAccountResolutionWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.InitiateAccountResolutionWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.InitiateAccountResolutionWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.NotifyAccountResolutionWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.NotifyAccountResolutionWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.RequestAccountResolutionWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.RequestAccountResolutionWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.RetrieveAccountResolutionWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.RetrieveAccountResolutionWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.UpdateAccountResolutionWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.UpdateAccountResolutionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Account Resolution Workstep in the context of executing the Account Resolution Workstep")
@GenericDomain(name="AccountReconciliation", group="AccountResolutionWorkstep")
public interface BqAccountResolutionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Account Resolution Workstep")
    ExchangeAccountResolutionWorkstepResponse exchangeAccountResolutionWorkstep(ExchangeAccountResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Account Resolution Workstep")
    ExecuteAccountResolutionWorkstepResponse executeAccountResolutionWorkstep(ExecuteAccountResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Account Resolution Workstep")
    InitiateAccountResolutionWorkstepResponse initiateAccountResolutionWorkstep(InitiateAccountResolutionWorkstepRequest req);

    @Description("Notify Account Resolution Workstep")
    NotifyAccountResolutionWorkstepResponse notifyAccountResolutionWorkstep(NotifyAccountResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Account Resolution Workstep")
    RequestAccountResolutionWorkstepResponse requestAccountResolutionWorkstep(RequestAccountResolutionWorkstepRequest req);

    @Description("Retrieve Account Resolution Workstep")
    RetrieveAccountResolutionWorkstepResponse retrieveAccountResolutionWorkstep(RetrieveAccountResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Account Resolution Workstep")
    UpdateAccountResolutionWorkstepResponse updateAccountResolutionWorkstep(UpdateAccountResolutionWorkstepRequest req);
}