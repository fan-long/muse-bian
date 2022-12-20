package org.museframework.bian.corpayser;

import org.museframework.bian.corpayser.dto.ExchangeProductionServiceReportingFulfillmentRequest;
import org.museframework.bian.corpayser.dto.ExchangeProductionServiceReportingFulfillmentResponse;
import org.museframework.bian.corpayser.dto.ExecuteProductionServiceReportingFulfillmentRequest;
import org.museframework.bian.corpayser.dto.ExecuteProductionServiceReportingFulfillmentResponse;
import org.museframework.bian.corpayser.dto.InitiateProductionServiceReportingFulfillmentRequest;
import org.museframework.bian.corpayser.dto.InitiateProductionServiceReportingFulfillmentResponse;
import org.museframework.bian.corpayser.dto.NotifyProductionServiceReportingFulfillmentRequest;
import org.museframework.bian.corpayser.dto.NotifyProductionServiceReportingFulfillmentResponse;
import org.museframework.bian.corpayser.dto.RequestProductionServiceReportingFulfillmentRequest;
import org.museframework.bian.corpayser.dto.RequestProductionServiceReportingFulfillmentResponse;
import org.museframework.bian.corpayser.dto.RetrieveProductionServiceReportingFulfillmentRequest;
import org.museframework.bian.corpayser.dto.RetrieveProductionServiceReportingFulfillmentResponse;
import org.museframework.bian.corpayser.dto.UpdateProductionServiceReportingFulfillmentRequest;
import org.museframework.bian.corpayser.dto.UpdateProductionServiceReportingFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Employee Payroll Details Maintenance Fulfillment arrangement within the Employee Payroll Details Maintenance Fulfillment")
@GenericDomain(name="CorporatePayrollServices", group="ProductionServiceReportingFulfillment")
public interface BqProductionServiceReportingFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Production Service Reporting Fulfillment")
    ExchangeProductionServiceReportingFulfillmentResponse exchangeProductionServiceReportingFulfillment(ExchangeProductionServiceReportingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Production Service Reporting Fulfillment")
    ExecuteProductionServiceReportingFulfillmentResponse executeProductionServiceReportingFulfillment(ExecuteProductionServiceReportingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Production Service Reporting Fulfillment")
    InitiateProductionServiceReportingFulfillmentResponse initiateProductionServiceReportingFulfillment(InitiateProductionServiceReportingFulfillmentRequest req);

    @Description("Notify Production Service Reporting Fulfillment")
    NotifyProductionServiceReportingFulfillmentResponse notifyProductionServiceReportingFulfillment(NotifyProductionServiceReportingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Production Service Reporting Fulfillment")
    RequestProductionServiceReportingFulfillmentResponse requestProductionServiceReportingFulfillment(RequestProductionServiceReportingFulfillmentRequest req);

    @Description("Retrieve Production Service Reporting Fulfillment")
    RetrieveProductionServiceReportingFulfillmentResponse retrieveProductionServiceReportingFulfillment(RetrieveProductionServiceReportingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Production Service Reporting Fulfillment")
    UpdateProductionServiceReportingFulfillmentResponse updateProductionServiceReportingFulfillment(UpdateProductionServiceReportingFulfillmentRequest req);
}