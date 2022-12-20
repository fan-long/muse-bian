package org.museframework.bian.productionrelease;

import org.museframework.bian.productionrelease.dto.RetrieveBusinessRiskRequest;
import org.museframework.bian.productionrelease.dto.RetrieveBusinessRiskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="ProductionRelease", group="BusinessRisk")
public interface BqBusinessRisk {
    @Description("ReBQ Retrieve details about a business risk assessment")
    RetrieveBusinessRiskResponse retrieveBusinessRisk(RetrieveBusinessRiskRequest req);
}