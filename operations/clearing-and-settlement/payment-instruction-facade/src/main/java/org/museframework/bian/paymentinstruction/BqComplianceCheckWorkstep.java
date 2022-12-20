package org.museframework.bian.paymentinstruction;

import org.museframework.bian.paymentinstruction.dto.ExchangeComplianceCheckWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.ExchangeComplianceCheckWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.ExecuteComplianceCheckWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.ExecuteComplianceCheckWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.InitiateComplianceCheckWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.InitiateComplianceCheckWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.NotifyComplianceCheckWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.NotifyComplianceCheckWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.RequestComplianceCheckWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.RequestComplianceCheckWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.RetrieveComplianceCheckWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.RetrieveComplianceCheckWorkstepResponse;
import org.museframework.bian.paymentinstruction.dto.UpdateComplianceCheckWorkstepRequest;
import org.museframework.bian.paymentinstruction.dto.UpdateComplianceCheckWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Payment Instruction Workstep in the context of executing the Payment Instruction Workstep")
@GenericDomain(name="PaymentInstruction", group="ComplianceCheckWorkstep")
public interface BqComplianceCheckWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Compliance Check Workstep")
    ExchangeComplianceCheckWorkstepResponse exchangeComplianceCheckWorkstep(ExchangeComplianceCheckWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Compliance Check Workstep")
    ExecuteComplianceCheckWorkstepResponse executeComplianceCheckWorkstep(ExecuteComplianceCheckWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Compliance Check Workstep")
    InitiateComplianceCheckWorkstepResponse initiateComplianceCheckWorkstep(InitiateComplianceCheckWorkstepRequest req);

    @Description("Notify Compliance Check Workstep")
    NotifyComplianceCheckWorkstepResponse notifyComplianceCheckWorkstep(NotifyComplianceCheckWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Compliance Check Workstep")
    RequestComplianceCheckWorkstepResponse requestComplianceCheckWorkstep(RequestComplianceCheckWorkstepRequest req);

    @Description("Retrieve Compliance Check Workstep")
    RetrieveComplianceCheckWorkstepResponse retrieveComplianceCheckWorkstep(RetrieveComplianceCheckWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Compliance Check Workstep")
    UpdateComplianceCheckWorkstepResponse updateComplianceCheckWorkstep(UpdateComplianceCheckWorkstepRequest req);
}