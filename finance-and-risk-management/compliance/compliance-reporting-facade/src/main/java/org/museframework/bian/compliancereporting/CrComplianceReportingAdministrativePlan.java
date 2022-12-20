package org.museframework.bian.compliancereporting;

import org.museframework.bian.compliancereporting.dto.CaptureComplianceReportingAdministrativePlanRequest;
import org.museframework.bian.compliancereporting.dto.CaptureComplianceReportingAdministrativePlanResponse;
import org.museframework.bian.compliancereporting.dto.InitiateComplianceReportingAdministrativePlanRequest;
import org.museframework.bian.compliancereporting.dto.InitiateComplianceReportingAdministrativePlanResponse;
import org.museframework.bian.compliancereporting.dto.RequestComplianceReportingAdministrativePlanRequest;
import org.museframework.bian.compliancereporting.dto.RequestComplianceReportingAdministrativePlanResponse;
import org.museframework.bian.compliancereporting.dto.RetrieveComplianceReportingAdministrativePlanRequest;
import org.museframework.bian.compliancereporting.dto.RetrieveComplianceReportingAdministrativePlanResponse;
import org.museframework.bian.compliancereporting.dto.UpdateComplianceReportingAdministrativePlanRequest;
import org.museframework.bian.compliancereporting.dto.UpdateComplianceReportingAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ComplianceReporting", group="ComplianceReportingAdministrativePlan")
public interface CrComplianceReportingAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CaCR Capture Compliance Reporting Administrative Plan activity or event related information")
    CaptureComplianceReportingAdministrativePlanResponse captureComplianceReportingAdministrativePlan(CaptureComplianceReportingAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Compliance Reporting Administrative Plan")
    InitiateComplianceReportingAdministrativePlanResponse initiateComplianceReportingAdministrativePlan(InitiateComplianceReportingAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about any aspect of Compliance Reporting Administrative Plan")
    RetrieveComplianceReportingAdministrativePlanResponse retrieveComplianceReportingAdministrativePlan(RetrieveComplianceReportingAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Compliance Reporting Administrative Plan")
    RequestComplianceReportingAdministrativePlanResponse requestComplianceReportingAdministrativePlan(RequestComplianceReportingAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Compliance Reporting Administrative Plan")
    UpdateComplianceReportingAdministrativePlanResponse updateComplianceReportingAdministrativePlan(UpdateComplianceReportingAdministrativePlanRequest req);
}