package org.museframework.bian.probroagr;

import org.museframework.bian.probroagr.dto.EvaluateBrokerAgreementRequest;
import org.museframework.bian.probroagr.dto.EvaluateBrokerAgreementResponse;
import org.museframework.bian.probroagr.dto.RetrieveBrokerAgreementRequest;
import org.museframework.bian.probroagr.dto.RetrieveBrokerAgreementResponse;
import org.museframework.bian.probroagr.dto.UpdateBrokerAgreementRequest;
import org.museframework.bian.probroagr.dto.UpdateBrokerAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Product Broker Agreement.   ")
@GenericDomain(name="ProductBrokerAgreement", group="BrokerAgreement")
public interface CrBrokerAgreement {
    @GenericDtxEndpoint
    @Description("EvCR Establish a product broker agreement (evaluate applicable rules)")
    EvaluateBrokerAgreementResponse evaluateBrokerAgreement(EvaluateBrokerAgreementRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active product broker agreement")
    UpdateBrokerAgreementResponse updateBrokerAgreement(UpdateBrokerAgreementRequest req);

    @Description("ReCR Retrieve details about a broker agreement")
    RetrieveBrokerAgreementResponse retrieveBrokerAgreement(RetrieveBrokerAgreementRequest req);
}