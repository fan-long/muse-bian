package org.museframework.bian.crerismod;

import org.museframework.bian.crerismod.dto.CaptureCreditRiskModelSpecificationRequest;
import org.museframework.bian.crerismod.dto.CaptureCreditRiskModelSpecificationResponse;
import org.museframework.bian.crerismod.dto.ControlCreditRiskModelSpecificationRequest;
import org.museframework.bian.crerismod.dto.ControlCreditRiskModelSpecificationResponse;
import org.museframework.bian.crerismod.dto.ExchangeCreditRiskModelSpecificationRequest;
import org.museframework.bian.crerismod.dto.ExchangeCreditRiskModelSpecificationResponse;
import org.museframework.bian.crerismod.dto.InitiateCreditRiskModelSpecificationRequest;
import org.museframework.bian.crerismod.dto.InitiateCreditRiskModelSpecificationResponse;
import org.museframework.bian.crerismod.dto.RequestCreditRiskModelSpecificationRequest;
import org.museframework.bian.crerismod.dto.RequestCreditRiskModelSpecificationResponse;
import org.museframework.bian.crerismod.dto.RetrieveCreditRiskModelSpecificationRequest;
import org.museframework.bian.crerismod.dto.RetrieveCreditRiskModelSpecificationResponse;
import org.museframework.bian.crerismod.dto.UpdateCreditRiskModelSpecificationRequest;
import org.museframework.bian.crerismod.dto.UpdateCreditRiskModelSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Credit Risk Models.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="CreditRiskModels", group="CreditRiskModelSpecification")
public interface CrCreditRiskModelSpecification {
    @GenericDtxEndpoint
    @Description("CaCR Capture Credit Risk Model Specification activity or event related information")
    CaptureCreditRiskModelSpecificationResponse captureCreditRiskModelSpecification(CaptureCreditRiskModelSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Credit Risk Model Specification")
    ControlCreditRiskModelSpecificationResponse controlCreditRiskModelSpecification(ControlCreditRiskModelSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Credit Risk Model Specification processing")
    ExchangeCreditRiskModelSpecificationResponse exchangeCreditRiskModelSpecification(ExchangeCreditRiskModelSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Credit Risk Model Specification")
    InitiateCreditRiskModelSpecificationResponse initiateCreditRiskModelSpecification(InitiateCreditRiskModelSpecificationRequest req);

    @Description("ReCR Retrieve details about any aspect of Credit Risk Model Specification")
    RetrieveCreditRiskModelSpecificationResponse retrieveCreditRiskModelSpecification(RetrieveCreditRiskModelSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Credit Risk Model Specification")
    RequestCreditRiskModelSpecificationResponse requestCreditRiskModelSpecification(RequestCreditRiskModelSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Credit Risk Model Specification")
    UpdateCreditRiskModelSpecificationResponse updateCreditRiskModelSpecification(UpdateCreditRiskModelSpecificationRequest req);
}