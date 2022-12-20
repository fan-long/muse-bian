package org.museframework.bian.secfaipro;

import org.museframework.bian.secfaipro.dto.ExchangeSecuritiesFailDeterminationWorkstepRequest;
import org.museframework.bian.secfaipro.dto.ExchangeSecuritiesFailDeterminationWorkstepResponse;
import org.museframework.bian.secfaipro.dto.ExecuteSecuritiesFailDeterminationWorkstepRequest;
import org.museframework.bian.secfaipro.dto.ExecuteSecuritiesFailDeterminationWorkstepResponse;
import org.museframework.bian.secfaipro.dto.InitiateSecuritiesFailDeterminationWorkstepRequest;
import org.museframework.bian.secfaipro.dto.InitiateSecuritiesFailDeterminationWorkstepResponse;
import org.museframework.bian.secfaipro.dto.NotifySecuritiesFailDeterminationWorkstepRequest;
import org.museframework.bian.secfaipro.dto.NotifySecuritiesFailDeterminationWorkstepResponse;
import org.museframework.bian.secfaipro.dto.RequestSecuritiesFailDeterminationWorkstepRequest;
import org.museframework.bian.secfaipro.dto.RequestSecuritiesFailDeterminationWorkstepResponse;
import org.museframework.bian.secfaipro.dto.RetrieveSecuritiesFailDeterminationWorkstepRequest;
import org.museframework.bian.secfaipro.dto.RetrieveSecuritiesFailDeterminationWorkstepResponse;
import org.museframework.bian.secfaipro.dto.UpdateSecuritiesFailDeterminationWorkstepRequest;
import org.museframework.bian.secfaipro.dto.UpdateSecuritiesFailDeterminationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Securities Fail Determination Workstep in the context of executing the Securities Fail Determination Workstep")
@GenericDomain(name="SecuritiesFailsProcessing", group="SecuritiesFailDeterminationWorkstep")
public interface BqSecuritiesFailDeterminationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Securities Fail Determination Workstep")
    ExchangeSecuritiesFailDeterminationWorkstepResponse exchangeSecuritiesFailDeterminationWorkstep(ExchangeSecuritiesFailDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Securities Fail Determination Workstep")
    ExecuteSecuritiesFailDeterminationWorkstepResponse executeSecuritiesFailDeterminationWorkstep(ExecuteSecuritiesFailDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Securities Fail Determination Workstep")
    InitiateSecuritiesFailDeterminationWorkstepResponse initiateSecuritiesFailDeterminationWorkstep(InitiateSecuritiesFailDeterminationWorkstepRequest req);

    @Description("Notify Securities Fail Determination Workstep")
    NotifySecuritiesFailDeterminationWorkstepResponse notifySecuritiesFailDeterminationWorkstep(NotifySecuritiesFailDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Securities Fail Determination Workstep")
    RequestSecuritiesFailDeterminationWorkstepResponse requestSecuritiesFailDeterminationWorkstep(RequestSecuritiesFailDeterminationWorkstepRequest req);

    @Description("Retrieve Securities Fail Determination Workstep")
    RetrieveSecuritiesFailDeterminationWorkstepResponse retrieveSecuritiesFailDeterminationWorkstep(RetrieveSecuritiesFailDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Securities Fail Determination Workstep")
    UpdateSecuritiesFailDeterminationWorkstepResponse updateSecuritiesFailDeterminationWorkstep(UpdateSecuritiesFailDeterminationWorkstepRequest req);
}