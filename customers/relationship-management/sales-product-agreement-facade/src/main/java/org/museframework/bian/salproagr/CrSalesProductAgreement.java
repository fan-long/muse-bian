package org.museframework.bian.salproagr;

import org.museframework.bian.salproagr.dto.EvaluateSalesProductAgreementRequest;
import org.museframework.bian.salproagr.dto.EvaluateSalesProductAgreementResponse;
import org.museframework.bian.salproagr.dto.RetrieveSalesProductAgreementRequest;
import org.museframework.bian.salproagr.dto.RetrieveSalesProductAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Sales Product Agreement.   ")
@GenericDomain(name="SalesProductAgreement", group="SalesProductAgreement")
public interface CrSalesProductAgreement {
    @GenericDtxEndpoint
    @Description("EvCR Establish a sales product agreement")
    EvaluateSalesProductAgreementResponse evaluateSalesProductAgreement(EvaluateSalesProductAgreementRequest req);

    @Description("ReCR Retrieve details about a sales product agreement")
    RetrieveSalesProductAgreementResponse retrieveSalesProductAgreement(RetrieveSalesProductAgreementRequest req);
}