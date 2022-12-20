package org.museframework.bian.enterprisearchitecture;

import org.museframework.bian.enterprisearchitecture.dto.CaptureEnterpriseArchitectureSpecificationRequest;
import org.museframework.bian.enterprisearchitecture.dto.CaptureEnterpriseArchitectureSpecificationResponse;
import org.museframework.bian.enterprisearchitecture.dto.ControlEnterpriseArchitectureSpecificationRequest;
import org.museframework.bian.enterprisearchitecture.dto.ControlEnterpriseArchitectureSpecificationResponse;
import org.museframework.bian.enterprisearchitecture.dto.ExchangeEnterpriseArchitectureSpecificationRequest;
import org.museframework.bian.enterprisearchitecture.dto.ExchangeEnterpriseArchitectureSpecificationResponse;
import org.museframework.bian.enterprisearchitecture.dto.InitiateEnterpriseArchitectureSpecificationRequest;
import org.museframework.bian.enterprisearchitecture.dto.InitiateEnterpriseArchitectureSpecificationResponse;
import org.museframework.bian.enterprisearchitecture.dto.RequestEnterpriseArchitectureSpecificationRequest;
import org.museframework.bian.enterprisearchitecture.dto.RequestEnterpriseArchitectureSpecificationResponse;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveEnterpriseArchitectureSpecificationRequest;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveEnterpriseArchitectureSpecificationResponse;
import org.museframework.bian.enterprisearchitecture.dto.UpdateEnterpriseArchitectureSpecificationRequest;
import org.museframework.bian.enterprisearchitecture.dto.UpdateEnterpriseArchitectureSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="EnterpriseArchitecture", group="EnterpriseArchitectureSpecification")
public interface CrEnterpriseArchitectureSpecification {
    @GenericDtxEndpoint
    @Description("CaCR Capture Business Architecture Specification activity or event related information")
    CaptureEnterpriseArchitectureSpecificationResponse captureEnterpriseArchitectureSpecification(CaptureEnterpriseArchitectureSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Business Architecture Specification")
    ControlEnterpriseArchitectureSpecificationResponse controlEnterpriseArchitectureSpecification(ControlEnterpriseArchitectureSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Business Architecture Specification processing")
    ExchangeEnterpriseArchitectureSpecificationResponse exchangeEnterpriseArchitectureSpecification(ExchangeEnterpriseArchitectureSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Business Architecture Specification")
    InitiateEnterpriseArchitectureSpecificationResponse initiateEnterpriseArchitectureSpecification(InitiateEnterpriseArchitectureSpecificationRequest req);

    @Description("ReCR Retrieve details about any aspect of Enterprise Architecture Specification")
    RetrieveEnterpriseArchitectureSpecificationResponse retrieveEnterpriseArchitectureSpecification(RetrieveEnterpriseArchitectureSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Enterprise Architecture Specification")
    RequestEnterpriseArchitectureSpecificationResponse requestEnterpriseArchitectureSpecification(RequestEnterpriseArchitectureSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Enterprise Architecture Specification")
    UpdateEnterpriseArchitectureSpecificationResponse updateEnterpriseArchitectureSpecification(UpdateEnterpriseArchitectureSpecificationRequest req);
}