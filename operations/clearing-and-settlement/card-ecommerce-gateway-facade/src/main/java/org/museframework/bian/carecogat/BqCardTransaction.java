package org.museframework.bian.carecogat;

import org.museframework.bian.carecogat.dto.InitiateCardTransactionRequest;
import org.museframework.bian.carecogat.dto.InitiateCardTransactionResponse;
import org.museframework.bian.carecogat.dto.RetrieveCardTransactionRequest;
import org.museframework.bian.carecogat.dto.RetrieveCardTransactionResponse;
import org.museframework.bian.carecogat.dto.UpdateCardTransactionRequest;
import org.museframework.bian.carecogat.dto.UpdateCardTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardeCommerceGateway", group="CardTransaction")
public interface BqCardTransaction {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a card transaction (initiated at merchant location)")
    InitiateCardTransactionResponse initiateCardTransaction(InitiateCardTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a card transaction")
    UpdateCardTransactionResponse updateCardTransaction(UpdateCardTransactionRequest req);

    @Description("ReBQ Retrieve details about a card transaction")
    RetrieveCardTransactionResponse retrieveCardTransaction(RetrieveCardTransactionRequest req);
}