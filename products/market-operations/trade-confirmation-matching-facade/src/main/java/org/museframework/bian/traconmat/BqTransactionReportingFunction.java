package org.museframework.bian.traconmat;

import org.museframework.bian.traconmat.dto.ExchangeTransactionReportingFunctionRequest;
import org.museframework.bian.traconmat.dto.ExchangeTransactionReportingFunctionResponse;
import org.museframework.bian.traconmat.dto.ExecuteTransactionReportingFunctionRequest;
import org.museframework.bian.traconmat.dto.ExecuteTransactionReportingFunctionResponse;
import org.museframework.bian.traconmat.dto.InitiateTransactionReportingFunctionRequest;
import org.museframework.bian.traconmat.dto.InitiateTransactionReportingFunctionResponse;
import org.museframework.bian.traconmat.dto.NotifyTransactionReportingFunctionRequest;
import org.museframework.bian.traconmat.dto.NotifyTransactionReportingFunctionResponse;
import org.museframework.bian.traconmat.dto.RequestTransactionReportingFunctionRequest;
import org.museframework.bian.traconmat.dto.RequestTransactionReportingFunctionResponse;
import org.museframework.bian.traconmat.dto.RetrieveTransactionReportingFunctionRequest;
import org.museframework.bian.traconmat.dto.RetrieveTransactionReportingFunctionResponse;
import org.museframework.bian.traconmat.dto.UpdateTransactionReportingFunctionRequest;
import org.museframework.bian.traconmat.dto.UpdateTransactionReportingFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function")
@GenericDomain(name="TradeConfirmationMatching", group="TransactionReportingFunction")
public interface BqTransactionReportingFunction {
    @GenericDtxEndpoint
    @Description("Exchange Transaction Reporting Function")
    ExchangeTransactionReportingFunctionResponse exchangeTransactionReportingFunction(ExchangeTransactionReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Transaction Reporting Function")
    ExecuteTransactionReportingFunctionResponse executeTransactionReportingFunction(ExecuteTransactionReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Transaction Reporting Function")
    InitiateTransactionReportingFunctionResponse initiateTransactionReportingFunction(InitiateTransactionReportingFunctionRequest req);

    @Description("Notify Transaction Reporting Function")
    NotifyTransactionReportingFunctionResponse notifyTransactionReportingFunction(NotifyTransactionReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Transaction Reporting Function")
    RequestTransactionReportingFunctionResponse requestTransactionReportingFunction(RequestTransactionReportingFunctionRequest req);

    @Description("Retrieve Transaction Reporting Function")
    RetrieveTransactionReportingFunctionResponse retrieveTransactionReportingFunction(RetrieveTransactionReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Transaction Reporting Function")
    UpdateTransactionReportingFunctionResponse updateTransactionReportingFunction(UpdateTransactionReportingFunctionRequest req);
}