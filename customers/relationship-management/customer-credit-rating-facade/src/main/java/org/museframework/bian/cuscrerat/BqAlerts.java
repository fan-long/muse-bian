package org.museframework.bian.cuscrerat;

import org.museframework.bian.cuscrerat.dto.CaptureAlertsRequest;
import org.museframework.bian.cuscrerat.dto.CaptureAlertsResponse;
import org.museframework.bian.cuscrerat.dto.RetrieveAlertsRequest;
import org.museframework.bian.cuscrerat.dto.RetrieveAlertsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="CustomerCreditRating", group="Alerts")
public interface BqAlerts {
    @GenericDtxEndpoint
    @Description("CaBQ Capture notification of a credit alert")
    CaptureAlertsResponse captureAlerts(CaptureAlertsRequest req);

    @Description("ReBQ Retrieve details about a credit alert")
    RetrieveAlertsResponse retrieveAlerts(RetrieveAlertsRequest req);
}