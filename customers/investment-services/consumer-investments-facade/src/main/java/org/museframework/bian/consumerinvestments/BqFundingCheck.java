package org.museframework.bian.consumerinvestments;

import org.museframework.bian.consumerinvestments.dto.RetrieveFundingCheckRequest;
import org.museframework.bian.consumerinvestments.dto.RetrieveFundingCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="ConsumerInvestments", group="FundingCheck")
public interface BqFundingCheck {
    @Description("ReBQ Retrieve details about a funding check for a consumer securities order")
    RetrieveFundingCheckResponse retrieveFundingCheck(RetrieveFundingCheckRequest req);
}