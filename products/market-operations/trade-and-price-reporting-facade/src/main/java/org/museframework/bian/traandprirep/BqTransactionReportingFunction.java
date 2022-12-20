package org.museframework.bian.traandprirep;

import org.museframework.bian.traandprirep.dto.ExchangeTransactionReportingFunctionRequest;
import org.museframework.bian.traandprirep.dto.ExchangeTransactionReportingFunctionResponse;
import org.museframework.bian.traandprirep.dto.ExecuteTransactionReportingFunctionRequest;
import org.museframework.bian.traandprirep.dto.ExecuteTransactionReportingFunctionResponse;
import org.museframework.bian.traandprirep.dto.InitiateTransactionReportingFunctionRequest;
import org.museframework.bian.traandprirep.dto.InitiateTransactionReportingFunctionResponse;
import org.museframework.bian.traandprirep.dto.NotifyTransactionReportingFunctionRequest;
import org.museframework.bian.traandprirep.dto.NotifyTransactionReportingFunctionResponse;
import org.museframework.bian.traandprirep.dto.RequestTransactionReportingFunctionRequest;
import org.museframework.bian.traandprirep.dto.RequestTransactionReportingFunctionResponse;
import org.museframework.bian.traandprirep.dto.RetrieveTransactionReportingFunctionRequest;
import org.museframework.bian.traandprirep.dto.RetrieveTransactionReportingFunctionResponse;
import org.museframework.bian.traandprirep.dto.UpdateTransactionReportingFunctionRequest;
import org.museframework.bian.traandprirep.dto.UpdateTransactionReportingFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Transaction Reporting Function for doing Transaction Reporting Function")
@GenericDomain(name="TradeandPriceReporting", group="TransactionReportingFunction")
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