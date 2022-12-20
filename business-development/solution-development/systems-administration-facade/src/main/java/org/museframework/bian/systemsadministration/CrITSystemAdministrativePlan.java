package org.museframework.bian.systemsadministration;

import org.museframework.bian.systemsadministration.dto.CaptureITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.CaptureITSystemAdministrativePlanResponse;
import org.museframework.bian.systemsadministration.dto.ControlITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.ControlITSystemAdministrativePlanResponse;
import org.museframework.bian.systemsadministration.dto.ExchangeITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.ExchangeITSystemAdministrativePlanResponse;
import org.museframework.bian.systemsadministration.dto.GrantITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.GrantITSystemAdministrativePlanResponse;
import org.museframework.bian.systemsadministration.dto.InitiateITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.InitiateITSystemAdministrativePlanResponse;
import org.museframework.bian.systemsadministration.dto.RequestITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.RequestITSystemAdministrativePlanResponse;
import org.museframework.bian.systemsadministration.dto.RetrieveITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.RetrieveITSystemAdministrativePlanResponse;
import org.museframework.bian.systemsadministration.dto.UpdateITSystemAdministrativePlanRequest;
import org.museframework.bian.systemsadministration.dto.UpdateITSystemAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="SystemsAdministration", group="ITSystemAdministrativePlan")
public interface CrITSystemAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CaCR Capture IT System Administrative Plan activity or event related information")
    CaptureITSystemAdministrativePlanResponse captureITSystemAdministrativePlan(CaptureITSystemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of IT System Administrative Plan")
    ControlITSystemAdministrativePlanResponse controlITSystemAdministrativePlan(ControlITSystemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of IT System Administrative Plan processing")
    ExchangeITSystemAdministrativePlanResponse exchangeITSystemAdministrativePlan(ExchangeITSystemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to IT System Administrative Plan")
    GrantITSystemAdministrativePlanResponse grantITSystemAdministrativePlan(GrantITSystemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new IT System Administrative Plan")
    InitiateITSystemAdministrativePlanResponse initiateITSystemAdministrativePlan(InitiateITSystemAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about any aspect of IT System Administrative Plan")
    RetrieveITSystemAdministrativePlanResponse retrieveITSystemAdministrativePlan(RetrieveITSystemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to IT System Administrative Plan")
    RequestITSystemAdministrativePlanResponse requestITSystemAdministrativePlan(RequestITSystemAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to IT System Administrative Plan")
    UpdateITSystemAdministrativePlanResponse updateITSystemAdministrativePlan(UpdateITSystemAdministrativePlanRequest req);
}