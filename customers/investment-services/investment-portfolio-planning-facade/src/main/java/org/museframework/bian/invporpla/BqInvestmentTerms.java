package org.museframework.bian.invporpla;

import org.museframework.bian.invporpla.dto.EvaluateInvestmentTermsRequest;
import org.museframework.bian.invporpla.dto.EvaluateInvestmentTermsResponse;
import org.museframework.bian.invporpla.dto.RequestInvestmentTermsRequest;
import org.museframework.bian.invporpla.dto.RequestInvestmentTermsResponse;
import org.museframework.bian.invporpla.dto.RetrieveInvestmentTermsRequest;
import org.museframework.bian.invporpla.dto.RetrieveInvestmentTermsResponse;
import org.museframework.bian.invporpla.dto.UpdateInvestmentTermsRequest;
import org.museframework.bian.invporpla.dto.UpdateInvestmentTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="InvestmentPortfolioPlanning", group="InvestmentTerms")
public interface BqInvestmentTerms {
    @GenericDtxEndpoint
    @Description("EvBQ Establish the specific terms/conditions making up the investment agreement")
    EvaluateInvestmentTermsResponse evaluateInvestmentTerms(EvaluateInvestmentTermsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the terms/conditions for an investment agreement")
    UpdateInvestmentTermsResponse updateInvestmentTerms(UpdateInvestmentTermsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request check of a proposed activity is compatible with a specific term of the agreement")
    RequestInvestmentTermsResponse requestInvestmentTerms(RequestInvestmentTermsRequest req);

    @Description("ReBQ Retrieve details about the specific terms of an agreement")
    RetrieveInvestmentTermsResponse retrieveInvestmentTerms(RetrieveInvestmentTermsRequest req);
}