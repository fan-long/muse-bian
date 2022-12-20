package org.museframework.bian.cusaccent;

import org.museframework.bian.cusaccent.dto.EvaluateCustomerAccessProfileAgreementRequest;
import org.museframework.bian.cusaccent.dto.EvaluateCustomerAccessProfileAgreementResponse;
import org.museframework.bian.cusaccent.dto.RequestCustomerAccessProfileAgreementRequest;
import org.museframework.bian.cusaccent.dto.RequestCustomerAccessProfileAgreementResponse;
import org.museframework.bian.cusaccent.dto.RetrieveCustomerAccessProfileAgreementRequest;
import org.museframework.bian.cusaccent.dto.RetrieveCustomerAccessProfileAgreementResponse;
import org.museframework.bian.cusaccent.dto.UpdateCustomerAccessProfileAgreementRequest;
import org.museframework.bian.cusaccent.dto.UpdateCustomerAccessProfileAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Customer Access Entitlement.   ")
@GenericDomain(name="CustomerAccessEntitlement", group="CustomerAccessProfileAgreement")
public interface CrCustomerAccessProfileAgreement {
    @GenericDtxEndpoint
    @Description("EvCR Establish a customer access profile agreement")
    EvaluateCustomerAccessProfileAgreementResponse evaluateCustomerAccessProfileAgreement(EvaluateCustomerAccessProfileAgreementRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a customer access profile agreement")
    UpdateCustomerAccessProfileAgreementResponse updateCustomerAccessProfileAgreement(UpdateCustomerAccessProfileAgreementRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in a customer access profile (e.g. handle exceptions)")
    RequestCustomerAccessProfileAgreementResponse requestCustomerAccessProfileAgreement(RequestCustomerAccessProfileAgreementRequest req);

    @Description("ReCR Retrieve details about a customer access profile agreement")
    RetrieveCustomerAccessProfileAgreementResponse retrieveCustomerAccessProfileAgreement(RetrieveCustomerAccessProfileAgreementRequest req);
}