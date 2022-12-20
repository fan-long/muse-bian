package org.museframework.bian.itstaandgui;

import org.museframework.bian.itstaandgui.dto.CaptureTechnologyStandardsSpecificationRequest;
import org.museframework.bian.itstaandgui.dto.CaptureTechnologyStandardsSpecificationResponse;
import org.museframework.bian.itstaandgui.dto.ControlTechnologyStandardsSpecificationRequest;
import org.museframework.bian.itstaandgui.dto.ControlTechnologyStandardsSpecificationResponse;
import org.museframework.bian.itstaandgui.dto.ExchangeTechnologyStandardsSpecificationRequest;
import org.museframework.bian.itstaandgui.dto.ExchangeTechnologyStandardsSpecificationResponse;
import org.museframework.bian.itstaandgui.dto.InitiateTechnologyStandardsSpecificationRequest;
import org.museframework.bian.itstaandgui.dto.InitiateTechnologyStandardsSpecificationResponse;
import org.museframework.bian.itstaandgui.dto.RequestTechnologyStandardsSpecificationRequest;
import org.museframework.bian.itstaandgui.dto.RequestTechnologyStandardsSpecificationResponse;
import org.museframework.bian.itstaandgui.dto.RetrieveTechnologyStandardsSpecificationRequest;
import org.museframework.bian.itstaandgui.dto.RetrieveTechnologyStandardsSpecificationResponse;
import org.museframework.bian.itstaandgui.dto.UpdateTechnologyStandardsSpecificationRequest;
import org.museframework.bian.itstaandgui.dto.UpdateTechnologyStandardsSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within IT Standards & Guidelines.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ITStandardsAndGuidelines", group="TechnologyStandardsSpecification")
public interface CrTechnologyStandardsSpecification {
    @GenericDtxEndpoint
    @Description("CaCR Capture Technology Standards Specification activity or event related information")
    CaptureTechnologyStandardsSpecificationResponse captureTechnologyStandardsSpecification(CaptureTechnologyStandardsSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Technology Standards Specification")
    ControlTechnologyStandardsSpecificationResponse controlTechnologyStandardsSpecification(ControlTechnologyStandardsSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Technology Standards Specification processing")
    ExchangeTechnologyStandardsSpecificationResponse exchangeTechnologyStandardsSpecification(ExchangeTechnologyStandardsSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Technology Standards Specification")
    InitiateTechnologyStandardsSpecificationResponse initiateTechnologyStandardsSpecification(InitiateTechnologyStandardsSpecificationRequest req);

    @Description("ReCR Retrieve details about any aspect of Technology Standards Specification")
    RetrieveTechnologyStandardsSpecificationResponse retrieveTechnologyStandardsSpecification(RetrieveTechnologyStandardsSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Technology Standards Specification")
    RequestTechnologyStandardsSpecificationResponse requestTechnologyStandardsSpecification(RequestTechnologyStandardsSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Technology Standards Specification")
    UpdateTechnologyStandardsSpecificationResponse updateTechnologyStandardsSpecification(UpdateTechnologyStandardsSpecificationRequest req);
}