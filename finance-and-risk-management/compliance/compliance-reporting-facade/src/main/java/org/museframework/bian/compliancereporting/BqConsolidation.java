package org.museframework.bian.compliancereporting;

import org.museframework.bian.compliancereporting.dto.CaptureConsolidationRequest;
import org.museframework.bian.compliancereporting.dto.CaptureConsolidationResponse;
import org.museframework.bian.compliancereporting.dto.RequestConsolidationRequest;
import org.museframework.bian.compliancereporting.dto.RequestConsolidationResponse;
import org.museframework.bian.compliancereporting.dto.RetrieveConsolidationRequest;
import org.museframework.bian.compliancereporting.dto.RetrieveConsolidationResponse;
import org.museframework.bian.compliancereporting.dto.UpdateConsolidationRequest;
import org.museframework.bian.compliancereporting.dto.UpdateConsolidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ComplianceReporting", group="Consolidation")
public interface BqConsolidation {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Consolidation activity or event related information")
    CaptureConsolidationResponse captureConsolidation(CaptureConsolidationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Consolidation")
    RetrieveConsolidationResponse retrieveConsolidation(RetrieveConsolidationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Consolidation")
    RequestConsolidationResponse requestConsolidation(RequestConsolidationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Consolidation")
    UpdateConsolidationResponse updateConsolidation(UpdateConsolidationRequest req);
}