package org.museframework.bian.standingorder;

import org.museframework.bian.standingorder.dto.ExchangeStandingOrderPaymentRequest;
import org.museframework.bian.standingorder.dto.ExchangeStandingOrderPaymentResponse;
import org.museframework.bian.standingorder.dto.InitiateStandingOrderPaymentRequest;
import org.museframework.bian.standingorder.dto.InitiateStandingOrderPaymentResponse;
import org.museframework.bian.standingorder.dto.RetrieveStandingOrderPaymentRequest;
import org.museframework.bian.standingorder.dto.RetrieveStandingOrderPaymentResponse;
import org.museframework.bian.standingorder.dto.UpdateStandingOrderPaymentRequest;
import org.museframework.bian.standingorder.dto.UpdateStandingOrderPaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Standing Order Fulfillment arrangement within the Standing Order Fulfillment")
@GenericDomain(name="StandingOrder", group="StandingOrderPayment")
public interface BqStandingOrderPayment {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Standing Order Payment processing")
    ExchangeStandingOrderPaymentResponse exchangeStandingOrderPayment(ExchangeStandingOrderPaymentRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Standing Order Payment")
    InitiateStandingOrderPaymentResponse initiateStandingOrderPayment(InitiateStandingOrderPaymentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Standing Order Payment")
    RetrieveStandingOrderPaymentResponse retrieveStandingOrderPayment(RetrieveStandingOrderPaymentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Standing Order Payment")
    UpdateStandingOrderPaymentResponse updateStandingOrderPayment(UpdateStandingOrderPaymentRequest req);
}