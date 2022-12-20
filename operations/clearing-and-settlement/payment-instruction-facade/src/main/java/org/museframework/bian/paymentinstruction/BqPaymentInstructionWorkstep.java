package org.museframework.bian.paymentinstruction;

import org.museframework.bian.paymentinstruction.dto.ExchangePaymentInstructionWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.ExchangePaymentInstructionWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.ExecutePaymentInstructionWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.ExecutePaymentInstructionWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.InitiatePaymentInstructionWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.InitiatePaymentInstructionWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.NotifyPaymentInstructionWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.NotifyPaymentInstructionWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.RequestPaymentInstructionWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.RequestPaymentInstructionWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.RetrievePaymentInstructionWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.RetrievePaymentInstructionWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.UpdatePaymentInstructionWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.UpdatePaymentInstructionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Payment Instruction Workstep in the context of executing the Payment Instruction Workstep")
@GenericDomain(name="PaymentInstruction", group="PaymentInstructionWorkstep")
public interface BqPaymentInstructionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Payment Instruction Workstep")
    ExchangePaymentInstructionWorkstepResponse exchangePaymentInstructionWorkstep(ExchangePaymentInstructionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Payment Instruction Workstep")
    ExecutePaymentInstructionWorkstepResponse executePaymentInstructionWorkstep(ExecutePaymentInstructionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Payment Instruction Workstep")
    InitiatePaymentInstructionWorkstepResponse initiatePaymentInstructionWorkstep(InitiatePaymentInstructionWorkstepRequest req);

    @Description("Notify Payment Instruction Workstep")
    NotifyPaymentInstructionWorkstepResponse notifyPaymentInstructionWorkstep(NotifyPaymentInstructionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Payment Instruction Workstep")
    RequestPaymentInstructionWorkstepResponse requestPaymentInstructionWorkstep(RequestPaymentInstructionWorkstepRequest req);

    @Description("Retrieve Payment Instruction Workstep")
    RetrievePaymentInstructionWorkstepResponse retrievePaymentInstructionWorkstep(RetrievePaymentInstructionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Payment Instruction Workstep")
    UpdatePaymentInstructionWorkstepResponse updatePaymentInstructionWorkstep(UpdatePaymentInstructionWorkstepRequest req);
}