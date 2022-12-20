package org.museframework.bian.regulatoryreporting;

import org.museframework.bian.regulatoryreporting.dto.CreateRegulatoryComplianceAdministrativePlanRequest;
import org.museframework.bian.regulatoryreporting.dto.CreateRegulatoryComplianceAdministrativePlanResponse;
import org.museframework.bian.regulatoryreporting.dto.RetrieveRegulatoryComplianceAdministrativePlanRequest;
import org.museframework.bian.regulatoryreporting.dto.RetrieveRegulatoryComplianceAdministrativePlanResponse;
import org.museframework.bian.regulatoryreporting.dto.UpdateRegulatoryComplianceAdministrativePlanRequest;
import org.museframework.bian.regulatoryreporting.dto.UpdateRegulatoryComplianceAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Regulatory Reporting.  ")
@GenericDomain(name="RegulatoryReporting", group="RegulatoryComplianceAdministrativePlan")
public interface CrRegulatoryComplianceAdministrativePlan {
    @GenericDtxEndpoint
    @Description("UpCR Update the regulatory reporting set up or schedule")
    UpdateRegulatoryComplianceAdministrativePlanResponse updateRegulatoryComplianceAdministrativePlan(UpdateRegulatoryComplianceAdministrativePlanRequest req);

    @Description("ReCR Retrieve any details of the regulatory reporting administration")
    RetrieveRegulatoryComplianceAdministrativePlanResponse retrieveRegulatoryComplianceAdministrativePlan(RetrieveRegulatoryComplianceAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("CrBQ Initiate the handling of a regulatory reporting enquiry")
    CreateRegulatoryComplianceAdministrativePlanResponse createRegulatoryComplianceAdministrativePlan(CreateRegulatoryComplianceAdministrativePlanRequest req);
}