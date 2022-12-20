package org.museframework.bian.virtualaccount;

import org.museframework.bian.virtualaccount.dto.ExchangeInterestRequest;
import org.museframework.bian.virtualaccount.dto.ExchangeInterestResponse;
import org.museframework.bian.virtualaccount.dto.ExecuteInterestRequest;
import org.museframework.bian.virtualaccount.dto.ExecuteInterestResponse;
import org.museframework.bian.virtualaccount.dto.InitiateInterestRequest;
import org.museframework.bian.virtualaccount.dto.InitiateInterestResponse;
import org.museframework.bian.virtualaccount.dto.RequestInterestRequest;
import org.museframework.bian.virtualaccount.dto.RequestInterestResponse;
import org.museframework.bian.virtualaccount.dto.RetrieveInterestRequest;
import org.museframework.bian.virtualaccount.dto.RetrieveInterestResponse;
import org.museframework.bian.virtualaccount.dto.UpdateInterestRequest;
import org.museframework.bian.virtualaccount.dto.UpdateInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment")
@GenericDomain(name="VirtualAccount", group="Interest")
public interface BqInterest {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Interest processing")
    ExchangeInterestResponse exchangeInterest(ExchangeInterestRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute Apply Interest")
    ExecuteInterestResponse executeInterest(ExecuteInterestRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Interest")
    InitiateInterestResponse initiateInterest(InitiateInterestRequest req);

    @Description("ReBQ Retrieve details about any aspect of Interest")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Interest")
    RequestInterestResponse requestInterest(RequestInterestRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Interest")
    UpdateInterestResponse updateInterest(UpdateInterestRequest req);
}