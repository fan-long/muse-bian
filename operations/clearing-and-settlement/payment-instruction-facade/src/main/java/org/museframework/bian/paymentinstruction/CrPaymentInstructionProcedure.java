package org.museframework.bian.paymentinstruction;

import org.museframework.bian.paymentinstruction.dto.ControlPaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.ControlPaymentInstructionProcedureResponse;
import org.museframework.bian.paymentinstruction.dto.ExchangePaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.ExchangePaymentInstructionProcedureResponse;
import org.museframework.bian.paymentinstruction.dto.ExecutePaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.ExecutePaymentInstructionProcedureResponse;
import org.museframework.bian.paymentinstruction.dto.InitiatePaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.InitiatePaymentInstructionProcedureResponse;
import org.museframework.bian.paymentinstruction.dto.NotifyPaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.NotifyPaymentInstructionProcedureResponse;
import org.museframework.bian.paymentinstruction.dto.RequestPaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.RequestPaymentInstructionProcedureResponse;
import org.museframework.bian.paymentinstruction.dto.RetrievePaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.RetrievePaymentInstructionProcedureResponse;
import org.museframework.bian.paymentinstruction.dto.UpdatePaymentInstructionProcedureRequest;
import org.museframework.bian.paymentinstruction.dto.UpdatePaymentInstructionProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Instruction. ")
@GenericDomain(name="PaymentInstruction", group="PaymentInstructionProcedure")
public interface CrPaymentInstructionProcedure {
    @GenericDtxEndpoint
    @Description("Control Payment Instruction Procedure")
    ControlPaymentInstructionProcedureResponse controlPaymentInstructionProcedure(ControlPaymentInstructionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Payment Instruction Procedure")
    ExchangePaymentInstructionProcedureResponse exchangePaymentInstructionProcedure(ExchangePaymentInstructionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Payment Instruction Procedure")
    ExecutePaymentInstructionProcedureResponse executePaymentInstructionProcedure(ExecutePaymentInstructionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Payment Instruction Procedure")
    InitiatePaymentInstructionProcedureResponse initiatePaymentInstructionProcedure(InitiatePaymentInstructionProcedureRequest req);

    @Description("Notify Payment Instruction Procedure")
    NotifyPaymentInstructionProcedureResponse notifyPaymentInstructionProcedure(NotifyPaymentInstructionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Payment Instruction Procedure")
    RequestPaymentInstructionProcedureResponse requestPaymentInstructionProcedure(RequestPaymentInstructionProcedureRequest req);

    @Description("Retrieve Payment Instruction Procedure")
    RetrievePaymentInstructionProcedureResponse retrievePaymentInstructionProcedure(RetrievePaymentInstructionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Payment Instruction Procedure")
    UpdatePaymentInstructionProcedureResponse updatePaymentInstructionProcedure(UpdatePaymentInstructionProcedureRequest req);
}