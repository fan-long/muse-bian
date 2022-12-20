package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.ExecuteCardTransactionRequest;
import org.museframework.bian.creditcard.dto.ExecuteCardTransactionResponse;
import org.museframework.bian.creditcard.dto.RetrieveCardTransactionRequest;
import org.museframework.bian.creditcard.dto.RetrieveCardTransactionResponse;
import org.museframework.bian.creditcard.dto.UpdateCardTransactionRequest;
import org.museframework.bian.creditcard.dto.UpdateCardTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CreditCard", group="CardTransaction")
public interface BqCardTransaction {
    @GenericDtxEndpoint
    @Description("UpBQ Update a card transaction")
    UpdateCardTransactionResponse updateCardTransaction(UpdateCardTransactionRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a card account transaction")
    ExecuteCardTransactionResponse executeCardTransaction(ExecuteCardTransactionRequest req);

    @Description("ReBQ Retrieve details about a card account transaction")
    RetrieveCardTransactionResponse retrieveCardTransaction(RetrieveCardTransactionRequest req);
}