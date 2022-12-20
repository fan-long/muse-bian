package org.museframework.bian.mardatswiope;

import org.museframework.bian.mardatswiope.dto.ExecuteDistributionRequest;
import org.museframework.bian.mardatswiope.dto.ExecuteDistributionResponse;
import org.museframework.bian.mardatswiope.dto.InitiateDistributionRequest;
import org.museframework.bian.mardatswiope.dto.InitiateDistributionResponse;
import org.museframework.bian.mardatswiope.dto.RequestDistributionRequest;
import org.museframework.bian.mardatswiope.dto.RequestDistributionResponse;
import org.museframework.bian.mardatswiope.dto.RetrieveDistributionRequest;
import org.museframework.bian.mardatswiope.dto.RetrieveDistributionResponse;
import org.museframework.bian.mardatswiope.dto.UpdateDistributionRequest;
import org.museframework.bian.mardatswiope.dto.UpdateDistributionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="MarketDataSwitchOperation", group="Distribution")
public interface BqDistribution {
    @GenericDtxEndpoint
    @Description("InBQ User subscription to the switch")
    InitiateDistributionResponse initiateDistribution(InitiateDistributionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ User subscription details")
    UpdateDistributionResponse updateDistribution(UpdateDistributionRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action to the service (e.g. select content)")
    ExecuteDistributionResponse executeDistribution(ExecuteDistributionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention for  the service (e.g. request a usage profile change)")
    RequestDistributionResponse requestDistribution(RequestDistributionRequest req);

    @Description("ReBQ Retrieve details about the user switch session")
    RetrieveDistributionResponse retrieveDistribution(RetrieveDistributionRequest req);
}