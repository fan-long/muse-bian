package org.museframework.bian.compliancereporting;

import org.museframework.bian.compliancereporting.dto.CaptureRemediationRequest;
import org.museframework.bian.compliancereporting.dto.CaptureRemediationResponse;
import org.museframework.bian.compliancereporting.dto.InitiateRemediationRequest;
import org.museframework.bian.compliancereporting.dto.InitiateRemediationResponse;
import org.museframework.bian.compliancereporting.dto.RequestRemediationRequest;
import org.museframework.bian.compliancereporting.dto.RequestRemediationResponse;
import org.museframework.bian.compliancereporting.dto.RetrieveRemediationRequest;
import org.museframework.bian.compliancereporting.dto.RetrieveRemediationResponse;
import org.museframework.bian.compliancereporting.dto.UpdateRemediationRequest;
import org.museframework.bian.compliancereporting.dto.UpdateRemediationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ComplianceReporting", group="Remediation")
public interface BqRemediation {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Remediation activity or event related information")
    CaptureRemediationResponse captureRemediation(CaptureRemediationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Remediation")
    InitiateRemediationResponse initiateRemediation(InitiateRemediationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Remediation")
    RetrieveRemediationResponse retrieveRemediation(RetrieveRemediationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Remediation")
    RequestRemediationResponse requestRemediation(RequestRemediationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Remediation")
    UpdateRemediationResponse updateRemediation(UpdateRemediationRequest req);
}