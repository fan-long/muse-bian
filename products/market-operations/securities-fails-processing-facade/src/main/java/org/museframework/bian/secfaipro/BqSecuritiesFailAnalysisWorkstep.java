package org.museframework.bian.secfaipro;

import org.museframework.bian.secfaipro.dto.ExchangeSecuritiesFailAnalysisWorkstepRequest;
import org.museframework.bian.secfaipro.dto.ExchangeSecuritiesFailAnalysisWorkstepResponse;
import org.museframework.bian.secfaipro.dto.ExecuteSecuritiesFailAnalysisWorkstepRequest;
import org.museframework.bian.secfaipro.dto.ExecuteSecuritiesFailAnalysisWorkstepResponse;
import org.museframework.bian.secfaipro.dto.InitiateSecuritiesFailAnalysisWorkstepRequest;
import org.museframework.bian.secfaipro.dto.InitiateSecuritiesFailAnalysisWorkstepResponse;
import org.museframework.bian.secfaipro.dto.NotifySecuritiesFailAnalysisWorkstepRequest;
import org.museframework.bian.secfaipro.dto.NotifySecuritiesFailAnalysisWorkstepResponse;
import org.museframework.bian.secfaipro.dto.RequestSecuritiesFailAnalysisWorkstepRequest;
import org.museframework.bian.secfaipro.dto.RequestSecuritiesFailAnalysisWorkstepResponse;
import org.museframework.bian.secfaipro.dto.RetrieveSecuritiesFailAnalysisWorkstepRequest;
import org.museframework.bian.secfaipro.dto.RetrieveSecuritiesFailAnalysisWorkstepResponse;
import org.museframework.bian.secfaipro.dto.UpdateSecuritiesFailAnalysisWorkstepRequest;
import org.museframework.bian.secfaipro.dto.UpdateSecuritiesFailAnalysisWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Securities Fail Determination Workstep in the context of executing the Securities Fail Determination Workstep")
@GenericDomain(name="SecuritiesFailsProcessing", group="SecuritiesFailAnalysisWorkstep")
public interface BqSecuritiesFailAnalysisWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Securities Fail Analysis Workstep")
    ExchangeSecuritiesFailAnalysisWorkstepResponse exchangeSecuritiesFailAnalysisWorkstep(ExchangeSecuritiesFailAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Securities Fail Analysis Workstep")
    ExecuteSecuritiesFailAnalysisWorkstepResponse executeSecuritiesFailAnalysisWorkstep(ExecuteSecuritiesFailAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Securities Fail Analysis Workstep")
    InitiateSecuritiesFailAnalysisWorkstepResponse initiateSecuritiesFailAnalysisWorkstep(InitiateSecuritiesFailAnalysisWorkstepRequest req);

    @Description("Notify Securities Fail Analysis Workstep")
    NotifySecuritiesFailAnalysisWorkstepResponse notifySecuritiesFailAnalysisWorkstep(NotifySecuritiesFailAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Securities Fail Analysis Workstep")
    RequestSecuritiesFailAnalysisWorkstepResponse requestSecuritiesFailAnalysisWorkstep(RequestSecuritiesFailAnalysisWorkstepRequest req);

    @Description("Retrieve Securities Fail Analysis Workstep")
    RetrieveSecuritiesFailAnalysisWorkstepResponse retrieveSecuritiesFailAnalysisWorkstep(RetrieveSecuritiesFailAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Securities Fail Analysis Workstep")
    UpdateSecuritiesFailAnalysisWorkstepResponse updateSecuritiesFailAnalysisWorkstep(UpdateSecuritiesFailAnalysisWorkstepRequest req);
}