package org.museframework.bian.corpayser;

import org.museframework.bian.corpayser.dto.ExchangeCorporatePayrollPaymentsFulfillmentRequest;
import org.museframework.bian.corpayser.dto.ExchangeCorporatePayrollPaymentsFulfillmentResponse;
import org.museframework.bian.corpayser.dto.ExecuteCorporatePayrollPaymentsFulfillmentRequest;
import org.museframework.bian.corpayser.dto.ExecuteCorporatePayrollPaymentsFulfillmentResponse;
import org.museframework.bian.corpayser.dto.InitiateCorporatePayrollPaymentsFulfillmentRequest;
import org.museframework.bian.corpayser.dto.InitiateCorporatePayrollPaymentsFulfillmentResponse;
import org.museframework.bian.corpayser.dto.NotifyCorporatePayrollPaymentsFulfillmentRequest;
import org.museframework.bian.corpayser.dto.NotifyCorporatePayrollPaymentsFulfillmentResponse;
import org.museframework.bian.corpayser.dto.RequestCorporatePayrollPaymentsFulfillmentRequest;
import org.museframework.bian.corpayser.dto.RequestCorporatePayrollPaymentsFulfillmentResponse;
import org.museframework.bian.corpayser.dto.RetrieveCorporatePayrollPaymentsFulfillmentRequest;
import org.museframework.bian.corpayser.dto.RetrieveCorporatePayrollPaymentsFulfillmentResponse;
import org.museframework.bian.corpayser.dto.UpdateCorporatePayrollPaymentsFulfillmentRequest;
import org.museframework.bian.corpayser.dto.UpdateCorporatePayrollPaymentsFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Employee Payroll Details Maintenance Fulfillment arrangement within the Employee Payroll Details Maintenance Fulfillment")
@GenericDomain(name="CorporatePayrollServices", group="CorporatePayrollPaymentsFulfillment")
public interface BqCorporatePayrollPaymentsFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Corporate Payroll Payments Fulfillment")
    ExchangeCorporatePayrollPaymentsFulfillmentResponse exchangeCorporatePayrollPaymentsFulfillment(ExchangeCorporatePayrollPaymentsFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Corporate Payroll Payments Fulfillment")
    ExecuteCorporatePayrollPaymentsFulfillmentResponse executeCorporatePayrollPaymentsFulfillment(ExecuteCorporatePayrollPaymentsFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Corporate Payroll Payments Fulfillment")
    InitiateCorporatePayrollPaymentsFulfillmentResponse initiateCorporatePayrollPaymentsFulfillment(InitiateCorporatePayrollPaymentsFulfillmentRequest req);

    @Description("Notify Corporate Payroll Payments Fulfillment")
    NotifyCorporatePayrollPaymentsFulfillmentResponse notifyCorporatePayrollPaymentsFulfillment(NotifyCorporatePayrollPaymentsFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Corporate Payroll Payments Fulfillment")
    RequestCorporatePayrollPaymentsFulfillmentResponse requestCorporatePayrollPaymentsFulfillment(RequestCorporatePayrollPaymentsFulfillmentRequest req);

    @Description("Retrieve Corporate Payroll Payments Fulfillment")
    RetrieveCorporatePayrollPaymentsFulfillmentResponse retrieveCorporatePayrollPaymentsFulfillment(RetrieveCorporatePayrollPaymentsFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Corporate Payroll Payments Fulfillment")
    UpdateCorporatePayrollPaymentsFulfillmentResponse updateCorporatePayrollPaymentsFulfillment(UpdateCorporatePayrollPaymentsFulfillmentRequest req);
}