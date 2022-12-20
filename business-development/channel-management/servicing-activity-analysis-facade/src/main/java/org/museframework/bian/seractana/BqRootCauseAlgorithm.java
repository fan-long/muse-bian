package org.museframework.bian.seractana;

import org.museframework.bian.seractana.dto.InitiateRootCauseAlgorithmRequest;
import org.museframework.bian.seractana.dto.InitiateRootCauseAlgorithmResponse;
import org.museframework.bian.seractana.dto.RequestRootCauseAlgorithmRequest;
import org.museframework.bian.seractana.dto.RequestRootCauseAlgorithmResponse;
import org.museframework.bian.seractana.dto.RetrieveRootCauseAlgorithmRequest;
import org.museframework.bian.seractana.dto.RetrieveRootCauseAlgorithmResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ServicingActivityAnalysis", group="RootCauseAlgorithm")
public interface BqRootCauseAlgorithm {
    @GenericDtxEndpoint
    @Description("EvBQ Initialize application of a specific algorithm for root cause analysis")
    InitiateRootCauseAlgorithmResponse initiateRootCauseAlgorithm(InitiateRootCauseAlgorithmRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the application of a root cause algorithm")
    RequestRootCauseAlgorithmResponse requestRootCauseAlgorithm(RequestRootCauseAlgorithmRequest req);

    @Description("ReBQ Retrieve details about the application of a specific root cause algorithm analysis")
    RetrieveRootCauseAlgorithmResponse retrieveRootCauseAlgorithm(RetrieveRootCauseAlgorithmRequest req);
}