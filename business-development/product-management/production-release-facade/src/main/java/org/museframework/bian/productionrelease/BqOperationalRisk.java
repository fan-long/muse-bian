package org.museframework.bian.productionrelease;

import org.museframework.bian.productionrelease.dto.RetrieveOperationalRiskRequest;
import org.museframework.bian.productionrelease.dto.RetrieveOperationalRiskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="ProductionRelease", group="OperationalRisk")
public interface BqOperationalRisk {
    @Description("ReBQ Retrieve details about a operational risk assessment")
    RetrieveOperationalRiskResponse retrieveOperationalRisk(RetrieveOperationalRiskRequest req);
}