package org.museframework.bian.virtualaccount;

import org.museframework.bian.virtualaccount.dto.ExchangeServiceFeesRequest;
import org.museframework.bian.virtualaccount.dto.ExchangeServiceFeesResponse;
import org.museframework.bian.virtualaccount.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.virtualaccount.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.virtualaccount.dto.InitiateServiceFeesRequest;
import org.museframework.bian.virtualaccount.dto.InitiateServiceFeesResponse;
import org.museframework.bian.virtualaccount.dto.RequestServiceFeesRequest;
import org.museframework.bian.virtualaccount.dto.RequestServiceFeesResponse;
import org.museframework.bian.virtualaccount.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.virtualaccount.dto.RetrieveServiceFeesResponse;
import org.museframework.bian.virtualaccount.dto.UpdateServiceFeesRequest;
import org.museframework.bian.virtualaccount.dto.UpdateServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment")
@GenericDomain(name="VirtualAccount", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fee processing")
    ExchangeServiceFeesResponse exchangeServiceFees(ExchangeServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Fee")
    InitiateServiceFeesResponse initiateServiceFees(InitiateServiceFeesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fee")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fee")
    RequestServiceFeesResponse requestServiceFees(RequestServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("Update details about an applied service fee")
    UpdateServiceFeesResponse updateServiceFees(UpdateServiceFeesRequest req);
}