package org.museframework.bian.corporateaction;

import org.museframework.bian.corporateaction.dto.ExchangeSecuritySpin_OffActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExchangeSecuritySpin_OffActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.ExecuteSecuritySpin_OffActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExecuteSecuritySpin_OffActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.InitiateSecuritySpin_OffActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.InitiateSecuritySpin_OffActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.NotifySecuritySpin_OffActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.NotifySecuritySpin_OffActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RequestSecuritySpin_OffActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RequestSecuritySpin_OffActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RetrieveSecuritySpin_OffActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RetrieveSecuritySpin_OffActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.UpdateSecuritySpin_OffActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.UpdateSecuritySpin_OffActionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep")
@GenericDomain(name="CorporateAction", group="SecuritySpin_OffActionWorkstep")
public interface BqSecuritySpin_OffActionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Security Spin-Off Action Workstep")
    ExchangeSecuritySpin_OffActionWorkstepResponse exchangeSecuritySpin_OffActionWorkstep(ExchangeSecuritySpin_OffActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Security Spin-Off Action Workstep")
    ExecuteSecuritySpin_OffActionWorkstepResponse executeSecuritySpin_OffActionWorkstep(ExecuteSecuritySpin_OffActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Security Spin-Off Action Workstep")
    InitiateSecuritySpin_OffActionWorkstepResponse initiateSecuritySpin_OffActionWorkstep(InitiateSecuritySpin_OffActionWorkstepRequest req);

    @Description("Notify Security Spin-Off Action Workstep")
    NotifySecuritySpin_OffActionWorkstepResponse notifySecuritySpin_OffActionWorkstep(NotifySecuritySpin_OffActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Security Spin-Off Action Workstep")
    RequestSecuritySpin_OffActionWorkstepResponse requestSecuritySpin_OffActionWorkstep(RequestSecuritySpin_OffActionWorkstepRequest req);

    @Description("Retrieve Security Spin-Off Action Workstep")
    RetrieveSecuritySpin_OffActionWorkstepResponse retrieveSecuritySpin_OffActionWorkstep(RetrieveSecuritySpin_OffActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Security Spin-Off Action Workstep")
    UpdateSecuritySpin_OffActionWorkstepResponse updateSecuritySpin_OffActionWorkstep(UpdateSecuritySpin_OffActionWorkstepRequest req);
}