package org.museframework.bian.productionrelease;

import org.museframework.bian.productionrelease.dto.RetrieveProductionRiskRequest;
import org.museframework.bian.productionrelease.dto.RetrieveProductionRiskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="ProductionRelease", group="ProductionRisk")
public interface BqProductionRisk {
    @Description("ReBQ Retrieve details about a production risk assessment")
    RetrieveProductionRiskResponse retrieveProductionRisk(RetrieveProductionRiskRequest req);
}