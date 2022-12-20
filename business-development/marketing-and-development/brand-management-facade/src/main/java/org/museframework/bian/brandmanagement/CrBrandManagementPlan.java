package org.museframework.bian.brandmanagement;

import org.museframework.bian.brandmanagement.dto.RequestBrandManagementPlanRequest;
import org.museframework.bian.brandmanagement.dto.RequestBrandManagementPlanResponse;
import org.museframework.bian.brandmanagement.dto.RetrieveBrandManagementPlanRequest;
import org.museframework.bian.brandmanagement.dto.RetrieveBrandManagementPlanResponse;
import org.museframework.bian.brandmanagement.dto.UpdateBrandManagementPlanRequest;
import org.museframework.bian.brandmanagement.dto.UpdateBrandManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Brand Management.")
@GenericDomain(name="BrandManagement", group="BrandManagementPlan")
public interface CrBrandManagementPlan {
    @GenericDtxEndpoint
    @Description("UpCR Update aspects of eth brand management plan")
    UpdateBrandManagementPlanResponse updateBrandManagementPlan(UpdateBrandManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with the brand management plan (e.g. reassess brand value/significance)")
    RequestBrandManagementPlanResponse requestBrandManagementPlan(RequestBrandManagementPlanRequest req);

    @Description("ReCR Retrieve details about brand management activity")
    RetrieveBrandManagementPlanResponse retrieveBrandManagementPlan(RetrieveBrandManagementPlanRequest req);
}