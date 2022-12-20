package org.museframework.bian.productionrelease;

import org.museframework.bian.productionrelease.dto.EvaluateProductionSystemAssessmentRequest;
import org.museframework.bian.productionrelease.dto.EvaluateProductionSystemAssessmentResponse;
import org.museframework.bian.productionrelease.dto.RequestProductionSystemAssessmentRequest;
import org.museframework.bian.productionrelease.dto.RequestProductionSystemAssessmentResponse;
import org.museframework.bian.productionrelease.dto.RetrieveProductionSystemAssessmentRequest;
import org.museframework.bian.productionrelease.dto.RetrieveProductionSystemAssessmentResponse;
import org.museframework.bian.productionrelease.dto.UpdateProductionSystemAssessmentRequest;
import org.museframework.bian.productionrelease.dto.UpdateProductionSystemAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Production Release. ")
@GenericDomain(name="ProductionRelease", group="ProductionSystemAssessment")
public interface CrProductionSystemAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate various risk exposures for a production release")
    EvaluateProductionSystemAssessmentResponse evaluateProductionSystemAssessment(EvaluateProductionSystemAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update aspects of an active production release evaluation")
    UpdateProductionSystemAssessmentResponse updateProductionSystemAssessment(UpdateProductionSystemAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in an evaluation")
    RequestProductionSystemAssessmentResponse requestProductionSystemAssessment(RequestProductionSystemAssessmentRequest req);

    @Description("ReCR Retrieve details about a production release evaluation")
    RetrieveProductionSystemAssessmentResponse retrieveProductionSystemAssessment(RetrieveProductionSystemAssessmentRequest req);
}