package org.museframework.bian.cusproandsereli;

import org.museframework.bian.cusproandsereli.dto.RetrieveEligibilityCheckRequest;
import org.museframework.bian.cusproandsereli.dto.RetrieveEligibilityCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CustomerProductAndServiceEligibility", group="EligibilityCheck")
public interface BqEligibilityCheck {
    @Description("ReBQ Retrieve details about an eligibility assessment")
    RetrieveEligibilityCheckResponse retrieveEligibilityCheck(RetrieveEligibilityCheckRequest req);
}