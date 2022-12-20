package org.museframework.bian.paymentorder;

import org.museframework.bian.paymentorder.dto.InitiatePaymentOrderProcedureRequest;
import org.museframework.bian.paymentorder.dto.InitiatePaymentOrderProcedureResponse;
import org.museframework.bian.paymentorder.dto.RetrievePaymentOrderProcedureRequest;
import org.museframework.bian.paymentorder.dto.RetrievePaymentOrderProcedureResponse;
import org.museframework.bian.paymentorder.dto.UpdatePaymentOrderProcedureRequest;
import org.museframework.bian.paymentorder.dto.UpdatePaymentOrderProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Order. ")
@GenericDomain(name="PaymentOrder", group="PaymentOrderProcedure")
public interface CrPaymentOrderProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a payment order procedure")
    InitiatePaymentOrderProcedureResponse initiatePaymentOrderProcedure(InitiatePaymentOrderProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a payment order instruction")
    UpdatePaymentOrderProcedureResponse updatePaymentOrderProcedure(UpdatePaymentOrderProcedureRequest req);

    @Description("ReCR Retrieve details about a payment order instruction")
    RetrievePaymentOrderProcedureResponse retrievePaymentOrderProcedure(RetrievePaymentOrderProcedureRequest req);
}