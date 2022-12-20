package org.museframework.bian.chaactana;

import org.museframework.bian.chaactana.dto.ExecuteCustomerBehaviorRequest;
import org.museframework.bian.chaactana.dto.ExecuteCustomerBehaviorResponse;
import org.museframework.bian.chaactana.dto.RetrieveCustomerBehaviorRequest;
import org.museframework.bian.chaactana.dto.RetrieveCustomerBehaviorResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ChannelActivityAnalysis", group="CustomerBehavior")
public interface BqCustomerBehavior {
    @GenericDtxEndpoint
    @Description("ExBQ Obtain an automated refresh of customer out of pattern behavior analysis")
    ExecuteCustomerBehaviorResponse executeCustomerBehavior(ExecuteCustomerBehaviorRequest req);

    @Description("ReBQ Retrieve details about customer out of pattern behavior analysis, including recent results")
    RetrieveCustomerBehaviorResponse retrieveCustomerBehavior(RetrieveCustomerBehaviorRequest req);
}