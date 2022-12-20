package org.museframework.bian.letofcre;

import org.museframework.bian.letofcre.dto.ControlLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.ControlLetterOfCreditTransactionResponse;
import org.museframework.bian.letofcre.dto.ExchangeLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.ExchangeLetterOfCreditTransactionResponse;
import org.museframework.bian.letofcre.dto.ExecuteLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.ExecuteLetterOfCreditTransactionResponse;
import org.museframework.bian.letofcre.dto.InitiateLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.InitiateLetterOfCreditTransactionResponse;
import org.museframework.bian.letofcre.dto.NotifyLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.NotifyLetterOfCreditTransactionResponse;
import org.museframework.bian.letofcre.dto.RequestLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.RequestLetterOfCreditTransactionResponse;
import org.museframework.bian.letofcre.dto.RetrieveLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.RetrieveLetterOfCreditTransactionResponse;
import org.museframework.bian.letofcre.dto.UpdateLetterOfCreditTransactionRequest;
import org.museframework.bian.letofcre.dto.UpdateLetterOfCreditTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Letter of Credit. ")
@GenericDomain(name="LetterofCredit", group="LetterOfCreditTransaction")
public interface CrLetterOfCreditTransaction {
    @GenericDtxEndpoint
    @Description("Control Letter Of Credit Transaction")
    ControlLetterOfCreditTransactionResponse controlLetterOfCreditTransaction(ControlLetterOfCreditTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Letter Of Credit Transaction")
    ExchangeLetterOfCreditTransactionResponse exchangeLetterOfCreditTransaction(ExchangeLetterOfCreditTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Letter Of Credit Transaction")
    ExecuteLetterOfCreditTransactionResponse executeLetterOfCreditTransaction(ExecuteLetterOfCreditTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Letter Of Credit Transaction")
    InitiateLetterOfCreditTransactionResponse initiateLetterOfCreditTransaction(InitiateLetterOfCreditTransactionRequest req);

    @Description("Notify Letter Of Credit Transaction")
    NotifyLetterOfCreditTransactionResponse notifyLetterOfCreditTransaction(NotifyLetterOfCreditTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Request Letter Of Credit Transaction")
    RequestLetterOfCreditTransactionResponse requestLetterOfCreditTransaction(RequestLetterOfCreditTransactionRequest req);

    @Description("Retrieve Letter Of Credit Transaction")
    RetrieveLetterOfCreditTransactionResponse retrieveLetterOfCreditTransaction(RetrieveLetterOfCreditTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Update Letter Of Credit Transaction")
    UpdateLetterOfCreditTransactionResponse updateLetterOfCreditTransaction(UpdateLetterOfCreditTransactionRequest req);
}