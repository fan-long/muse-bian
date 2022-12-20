package org.museframework.bian.marordexe;

import org.museframework.bian.marordexe.dto.InitiateMarketTradeTransactionRequest;
import org.museframework.bian.marordexe.dto.InitiateMarketTradeTransactionResponse;
import org.museframework.bian.marordexe.dto.RequestMarketTradeTransactionRequest;
import org.museframework.bian.marordexe.dto.RequestMarketTradeTransactionResponse;
import org.museframework.bian.marordexe.dto.RetrieveMarketTradeTransactionRequest;
import org.museframework.bian.marordexe.dto.RetrieveMarketTradeTransactionResponse;
import org.museframework.bian.marordexe.dto.UpdateMarketTradeTransactionRequest;
import org.museframework.bian.marordexe.dto.UpdateMarketTradeTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Market Order Execution. ")
@GenericDomain(name="MarketOrderExecution", group="MarketTradeTransaction")
public interface CrMarketTradeTransaction {
    @GenericDtxEndpoint
    @Description("InCR Initiate a market trade")
    InitiateMarketTradeTransactionResponse initiateMarketTradeTransaction(InitiateMarketTradeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details on an active market trade request")
    UpdateMarketTradeTransactionResponse updateMarketTradeTransaction(UpdateMarketTradeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention to an active market trade")
    RequestMarketTradeTransactionResponse requestMarketTradeTransaction(RequestMarketTradeTransactionRequest req);

    @Description("ReCR Retrieve details about a market trade")
    RetrieveMarketTradeTransactionResponse retrieveMarketTradeTransaction(RetrieveMarketTradeTransactionRequest req);
}