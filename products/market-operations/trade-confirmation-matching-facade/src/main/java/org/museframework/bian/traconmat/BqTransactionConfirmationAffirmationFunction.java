package org.museframework.bian.traconmat;

import org.museframework.bian.traconmat.dto.ExchangeTransactionConfirmationAffirmationFunctionRequest;
import org.museframework.bian.traconmat.dto.ExchangeTransactionConfirmationAffirmationFunctionResponse;
import org.museframework.bian.traconmat.dto.ExecuteTransactionConfirmationAffirmationFunctionRequest;
import org.museframework.bian.traconmat.dto.ExecuteTransactionConfirmationAffirmationFunctionResponse;
import org.museframework.bian.traconmat.dto.InitiateTransactionConfirmationAffirmationFunctionRequest;
import org.museframework.bian.traconmat.dto.InitiateTransactionConfirmationAffirmationFunctionResponse;
import org.museframework.bian.traconmat.dto.NotifyTransactionConfirmationAffirmationFunctionRequest;
import org.museframework.bian.traconmat.dto.NotifyTransactionConfirmationAffirmationFunctionResponse;
import org.museframework.bian.traconmat.dto.RequestTransactionConfirmationAffirmationFunctionRequest;
import org.museframework.bian.traconmat.dto.RequestTransactionConfirmationAffirmationFunctionResponse;
import org.museframework.bian.traconmat.dto.RetrieveTransactionConfirmationAffirmationFunctionRequest;
import org.museframework.bian.traconmat.dto.RetrieveTransactionConfirmationAffirmationFunctionResponse;
import org.museframework.bian.traconmat.dto.UpdateTransactionConfirmationAffirmationFunctionRequest;
import org.museframework.bian.traconmat.dto.UpdateTransactionConfirmationAffirmationFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function")
@GenericDomain(name="TradeConfirmationMatching", group="TransactionConfirmationAffirmationFunction")
public interface BqTransactionConfirmationAffirmationFunction {
    @GenericDtxEndpoint
    @Description("Exchange Transaction Confirmation/Affirmation Function")
    ExchangeTransactionConfirmationAffirmationFunctionResponse exchangeTransactionConfirmationAffirmationFunction(ExchangeTransactionConfirmationAffirmationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Transaction Confirmation/Affirmation Function")
    ExecuteTransactionConfirmationAffirmationFunctionResponse executeTransactionConfirmationAffirmationFunction(ExecuteTransactionConfirmationAffirmationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Transaction Confirmation/Affirmation Function")
    InitiateTransactionConfirmationAffirmationFunctionResponse initiateTransactionConfirmationAffirmationFunction(InitiateTransactionConfirmationAffirmationFunctionRequest req);

    @Description("Notify Transaction Confirmation/Affirmation Function")
    NotifyTransactionConfirmationAffirmationFunctionResponse notifyTransactionConfirmationAffirmationFunction(NotifyTransactionConfirmationAffirmationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Transaction Confirmation/Affirmation Function")
    RequestTransactionConfirmationAffirmationFunctionResponse requestTransactionConfirmationAffirmationFunction(RequestTransactionConfirmationAffirmationFunctionRequest req);

    @Description("Retrieve Transaction Confirmation/Affirmation Function")
    RetrieveTransactionConfirmationAffirmationFunctionResponse retrieveTransactionConfirmationAffirmationFunction(RetrieveTransactionConfirmationAffirmationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Transaction Confirmation/Affirmation Function")
    UpdateTransactionConfirmationAffirmationFunctionResponse updateTransactionConfirmationAffirmationFunction(UpdateTransactionConfirmationAffirmationFunctionRequest req);
}