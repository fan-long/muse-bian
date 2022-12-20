package org.museframework.bian.customerposition;

import org.museframework.bian.customerposition.dto.CaptureCollateralRequest;
import org.museframework.bian.customerposition.dto.CaptureCollateralResponse;
import org.museframework.bian.customerposition.dto.RetrieveCollateralRequest;
import org.museframework.bian.customerposition.dto.RetrieveCollateralResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="CustomerPosition", group="Collateral")
public interface BqCollateral {
    @GenericDtxEndpoint
    @Description("CaBQ Capture collateral allocation reports (push from collateral allocation management)")
    CaptureCollateralResponse captureCollateral(CaptureCollateralRequest req);

    @Description("ReBQ retrieve details about a collateral allocation as part of the customer position")
    RetrieveCollateralResponse retrieveCollateral(RetrieveCollateralRequest req);
}