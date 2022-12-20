package org.museframework.bian.proexpsalsup;

import org.museframework.bian.proexpsalsup.dto.CreateSalesSpecialistSupportAdministrativePlanRequest;
import org.museframework.bian.proexpsalsup.dto.CreateSalesSpecialistSupportAdministrativePlanResponse;
import org.museframework.bian.proexpsalsup.dto.RequestSalesSpecialistSupportAdministrativePlanRequest;
import org.museframework.bian.proexpsalsup.dto.RequestSalesSpecialistSupportAdministrativePlanResponse;
import org.museframework.bian.proexpsalsup.dto.RetrieveSalesSpecialistSupportAdministrativePlanRequest;
import org.museframework.bian.proexpsalsup.dto.RetrieveSalesSpecialistSupportAdministrativePlanResponse;
import org.museframework.bian.proexpsalsup.dto.UpdateSalesSpecialistSupportAdministrativePlanRequest;
import org.museframework.bian.proexpsalsup.dto.UpdateSalesSpecialistSupportAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Product Expert Sales Support.  ")
@GenericDomain(name="ProductExpertSalesSupport", group="SalesSpecialistSupportAdministrativePlan")
public interface CrSalesSpecialistSupportAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CrCR Create or set-up the administrative plan for sales specialist assignments")
    CreateSalesSpecialistSupportAdministrativePlanResponse createSalesSpecialistSupportAdministrativePlan(CreateSalesSpecialistSupportAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the overall sale specialist support administrative plan")
    UpdateSalesSpecialistSupportAdministrativePlanResponse updateSalesSpecialistSupportAdministrativePlan(UpdateSalesSpecialistSupportAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with the administrative plan")
    RequestSalesSpecialistSupportAdministrativePlanResponse requestSalesSpecialistSupportAdministrativePlan(RequestSalesSpecialistSupportAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about the administrative plan")
    RetrieveSalesSpecialistSupportAdministrativePlanResponse retrieveSalesSpecialistSupportAdministrativePlan(RetrieveSalesSpecialistSupportAdministrativePlanRequest req);
}