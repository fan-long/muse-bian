package org.museframework.bian.chelocbox;

import org.museframework.bian.chelocbox.dto.ExchangeLockBoxReportingandIssueResolutionFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.ExchangeLockBoxReportingandIssueResolutionFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.ExecuteLockBoxReportingandIssueResolutionFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.ExecuteLockBoxReportingandIssueResolutionFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.InitiateLockBoxReportingandIssueResolutionFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.InitiateLockBoxReportingandIssueResolutionFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.NotifyLockBoxReportingandIssueResolutionFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.NotifyLockBoxReportingandIssueResolutionFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.RequestLockBoxReportingandIssueResolutionFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.RequestLockBoxReportingandIssueResolutionFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.RetrieveLockBoxReportingandIssueResolutionFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.RetrieveLockBoxReportingandIssueResolutionFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.UpdateLockBoxReportingandIssueResolutionFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.UpdateLockBoxReportingandIssueResolutionFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Check Clearing and Settlement Fulfillment arrangement within the Check Clearing and Settlement Fulfillment")
@GenericDomain(name="ChequeLockBox", group="LockBoxReportingandIssueResolutionFulfillment")
public interface BqLockBoxReportingandIssueResolutionFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Lock Box Reporting and Issue Resolution Fulfillment")
    ExchangeLockBoxReportingandIssueResolutionFulfillmentResponse exchangeLockBoxReportingandIssueResolutionFulfillment(ExchangeLockBoxReportingandIssueResolutionFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Lock Box Reporting and Issue Resolution Fulfillment")
    ExecuteLockBoxReportingandIssueResolutionFulfillmentResponse executeLockBoxReportingandIssueResolutionFulfillment(ExecuteLockBoxReportingandIssueResolutionFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Lock Box Reporting and Issue Resolution Fulfillment")
    InitiateLockBoxReportingandIssueResolutionFulfillmentResponse initiateLockBoxReportingandIssueResolutionFulfillment(InitiateLockBoxReportingandIssueResolutionFulfillmentRequest req);

    @Description("Notify Lock Box Reporting and Issue Resolution Fulfillment")
    NotifyLockBoxReportingandIssueResolutionFulfillmentResponse notifyLockBoxReportingandIssueResolutionFulfillment(NotifyLockBoxReportingandIssueResolutionFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Lock Box Reporting and Issue Resolution Fulfillment")
    RequestLockBoxReportingandIssueResolutionFulfillmentResponse requestLockBoxReportingandIssueResolutionFulfillment(RequestLockBoxReportingandIssueResolutionFulfillmentRequest req);

    @Description("Retrieve Lock Box Reporting and Issue Resolution Fulfillment")
    RetrieveLockBoxReportingandIssueResolutionFulfillmentResponse retrieveLockBoxReportingandIssueResolutionFulfillment(RetrieveLockBoxReportingandIssueResolutionFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Lock Box Reporting and Issue Resolution Fulfillment")
    UpdateLockBoxReportingandIssueResolutionFulfillmentResponse updateLockBoxReportingandIssueResolutionFulfillment(UpdateLockBoxReportingandIssueResolutionFulfillmentRequest req);
}