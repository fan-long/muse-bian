package org.museframework.bian.paymentexecution;

import org.museframework.bian.paymentexecution.dto.InitiatePaymentExecutionProcedureRequest;
import org.museframework.bian.paymentexecution.dto.InitiatePaymentExecutionProcedureResponse;
import org.museframework.bian.paymentexecution.dto.RetrievePaymentExecutionProcedureRequest;
import org.museframework.bian.paymentexecution.dto.RetrievePaymentExecutionProcedureResponse;
import org.museframework.bian.paymentexecution.dto.UpdatePaymentExecutionProcedureRequest;
import org.museframework.bian.paymentexecution.dto.UpdatePaymentExecutionProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Execution. ")
@GenericDomain(name="PaymentExecution", group="PaymentExecutionProcedure")
public interface CrPaymentExecutionProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a payment execution procedure")
    InitiatePaymentExecutionProcedureResponse initiatePaymentExecutionProcedure(InitiatePaymentExecutionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a payment execution instruction")
    UpdatePaymentExecutionProcedureResponse updatePaymentExecutionProcedure(UpdatePaymentExecutionProcedureRequest req);

    @Description("ReCR Retrieve details about a payment execution instruction")
    RetrievePaymentExecutionProcedureResponse retrievePaymentExecutionProcedure(RetrievePaymentExecutionProcedureRequest req);
}