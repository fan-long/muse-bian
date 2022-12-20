package org.museframework.bian.customerposition;

import org.museframework.bian.customerposition.dto.CaptureCreditRequest;
import org.museframework.bian.customerposition.dto.CaptureCreditResponse;
import org.museframework.bian.customerposition.dto.RetrieveCreditRequest;
import org.museframework.bian.customerposition.dto.RetrieveCreditResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="CustomerPosition", group="Credit")
public interface BqCredit {
    @GenericDtxEndpoint
    @Description("CaBQ Capture credit assessment reports (push from credit administration)")
    CaptureCreditResponse captureCredit(CaptureCreditRequest req);

    @Description("ReBQ retrieve details about a credit analysis as part of the customer position")
    RetrieveCreditResponse retrieveCredit(RetrieveCreditRequest req);
}