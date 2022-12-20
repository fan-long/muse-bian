package org.museframework.bian.investmentaccount;

import org.museframework.bian.investmentaccount.dto.ExecuteCorporateActionRequest;
import org.museframework.bian.investmentaccount.dto.ExecuteCorporateActionResponse;
import org.museframework.bian.investmentaccount.dto.InitiateCorporateActionRequest;
import org.museframework.bian.investmentaccount.dto.InitiateCorporateActionResponse;
import org.museframework.bian.investmentaccount.dto.RetrieveCorporateActionRequest;
import org.museframework.bian.investmentaccount.dto.RetrieveCorporateActionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="InvestmentAccount", group="CorporateAction")
public interface BqCorporateAction {
    @GenericDtxEndpoint
    @Description("InBQ Initiate/set-up corporate action processing for the account")
    InitiateCorporateActionResponse initiateCorporateAction(InitiateCorporateActionRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute the processing of a corporate action")
    ExecuteCorporateActionResponse executeCorporateAction(ExecuteCorporateActionRequest req);

    @Description("ReBQ Retrieve details about corporate action processing")
    RetrieveCorporateActionResponse retrieveCorporateAction(RetrieveCorporateActionRequest req);
}