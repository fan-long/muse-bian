package org.museframework.bian.serevehis;

import org.museframework.bian.serevehis.dto.CaptureIssueRequest;
import org.museframework.bian.serevehis.dto.CaptureIssueResponse;
import org.museframework.bian.serevehis.dto.RetrieveIssueRequest;
import org.museframework.bian.serevehis.dto.RetrieveIssueResponse;
import org.museframework.bian.serevehis.dto.UpdateIssueRequest;
import org.museframework.bian.serevehis.dto.UpdateIssueResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="ServicingEventHistory", group="Issue")
public interface BqIssue {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured servicing issue event details")
    UpdateIssueResponse updateIssue(UpdateIssueRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture servicing issue event details")
    CaptureIssueResponse captureIssue(CaptureIssueRequest req);

    @Description("ReBQ Retrieve servicing issue event details")
    RetrieveIssueResponse retrieveIssue(RetrieveIssueRequest req);
}