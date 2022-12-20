package org.museframework.bian.customeragreement;

import org.museframework.bian.customeragreement.dto.EvaluateCustomerAgreementRequest;
import org.museframework.bian.customeragreement.dto.EvaluateCustomerAgreementResponse;
import org.museframework.bian.customeragreement.dto.RetrieveCustomerAgreementRequest;
import org.museframework.bian.customeragreement.dto.RetrieveCustomerAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Customer Agreement.   ")
@GenericDomain(name="CustomerAgreement", group="CustomerAgreement")
public interface CrCustomerAgreement {
    @GenericDtxEndpoint
    @Description("EvCR Establish a customer master agreement (evaluate applicable rules)")
    EvaluateCustomerAgreementResponse evaluateCustomerAgreement(EvaluateCustomerAgreementRequest req);

    @Description("ReCR Retrieve details about a customer master agreement")
    RetrieveCustomerAgreementResponse retrieveCustomerAgreement(RetrieveCustomerAgreementRequest req);
}