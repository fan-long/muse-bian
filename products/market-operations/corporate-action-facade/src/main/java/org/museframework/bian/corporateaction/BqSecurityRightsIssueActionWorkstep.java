package org.museframework.bian.corporateaction;

import org.museframework.bian.corporateaction.dto.ExchangeSecurityRightsIssueActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExchangeSecurityRightsIssueActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.ExecuteSecurityRightsIssueActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExecuteSecurityRightsIssueActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.InitiateSecurityRightsIssueActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.InitiateSecurityRightsIssueActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.NotifySecurityRightsIssueActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.NotifySecurityRightsIssueActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RequestSecurityRightsIssueActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RequestSecurityRightsIssueActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RetrieveSecurityRightsIssueActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RetrieveSecurityRightsIssueActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.UpdateSecurityRightsIssueActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.UpdateSecurityRightsIssueActionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep")
@GenericDomain(name="CorporateAction", group="SecurityRightsIssueActionWorkstep")
public interface BqSecurityRightsIssueActionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Security Rights Issue Action Workstep")
    ExchangeSecurityRightsIssueActionWorkstepResponse exchangeSecurityRightsIssueActionWorkstep(ExchangeSecurityRightsIssueActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Security Rights Issue Action Workstep")
    ExecuteSecurityRightsIssueActionWorkstepResponse executeSecurityRightsIssueActionWorkstep(ExecuteSecurityRightsIssueActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Security Rights Issue Action Workstep")
    InitiateSecurityRightsIssueActionWorkstepResponse initiateSecurityRightsIssueActionWorkstep(InitiateSecurityRightsIssueActionWorkstepRequest req);

    @Description("Notify Security Rights Issue Action Workstep")
    NotifySecurityRightsIssueActionWorkstepResponse notifySecurityRightsIssueActionWorkstep(NotifySecurityRightsIssueActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Security Rights Issue Action Workstep")
    RequestSecurityRightsIssueActionWorkstepResponse requestSecurityRightsIssueActionWorkstep(RequestSecurityRightsIssueActionWorkstepRequest req);

    @Description("Retrieve Security Rights Issue Action Workstep")
    RetrieveSecurityRightsIssueActionWorkstepResponse retrieveSecurityRightsIssueActionWorkstep(RetrieveSecurityRightsIssueActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Security Rights Issue Action Workstep")
    UpdateSecurityRightsIssueActionWorkstepResponse updateSecurityRightsIssueActionWorkstep(UpdateSecurityRightsIssueActionWorkstepRequest req);
}