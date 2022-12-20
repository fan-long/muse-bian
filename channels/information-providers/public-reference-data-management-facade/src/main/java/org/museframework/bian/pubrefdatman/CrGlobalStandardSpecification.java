package org.museframework.bian.pubrefdatman;

import org.museframework.bian.pubrefdatman.dto.CaptureGlobalStandardSpecificationRequest;
import org.museframework.bian.pubrefdatman.dto.CaptureGlobalStandardSpecificationResponse;
import org.museframework.bian.pubrefdatman.dto.ControlGlobalStandardSpecificationRequest;
import org.museframework.bian.pubrefdatman.dto.ControlGlobalStandardSpecificationResponse;
import org.museframework.bian.pubrefdatman.dto.ExchangeGlobalStandardSpecificationRequest;
import org.museframework.bian.pubrefdatman.dto.ExchangeGlobalStandardSpecificationResponse;
import org.museframework.bian.pubrefdatman.dto.InitiateGlobalStandardSpecificationRequest;
import org.museframework.bian.pubrefdatman.dto.InitiateGlobalStandardSpecificationResponse;
import org.museframework.bian.pubrefdatman.dto.RequestGlobalStandardSpecificationRequest;
import org.museframework.bian.pubrefdatman.dto.RequestGlobalStandardSpecificationResponse;
import org.museframework.bian.pubrefdatman.dto.RetrieveGlobalStandardSpecificationRequest;
import org.museframework.bian.pubrefdatman.dto.RetrieveGlobalStandardSpecificationResponse;
import org.museframework.bian.pubrefdatman.dto.UpdateGlobalStandardSpecificationRequest;
import org.museframework.bian.pubrefdatman.dto.UpdateGlobalStandardSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Public Reference Data Management.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="PublicReferenceDataManagement", group="GlobalStandardSpecification")
public interface CrGlobalStandardSpecification {
    @GenericDtxEndpoint
    @Description("CaCR Capture Global Standard Specification activity or event related information")
    CaptureGlobalStandardSpecificationResponse captureGlobalStandardSpecification(CaptureGlobalStandardSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Global Standard Specification")
    ControlGlobalStandardSpecificationResponse controlGlobalStandardSpecification(ControlGlobalStandardSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Global Standard Specification processing")
    ExchangeGlobalStandardSpecificationResponse exchangeGlobalStandardSpecification(ExchangeGlobalStandardSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Global Standard Specification")
    InitiateGlobalStandardSpecificationResponse initiateGlobalStandardSpecification(InitiateGlobalStandardSpecificationRequest req);

    @Description("ReCR Retrieve details about any aspect of Global Standard Specification")
    RetrieveGlobalStandardSpecificationResponse retrieveGlobalStandardSpecification(RetrieveGlobalStandardSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Global Standard Specification")
    RequestGlobalStandardSpecificationResponse requestGlobalStandardSpecification(RequestGlobalStandardSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Global Standard Specification")
    UpdateGlobalStandardSpecificationResponse updateGlobalStandardSpecification(UpdateGlobalStandardSpecificationRequest req);
}