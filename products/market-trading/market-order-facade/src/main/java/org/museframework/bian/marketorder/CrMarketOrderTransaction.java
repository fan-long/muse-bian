package org.museframework.bian.marketorder;

import org.museframework.bian.marketorder.dto.InitiateMarketOrderTransactionRequest;
import org.museframework.bian.marketorder.dto.InitiateMarketOrderTransactionResponse;
import org.museframework.bian.marketorder.dto.RetrieveMarketOrderTransactionRequest;
import org.museframework.bian.marketorder.dto.RetrieveMarketOrderTransactionResponse;
import org.museframework.bian.marketorder.dto.UpdateMarketOrderTransactionRequest;
import org.museframework.bian.marketorder.dto.UpdateMarketOrderTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Market Order. ")
@GenericDomain(name="MarketOrder", group="MarketOrderTransaction")
public interface CrMarketOrderTransaction {
    @GenericDtxEndpoint
    @Description("InCR Initiate a market order")
    InitiateMarketOrderTransactionResponse initiateMarketOrderTransaction(InitiateMarketOrderTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details on an active market order")
    UpdateMarketOrderTransactionResponse updateMarketOrderTransaction(UpdateMarketOrderTransactionRequest req);

    @Description("ReCR Retrieve details about a market order")
    RetrieveMarketOrderTransactionResponse retrieveMarketOrderTransaction(RetrieveMarketOrderTransactionRequest req);
}