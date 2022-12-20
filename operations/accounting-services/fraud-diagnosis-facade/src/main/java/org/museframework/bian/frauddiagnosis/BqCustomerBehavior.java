package org.museframework.bian.frauddiagnosis;

import org.museframework.bian.frauddiagnosis.dto.RetrieveCustomerBehaviorRequest;
import org.museframework.bian.frauddiagnosis.dto.RetrieveCustomerBehaviorResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="FraudDiagnosis", group="CustomerBehavior")
public interface BqCustomerBehavior {
    @Description("ReBQ Retrieve details about a customer behavior analysis")
    RetrieveCustomerBehaviorResponse retrieveCustomerBehavior(RetrieveCustomerBehaviorRequest req);
}