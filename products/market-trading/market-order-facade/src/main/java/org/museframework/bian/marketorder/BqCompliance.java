package org.museframework.bian.marketorder;

import org.museframework.bian.marketorder.dto.RetrieveComplianceRequest;
import org.museframework.bian.marketorder.dto.RetrieveComplianceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="MarketOrder", group="Compliance")
public interface BqCompliance {
    @Description("ReBQ Retrieve details about a market order compliance check")
    RetrieveComplianceResponse retrieveCompliance(RetrieveComplianceRequest req);
}