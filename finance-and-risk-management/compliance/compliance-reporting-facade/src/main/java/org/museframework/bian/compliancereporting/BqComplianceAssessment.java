package org.museframework.bian.compliancereporting;

import org.museframework.bian.compliancereporting.dto.CaptureComplianceAssessmentRequest;
import org.museframework.bian.compliancereporting.dto.CaptureComplianceAssessmentResponse;
import org.museframework.bian.compliancereporting.dto.RequestComplianceAssessmentRequest;
import org.museframework.bian.compliancereporting.dto.RequestComplianceAssessmentResponse;
import org.museframework.bian.compliancereporting.dto.RetrieveComplianceAssessmentRequest;
import org.museframework.bian.compliancereporting.dto.RetrieveComplianceAssessmentResponse;
import org.museframework.bian.compliancereporting.dto.UpdateComplianceAssessmentRequest;
import org.museframework.bian.compliancereporting.dto.UpdateComplianceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ComplianceReporting", group="ComplianceAssessment")
public interface BqComplianceAssessment {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Compliance Assessment activity or event related information")
    CaptureComplianceAssessmentResponse captureComplianceAssessment(CaptureComplianceAssessmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Compliance Assessment")
    RetrieveComplianceAssessmentResponse retrieveComplianceAssessment(RetrieveComplianceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Compliance Assessment")
    RequestComplianceAssessmentResponse requestComplianceAssessment(RequestComplianceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Compliance Assessment")
    UpdateComplianceAssessmentResponse updateComplianceAssessment(UpdateComplianceAssessmentRequest req);
}