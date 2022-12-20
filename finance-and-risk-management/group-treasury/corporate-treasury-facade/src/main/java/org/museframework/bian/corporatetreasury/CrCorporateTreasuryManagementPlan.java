package org.museframework.bian.corporatetreasury;

import org.museframework.bian.corporatetreasury.dto.RetrieveCorporateTreasuryManagementPlanRequest;
import org.museframework.bian.corporatetreasury.dto.RetrieveCorporateTreasuryManagementPlanResponse;
import org.museframework.bian.corporatetreasury.dto.UpdateCorporateTreasuryManagementPlanRequest;
import org.museframework.bian.corporatetreasury.dto.UpdateCorporateTreasuryManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Corporate Treasury.")
@GenericDomain(name="CorporateTreasury", group="CorporateTreasuryManagementPlan")
public interface CrCorporateTreasuryManagementPlan {
    @GenericDtxEndpoint
    @Description("UpCR Update the corporate treasury plan")
    UpdateCorporateTreasuryManagementPlanResponse updateCorporateTreasuryManagementPlan(UpdateCorporateTreasuryManagementPlanRequest req);

    @Description("ReCR Retrieve details about the corporate treasury plan")
    RetrieveCorporateTreasuryManagementPlanResponse retrieveCorporateTreasuryManagementPlan(RetrieveCorporateTreasuryManagementPlanRequest req);
}