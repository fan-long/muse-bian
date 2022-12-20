package org.museframework.bian.leaiteadm;

import org.museframework.bian.leaiteadm.dto.CaptureLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.CaptureLeasingItemAdministrativePlanResponse;
import org.museframework.bian.leaiteadm.dto.ControlLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.ControlLeasingItemAdministrativePlanResponse;
import org.museframework.bian.leaiteadm.dto.ExchangeLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.ExchangeLeasingItemAdministrativePlanResponse;
import org.museframework.bian.leaiteadm.dto.GrantLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.GrantLeasingItemAdministrativePlanResponse;
import org.museframework.bian.leaiteadm.dto.InitiateLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.InitiateLeasingItemAdministrativePlanResponse;
import org.museframework.bian.leaiteadm.dto.RequestLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.RequestLeasingItemAdministrativePlanResponse;
import org.museframework.bian.leaiteadm.dto.RetrieveLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.RetrieveLeasingItemAdministrativePlanResponse;
import org.museframework.bian.leaiteadm.dto.UpdateLeasingItemAdministrativePlanRequest;
import org.museframework.bian.leaiteadm.dto.UpdateLeasingItemAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Leasing Item Administration.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="LeasingItemAdministration", group="LeasingItemAdministrativePlan")
public interface CrLeasingItemAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CaCR Capture Leasing Item Administrative Plan activity or event related information")
    CaptureLeasingItemAdministrativePlanResponse captureLeasingItemAdministrativePlan(CaptureLeasingItemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Leasing Item Administrative Plan")
    ControlLeasingItemAdministrativePlanResponse controlLeasingItemAdministrativePlan(ControlLeasingItemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Leasing Item Administrative Plan processing")
    ExchangeLeasingItemAdministrativePlanResponse exchangeLeasingItemAdministrativePlan(ExchangeLeasingItemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Leasing Item Administrative Plan")
    GrantLeasingItemAdministrativePlanResponse grantLeasingItemAdministrativePlan(GrantLeasingItemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Leasing Item Administrative Plan")
    InitiateLeasingItemAdministrativePlanResponse initiateLeasingItemAdministrativePlan(InitiateLeasingItemAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about any aspect of Leasing Item Administrative Plan")
    RetrieveLeasingItemAdministrativePlanResponse retrieveLeasingItemAdministrativePlan(RetrieveLeasingItemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Leasing Item Administrative Plan")
    RequestLeasingItemAdministrativePlanResponse requestLeasingItemAdministrativePlan(RequestLeasingItemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Leasing Item Administrative Plan")
    UpdateLeasingItemAdministrativePlanResponse updateLeasingItemAdministrativePlan(UpdateLeasingItemAdministrativePlanRequest req);
}