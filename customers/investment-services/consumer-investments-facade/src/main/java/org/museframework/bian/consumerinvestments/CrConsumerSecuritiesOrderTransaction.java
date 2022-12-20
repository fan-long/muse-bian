package org.museframework.bian.consumerinvestments;

import org.museframework.bian.consumerinvestments.dto.InitiateConsumerSecuritiesOrderTransactionRequest;
import org.museframework.bian.consumerinvestments.dto.InitiateConsumerSecuritiesOrderTransactionResponse;
import org.museframework.bian.consumerinvestments.dto.RetrieveConsumerSecuritiesOrderTransactionRequest;
import org.museframework.bian.consumerinvestments.dto.RetrieveConsumerSecuritiesOrderTransactionResponse;
import org.museframework.bian.consumerinvestments.dto.UpdateConsumerSecuritiesOrderTransactionRequest;
import org.museframework.bian.consumerinvestments.dto.UpdateConsumerSecuritiesOrderTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Consumer Investments. ")
@GenericDomain(name="ConsumerInvestments", group="ConsumerSecuritiesOrderTransaction")
public interface CrConsumerSecuritiesOrderTransaction {
    @GenericDtxEndpoint
    @Description("InCR Initiate a consumer securities order")
    InitiateConsumerSecuritiesOrderTransactionResponse initiateConsumerSecuritiesOrderTransaction(InitiateConsumerSecuritiesOrderTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details on an active consumer securities order")
    UpdateConsumerSecuritiesOrderTransactionResponse updateConsumerSecuritiesOrderTransaction(UpdateConsumerSecuritiesOrderTransactionRequest req);

    @Description("ReCR Retrieve details about a consumer securities order")
    RetrieveConsumerSecuritiesOrderTransactionResponse retrieveConsumerSecuritiesOrderTransaction(RetrieveConsumerSecuritiesOrderTransactionRequest req);
}