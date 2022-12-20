package org.museframework.bian.colassadm;

import org.museframework.bian.colassadm.dto.CreateCollateralAssetAdministrativePlanRequest;
import org.museframework.bian.colassadm.dto.CreateCollateralAssetAdministrativePlanResponse;
import org.museframework.bian.colassadm.dto.RetrieveCollateralAssetAdministrativePlanRequest;
import org.museframework.bian.colassadm.dto.RetrieveCollateralAssetAdministrativePlanResponse;
import org.museframework.bian.colassadm.dto.UpdateCollateralAssetAdministrativePlanRequest;
import org.museframework.bian.colassadm.dto.UpdateCollateralAssetAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Collateral Asset Administration.  ")
@GenericDomain(name="CollateralAssetAdministration", group="CollateralAssetAdministrativePlan")
public interface CrCollateralAssetAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CrCR Create a collateral asset administrative plan for a new item")
    CreateCollateralAssetAdministrativePlanResponse createCollateralAssetAdministrativePlan(CreateCollateralAssetAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the administrative plan")
    UpdateCollateralAssetAdministrativePlanResponse updateCollateralAssetAdministrativePlan(UpdateCollateralAssetAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about an active collateral asset administrative plan")
    RetrieveCollateralAssetAdministrativePlanResponse retrieveCollateralAssetAdministrativePlan(RetrieveCollateralAssetAdministrativePlanRequest req);
}