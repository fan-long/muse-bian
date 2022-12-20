package org.museframework.bian.salesproduct;

import org.museframework.bian.salesproduct.dto.EvaluateProductandServiceAgreementRequest;
import org.museframework.bian.salesproduct.dto.EvaluateProductandServiceAgreementResponse;
import org.museframework.bian.salesproduct.dto.RetrieveProductandServiceAgreementRequest;
import org.museframework.bian.salesproduct.dto.RetrieveProductandServiceAgreementResponse;
import org.museframework.bian.salesproduct.dto.UpdateProductandServiceAgreementRequest;
import org.museframework.bian.salesproduct.dto.UpdateProductandServiceAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Sales Product.   ")
@GenericDomain(name="SalesProduct", group="ProductandServiceAgreement")
public interface CrProductandServiceAgreement {
    @GenericDtxEndpoint
    @Description("EvCR Set-up the operational terms agreement for a sales product instance")
    EvaluateProductandServiceAgreementResponse evaluateProductandServiceAgreement(EvaluateProductandServiceAgreementRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update sales product operational terms agreement")
    UpdateProductandServiceAgreementResponse updateProductandServiceAgreement(UpdateProductandServiceAgreementRequest req);

    @Description("ReCR Retrieve details about the sales product operational terms agreement")
    RetrieveProductandServiceAgreementResponse retrieveProductandServiceAgreement(RetrieveProductandServiceAgreementRequest req);
}