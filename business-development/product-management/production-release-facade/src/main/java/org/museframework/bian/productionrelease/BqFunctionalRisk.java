package org.museframework.bian.productionrelease;

import org.museframework.bian.productionrelease.dto.RetrieveFunctionalRiskRequest;
import org.museframework.bian.productionrelease.dto.RetrieveFunctionalRiskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="ProductionRelease", group="FunctionalRisk")
public interface BqFunctionalRisk {
    @Description("ReBQ Retrieve details about a functional risk assessment")
    RetrieveFunctionalRiskResponse retrieveFunctionalRisk(RetrieveFunctionalRiskRequest req);
}