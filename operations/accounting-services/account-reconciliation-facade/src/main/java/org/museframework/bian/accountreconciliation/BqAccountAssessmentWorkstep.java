package org.museframework.bian.accountreconciliation;

import org.museframework.bian.accountreconciliation.dto.ExchangeAccountAssessmentWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.ExchangeAccountAssessmentWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.ExecuteAccountAssessmentWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.ExecuteAccountAssessmentWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.InitiateAccountAssessmentWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.InitiateAccountAssessmentWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.NotifyAccountAssessmentWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.NotifyAccountAssessmentWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.RequestAccountAssessmentWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.RequestAccountAssessmentWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.RetrieveAccountAssessmentWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.RetrieveAccountAssessmentWorkstepResponse;
import org.museframework.bian.accountreconciliation.dto.UpdateAccountAssessmentWorkstepRequest;
import org.museframework.bian.accountreconciliation.dto.UpdateAccountAssessmentWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Account Resolution Workstep in the context of executing the Account Resolution Workstep")
@GenericDomain(name="AccountReconciliation", group="AccountAssessmentWorkstep")
public interface BqAccountAssessmentWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Account Assessment Workstep")
    ExchangeAccountAssessmentWorkstepResponse exchangeAccountAssessmentWorkstep(ExchangeAccountAssessmentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Account Assessment Workstep")
    ExecuteAccountAssessmentWorkstepResponse executeAccountAssessmentWorkstep(ExecuteAccountAssessmentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Account Assessment Workstep")
    InitiateAccountAssessmentWorkstepResponse initiateAccountAssessmentWorkstep(InitiateAccountAssessmentWorkstepRequest req);

    @Description("Notify Account Assessment Workstep")
    NotifyAccountAssessmentWorkstepResponse notifyAccountAssessmentWorkstep(NotifyAccountAssessmentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Account Assessment Workstep")
    RequestAccountAssessmentWorkstepResponse requestAccountAssessmentWorkstep(RequestAccountAssessmentWorkstepRequest req);

    @Description("Retrieve Account Assessment Workstep")
    RetrieveAccountAssessmentWorkstepResponse retrieveAccountAssessmentWorkstep(RetrieveAccountAssessmentWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Account Assessment Workstep")
    UpdateAccountAssessmentWorkstepResponse updateAccountAssessmentWorkstep(UpdateAccountAssessmentWorkstepRequest req);
}