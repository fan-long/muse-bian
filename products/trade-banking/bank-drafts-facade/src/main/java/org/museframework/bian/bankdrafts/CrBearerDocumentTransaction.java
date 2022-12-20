package org.museframework.bian.bankdrafts;

import org.museframework.bian.bankdrafts.dto.ControlBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.ControlBearerDocumentTransactionResponse;
import org.museframework.bian.bankdrafts.dto.ExchangeBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.ExchangeBearerDocumentTransactionResponse;
import org.museframework.bian.bankdrafts.dto.ExecuteBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.ExecuteBearerDocumentTransactionResponse;
import org.museframework.bian.bankdrafts.dto.InitiateBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.InitiateBearerDocumentTransactionResponse;
import org.museframework.bian.bankdrafts.dto.NotifyBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.NotifyBearerDocumentTransactionResponse;
import org.museframework.bian.bankdrafts.dto.RequestBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.RequestBearerDocumentTransactionResponse;
import org.museframework.bian.bankdrafts.dto.RetrieveBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.RetrieveBearerDocumentTransactionResponse;
import org.museframework.bian.bankdrafts.dto.UpdateBearerDocumentTransactionRequest;
import org.museframework.bian.bankdrafts.dto.UpdateBearerDocumentTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Bank Drafts. ")
@GenericDomain(name="BankDrafts", group="BearerDocumentTransaction")
public interface CrBearerDocumentTransaction {
    @GenericDtxEndpoint
    @Description("Control Bearer Document Transaction")
    ControlBearerDocumentTransactionResponse controlBearerDocumentTransaction(ControlBearerDocumentTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Bearer Document Transaction")
    ExchangeBearerDocumentTransactionResponse exchangeBearerDocumentTransaction(ExchangeBearerDocumentTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bearer Document Transaction")
    ExecuteBearerDocumentTransactionResponse executeBearerDocumentTransaction(ExecuteBearerDocumentTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bearer Document Transaction")
    InitiateBearerDocumentTransactionResponse initiateBearerDocumentTransaction(InitiateBearerDocumentTransactionRequest req);

    @Description("Notify Bearer Document Transaction")
    NotifyBearerDocumentTransactionResponse notifyBearerDocumentTransaction(NotifyBearerDocumentTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Request Bearer Document Transaction")
    RequestBearerDocumentTransactionResponse requestBearerDocumentTransaction(RequestBearerDocumentTransactionRequest req);

    @Description("Retrieve Bearer Document Transaction")
    RetrieveBearerDocumentTransactionResponse retrieveBearerDocumentTransaction(RetrieveBearerDocumentTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Update Bearer Document Transaction")
    UpdateBearerDocumentTransactionResponse updateBearerDocumentTransaction(UpdateBearerDocumentTransactionRequest req);
}