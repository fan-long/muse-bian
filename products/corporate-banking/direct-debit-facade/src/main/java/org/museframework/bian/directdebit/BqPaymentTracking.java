package org.museframework.bian.directdebit;

import org.museframework.bian.directdebit.dto.ControlPaymentTrackingRequest;
import org.museframework.bian.directdebit.dto.ControlPaymentTrackingResponse;
import org.museframework.bian.directdebit.dto.ExecutePaymentTrackingRequest;
import org.museframework.bian.directdebit.dto.ExecutePaymentTrackingResponse;
import org.museframework.bian.directdebit.dto.InitiatePaymentTrackingRequest;
import org.museframework.bian.directdebit.dto.InitiatePaymentTrackingResponse;
import org.museframework.bian.directdebit.dto.RetrievePaymentTrackingRequest;
import org.museframework.bian.directdebit.dto.RetrievePaymentTrackingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Batch Debit arrangement within the Direct Debit Facility")
@GenericDomain(name="DirectDebit", group="PaymentTracking")
public interface BqPaymentTracking {
    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Payment Tracking")
    ControlPaymentTrackingResponse controlPaymentTracking(ControlPaymentTrackingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Payment Tracking")
    ExecutePaymentTrackingResponse executePaymentTracking(ExecutePaymentTrackingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Payment Tracking")
    InitiatePaymentTrackingResponse initiatePaymentTracking(InitiatePaymentTrackingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Payment Tracking")
    RetrievePaymentTrackingResponse retrievePaymentTracking(RetrievePaymentTrackingRequest req);
}