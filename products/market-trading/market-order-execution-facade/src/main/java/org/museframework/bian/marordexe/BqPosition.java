package org.museframework.bian.marordexe;

import org.museframework.bian.marordexe.dto.RequestPositionRequest;
import org.museframework.bian.marordexe.dto.RequestPositionResponse;
import org.museframework.bian.marordexe.dto.RetrievePositionRequest;
import org.museframework.bian.marordexe.dto.RetrievePositionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="MarketOrderExecution", group="Position")
public interface BqPosition {
    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention for position management")
    RequestPositionResponse requestPosition(RequestPositionRequest req);

    @Description("ReBQ Retrieve details about position wholesale trading activity")
    RetrievePositionResponse retrievePosition(RetrievePositionRequest req);
}