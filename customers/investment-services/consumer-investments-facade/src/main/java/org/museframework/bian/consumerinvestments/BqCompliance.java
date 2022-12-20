package org.museframework.bian.consumerinvestments;

import org.museframework.bian.consumerinvestments.dto.RetrieveComplianceRequest;
import org.museframework.bian.consumerinvestments.dto.RetrieveComplianceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="ConsumerInvestments", group="Compliance")
public interface BqCompliance {
    @Description("ReBQ Retrieve details about a consumer securities order compliance check")
    RetrieveComplianceResponse retrieveCompliance(RetrieveComplianceRequest req);
}