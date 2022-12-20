package org.museframework.bian.fraudevaluation;

import org.museframework.bian.fraudevaluation.dto.RetrieveModelsRequest;
import org.museframework.bian.fraudevaluation.dto.RetrieveModelsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="FraudEvaluation", group="Models")
public interface BqModels {
    @Description("ReBQ Retrieve details about model based tests applied")
    RetrieveModelsResponse retrieveModels(RetrieveModelsRequest req);
}