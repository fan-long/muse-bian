package org.museframework.bian.proquaass;

import org.museframework.bian.proquaass.dto.ExchangeProductandServiceAssessmentRequest;
import org.museframework.bian.proquaass.dto.ExchangeProductandServiceAssessmentResponse;
import org.museframework.bian.proquaass.dto.ExecuteProductandServiceAssessmentRequest;
import org.museframework.bian.proquaass.dto.ExecuteProductandServiceAssessmentResponse;
import org.museframework.bian.proquaass.dto.GrantProductandServiceAssessmentRequest;
import org.museframework.bian.proquaass.dto.GrantProductandServiceAssessmentResponse;
import org.museframework.bian.proquaass.dto.InitiateProductandServiceAssessmentRequest;
import org.museframework.bian.proquaass.dto.InitiateProductandServiceAssessmentResponse;
import org.museframework.bian.proquaass.dto.RequestProductandServiceAssessmentRequest;
import org.museframework.bian.proquaass.dto.RequestProductandServiceAssessmentResponse;
import org.museframework.bian.proquaass.dto.RetrieveProductandServiceAssessmentRequest;
import org.museframework.bian.proquaass.dto.RetrieveProductandServiceAssessmentResponse;
import org.museframework.bian.proquaass.dto.UpdateProductandServiceAssessmentRequest;
import org.museframework.bian.proquaass.dto.UpdateProductandServiceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductQualityAssurance", group="ProductandServiceAssessment")
public interface CrProductandServiceAssessment {
    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Product and Service Assessment processing")
    ExchangeProductandServiceAssessmentResponse exchangeProductandServiceAssessment(ExchangeProductandServiceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Product and Service Assessment")
    ExecuteProductandServiceAssessmentResponse executeProductandServiceAssessment(ExecuteProductandServiceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Product and Service Assessment")
    GrantProductandServiceAssessmentResponse grantProductandServiceAssessment(GrantProductandServiceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Product and Service Assessment")
    InitiateProductandServiceAssessmentResponse initiateProductandServiceAssessment(InitiateProductandServiceAssessmentRequest req);

    @Description("ReCR Retrieve details about any aspect of Product and Service Assessment")
    RetrieveProductandServiceAssessmentResponse retrieveProductandServiceAssessment(RetrieveProductandServiceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Product and Service Assessment")
    RequestProductandServiceAssessmentResponse requestProductandServiceAssessment(RequestProductandServiceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Product and Service Assessment")
    UpdateProductandServiceAssessmentResponse updateProductandServiceAssessment(UpdateProductandServiceAssessmentRequest req);
}