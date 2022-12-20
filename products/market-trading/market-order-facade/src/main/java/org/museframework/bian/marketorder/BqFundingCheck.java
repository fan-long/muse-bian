package org.museframework.bian.marketorder;

import org.museframework.bian.marketorder.dto.RetrieveFundingCheckRequest;
import org.museframework.bian.marketorder.dto.RetrieveFundingCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="MarketOrder", group="FundingCheck")
public interface BqFundingCheck {
    @Description("ReBQ Retrieve details about a market order funding check")
    RetrieveFundingCheckResponse retrieveFundingCheck(RetrieveFundingCheckRequest req);
}