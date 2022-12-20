package org.museframework.bian.customerposition;

import org.museframework.bian.customerposition.dto.CaptureCashflowRequest;
import org.museframework.bian.customerposition.dto.CaptureCashflowResponse;
import org.museframework.bian.customerposition.dto.RetrieveCashflowRequest;
import org.museframework.bian.customerposition.dto.RetrieveCashflowResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="CustomerPosition", group="Cashflow")
public interface BqCashflow {
    @GenericDtxEndpoint
    @Description("CaBQ Capture product transaction reports (push from fulfillment)")
    CaptureCashflowResponse captureCashflow(CaptureCashflowRequest req);

    @Description("ReBQ retrieve details about a cash flow analysis as part of the customer position")
    RetrieveCashflowResponse retrieveCashflow(RetrieveCashflowRequest req);
}