package org.museframework.bian.colassadm;

import org.museframework.bian.colassadm.dto.CreateMaintenanceRequest;
import org.museframework.bian.colassadm.dto.CreateMaintenanceResponse;
import org.museframework.bian.colassadm.dto.RequestMaintenanceRequest;
import org.museframework.bian.colassadm.dto.RequestMaintenanceResponse;
import org.museframework.bian.colassadm.dto.RetrieveMaintenanceRequest;
import org.museframework.bian.colassadm.dto.RetrieveMaintenanceResponse;
import org.museframework.bian.colassadm.dto.UpdateMaintenanceRequest;
import org.museframework.bian.colassadm.dto.UpdateMaintenanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="CollateralAssetAdministration", group="Maintenance")
public interface BqMaintenance {
    @GenericDtxEndpoint
    @Description("CrBQ Create a maintenance task for a collateral asset")
    CreateMaintenanceResponse createMaintenance(CreateMaintenanceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for a maintenance task")
    UpdateMaintenanceResponse updateMaintenance(UpdateMaintenanceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request an ad-hoc maintenance task (override the schedule)")
    RequestMaintenanceResponse requestMaintenance(RequestMaintenanceRequest req);

    @Description("ReBQ Retrieve details about a maintenance task")
    RetrieveMaintenanceResponse retrieveMaintenance(RetrieveMaintenanceRequest req);
}