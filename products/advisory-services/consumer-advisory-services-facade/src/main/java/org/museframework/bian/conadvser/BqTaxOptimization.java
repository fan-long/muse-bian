package org.museframework.bian.conadvser;

import org.museframework.bian.conadvser.dto.InitiateTaxOptimizationRequest;
import org.museframework.bian.conadvser.dto.InitiateTaxOptimizationResponse;
import org.museframework.bian.conadvser.dto.RetrieveTaxOptimizationRequest;
import org.museframework.bian.conadvser.dto.RetrieveTaxOptimizationResponse;
import org.museframework.bian.conadvser.dto.UpdateTaxOptimizationRequest;
import org.museframework.bian.conadvser.dto.UpdateTaxOptimizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="ConsumerAdvisoryServices", group="TaxOptimization")
public interface BqTaxOptimization {
    @GenericDtxEndpoint
    @Description("InBQ Initiate tax optimization advisory session")
    InitiateTaxOptimizationResponse initiateTaxOptimization(InitiateTaxOptimizationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about a tax optimization advisory session")
    UpdateTaxOptimizationResponse updateTaxOptimization(UpdateTaxOptimizationRequest req);

    @Description("ReBQ Retrieve details about a tax optimization advisory session")
    RetrieveTaxOptimizationResponse retrieveTaxOptimization(RetrieveTaxOptimizationRequest req);
}