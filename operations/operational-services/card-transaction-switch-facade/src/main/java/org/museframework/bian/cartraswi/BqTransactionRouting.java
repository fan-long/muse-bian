package org.museframework.bian.cartraswi;

import org.museframework.bian.cartraswi.dto.InitiateTransactionRoutingRequest;
import org.museframework.bian.cartraswi.dto.InitiateTransactionRoutingResponse;
import org.museframework.bian.cartraswi.dto.RetrieveTransactionRoutingRequest;
import org.museframework.bian.cartraswi.dto.RetrieveTransactionRoutingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardTransactionSwitch", group="TransactionRouting")
public interface BqTransactionRouting {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the routing function")
    InitiateTransactionRoutingResponse initiateTransactionRouting(InitiateTransactionRoutingRequest req);

    @Description("ReBQ Retrieve details about a card transaction switch routing transaction")
    RetrieveTransactionRoutingResponse retrieveTransactionRouting(RetrieveTransactionRoutingRequest req);
}