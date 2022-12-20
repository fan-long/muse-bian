package org.museframework.bian.frauddiagnosis;

import org.museframework.bian.frauddiagnosis.dto.RetrieveEconomicModelRequest;
import org.museframework.bian.frauddiagnosis.dto.RetrieveEconomicModelResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="FraudDiagnosis", group="EconomicModel")
public interface BqEconomicModel {
    @Description("ReBQ Retrieve details about an economic model analysis")
    RetrieveEconomicModelResponse retrieveEconomicModel(RetrieveEconomicModelRequest req);
}