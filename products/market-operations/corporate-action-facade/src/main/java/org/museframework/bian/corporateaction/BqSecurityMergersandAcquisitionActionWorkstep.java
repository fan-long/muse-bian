package org.museframework.bian.corporateaction;

import org.museframework.bian.corporateaction.dto.ExchangeSecurityMergersandAcquisitionActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExchangeSecurityMergersandAcquisitionActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.ExecuteSecurityMergersandAcquisitionActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExecuteSecurityMergersandAcquisitionActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.InitiateSecurityMergersandAcquisitionActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.InitiateSecurityMergersandAcquisitionActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.NotifySecurityMergersandAcquisitionActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.NotifySecurityMergersandAcquisitionActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RequestSecurityMergersandAcquisitionActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RequestSecurityMergersandAcquisitionActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RetrieveSecurityMergersandAcquisitionActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RetrieveSecurityMergersandAcquisitionActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.UpdateSecurityMergersandAcquisitionActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.UpdateSecurityMergersandAcquisitionActionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep")
@GenericDomain(name="CorporateAction", group="SecurityMergersandAcquisitionActionWorkstep")
public interface BqSecurityMergersandAcquisitionActionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Security Mergers and Acquisition Action Workstep")
    ExchangeSecurityMergersandAcquisitionActionWorkstepResponse exchangeSecurityMergersandAcquisitionActionWorkstep(ExchangeSecurityMergersandAcquisitionActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Security Mergers and Acquisition Action Workstep")
    ExecuteSecurityMergersandAcquisitionActionWorkstepResponse executeSecurityMergersandAcquisitionActionWorkstep(ExecuteSecurityMergersandAcquisitionActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Security Mergers and Acquisition Action Workstep")
    InitiateSecurityMergersandAcquisitionActionWorkstepResponse initiateSecurityMergersandAcquisitionActionWorkstep(InitiateSecurityMergersandAcquisitionActionWorkstepRequest req);

    @Description("Notify Security Mergers and Acquisition Action Workstep")
    NotifySecurityMergersandAcquisitionActionWorkstepResponse notifySecurityMergersandAcquisitionActionWorkstep(NotifySecurityMergersandAcquisitionActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Security Mergers and Acquisition Action Workstep")
    RequestSecurityMergersandAcquisitionActionWorkstepResponse requestSecurityMergersandAcquisitionActionWorkstep(RequestSecurityMergersandAcquisitionActionWorkstepRequest req);

    @Description("Retrieve Security Mergers and Acquisition Action Workstep")
    RetrieveSecurityMergersandAcquisitionActionWorkstepResponse retrieveSecurityMergersandAcquisitionActionWorkstep(RetrieveSecurityMergersandAcquisitionActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Security Mergers and Acquisition Action Workstep")
    UpdateSecurityMergersandAcquisitionActionWorkstepResponse updateSecurityMergersandAcquisitionActionWorkstep(UpdateSecurityMergersandAcquisitionActionWorkstepRequest req);
}