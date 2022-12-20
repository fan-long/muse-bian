package org.museframework.bian.productmatching;

import org.museframework.bian.productmatching.dto.ExchangeProductCustomerCombinationAssessmentRequest;
import org.museframework.bian.productmatching.dto.ExchangeProductCustomerCombinationAssessmentResponse;
import org.museframework.bian.productmatching.dto.ExecuteProductCustomerCombinationAssessmentRequest;
import org.museframework.bian.productmatching.dto.ExecuteProductCustomerCombinationAssessmentResponse;
import org.museframework.bian.productmatching.dto.GrantProductCustomerCombinationAssessmentRequest;
import org.museframework.bian.productmatching.dto.GrantProductCustomerCombinationAssessmentResponse;
import org.museframework.bian.productmatching.dto.InitiateProductCustomerCombinationAssessmentRequest;
import org.museframework.bian.productmatching.dto.InitiateProductCustomerCombinationAssessmentResponse;
import org.museframework.bian.productmatching.dto.RequestProductCustomerCombinationAssessmentRequest;
import org.museframework.bian.productmatching.dto.RequestProductCustomerCombinationAssessmentResponse;
import org.museframework.bian.productmatching.dto.RetrieveProductCustomerCombinationAssessmentRequest;
import org.museframework.bian.productmatching.dto.RetrieveProductCustomerCombinationAssessmentResponse;
import org.museframework.bian.productmatching.dto.UpdateProductCustomerCombinationAssessmentRequest;
import org.museframework.bian.productmatching.dto.UpdateProductCustomerCombinationAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductMatching", group="ProductCustomerCombinationAssessment")
public interface CrProductCustomerCombinationAssessment {
    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Product/Customer Combination Assessment processing")
    ExchangeProductCustomerCombinationAssessmentResponse exchangeProductCustomerCombinationAssessment(ExchangeProductCustomerCombinationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Product/Customer Combination Assessment")
    ExecuteProductCustomerCombinationAssessmentResponse executeProductCustomerCombinationAssessment(ExecuteProductCustomerCombinationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Product/Customer Combination Assessment")
    GrantProductCustomerCombinationAssessmentResponse grantProductCustomerCombinationAssessment(GrantProductCustomerCombinationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Product/Customer Combination Assessment")
    InitiateProductCustomerCombinationAssessmentResponse initiateProductCustomerCombinationAssessment(InitiateProductCustomerCombinationAssessmentRequest req);

    @Description("ReCR Retrieve details about any aspect of Product/Customer Combination Assessment")
    RetrieveProductCustomerCombinationAssessmentResponse retrieveProductCustomerCombinationAssessment(RetrieveProductCustomerCombinationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Product/Customer Combination Assessment")
    RequestProductCustomerCombinationAssessmentResponse requestProductCustomerCombinationAssessment(RequestProductCustomerCombinationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Product/Customer Combination Assessment")
    UpdateProductCustomerCombinationAssessmentResponse updateProductCustomerCombinationAssessment(UpdateProductCustomerCombinationAssessmentRequest req);
}