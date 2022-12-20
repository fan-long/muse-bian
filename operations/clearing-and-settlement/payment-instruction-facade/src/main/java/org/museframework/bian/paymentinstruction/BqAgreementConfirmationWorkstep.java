package org.museframework.bian.paymentinstruction;

import org.museframework.bian.paymentinstruction.dto.ExchangeAgreementConfirmationWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.ExchangeAgreementConfirmationWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.ExecuteAgreementConfirmationWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.ExecuteAgreementConfirmationWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.InitiateAgreementConfirmationWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.InitiateAgreementConfirmationWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.NotifyAgreementConfirmationWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.NotifyAgreementConfirmationWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.RequestAgreementConfirmationWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.RequestAgreementConfirmationWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.RetrieveAgreementConfirmationWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.RetrieveAgreementConfirmationWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.UpdateAgreementConfirmationWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.UpdateAgreementConfirmationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Payment Instruction Workstep in the context of executing the Payment Instruction Workstep")
@GenericDomain(name="PaymentInstruction", group="AgreementConfirmationWorkstep")
public interface BqAgreementConfirmationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Agreement Confirmation Workstep")
    ExchangeAgreementConfirmationWorkstepResponse exchangeAgreementConfirmationWorkstep(ExchangeAgreementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Agreement Confirmation Workstep")
    ExecuteAgreementConfirmationWorkstepResponse executeAgreementConfirmationWorkstep(ExecuteAgreementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Agreement Confirmation Workstep")
    InitiateAgreementConfirmationWorkstepResponse initiateAgreementConfirmationWorkstep(InitiateAgreementConfirmationWorkstepRequest req);

    @Description("Notify Agreement Confirmation Workstep")
    NotifyAgreementConfirmationWorkstepResponse notifyAgreementConfirmationWorkstep(NotifyAgreementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Agreement Confirmation Workstep")
    RequestAgreementConfirmationWorkstepResponse requestAgreementConfirmationWorkstep(RequestAgreementConfirmationWorkstepRequest req);

    @Description("Retrieve Agreement Confirmation Workstep")
    RetrieveAgreementConfirmationWorkstepResponse retrieveAgreementConfirmationWorkstep(RetrieveAgreementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Agreement Confirmation Workstep")
    UpdateAgreementConfirmationWorkstepResponse updateAgreementConfirmationWorkstep(UpdateAgreementConfirmationWorkstepRequest req);
}