package org.museframework.bian.cortaxadv;

import org.museframework.bian.cortaxadv.dto.InitiateTaxOptimizationRequest;
import org.museframework.bian.cortaxadv.dto.InitiateTaxOptimizationResponse;
import org.museframework.bian.cortaxadv.dto.RequestTaxOptimizationRequest;
import org.museframework.bian.cortaxadv.dto.RequestTaxOptimizationResponse;
import org.museframework.bian.cortaxadv.dto.RetrieveTaxOptimizationRequest;
import org.museframework.bian.cortaxadv.dto.RetrieveTaxOptimizationResponse;
import org.museframework.bian.cortaxadv.dto.UpdateTaxOptimizationRequest;
import org.museframework.bian.cortaxadv.dto.UpdateTaxOptimizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CorporateTaxAdvisory", group="TaxOptimization")
public interface BqTaxOptimization {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a corporate tax optimization advisory session")
    InitiateTaxOptimizationResponse initiateTaxOptimization(InitiateTaxOptimizationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about a corporate tax optimization advisory session")
    UpdateTaxOptimizationResponse updateTaxOptimization(UpdateTaxOptimizationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a session")
    RequestTaxOptimizationResponse requestTaxOptimization(RequestTaxOptimizationRequest req);

    @Description("ReBQ Retrieve details about a corporate tax optimization advisory session")
    RetrieveTaxOptimizationResponse retrieveTaxOptimization(RetrieveTaxOptimizationRequest req);
}