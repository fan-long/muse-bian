package org.museframework.bian.ebranchmanagement;

import org.museframework.bian.ebranchmanagement.dto.CreateMaintenanceAndUpgradesRequest;
import org.museframework.bian.ebranchmanagement.dto.CreateMaintenanceAndUpgradesResponse;
import org.museframework.bian.ebranchmanagement.dto.RequestMaintenanceAndUpgradesRequest;
import org.museframework.bian.ebranchmanagement.dto.RequestMaintenanceAndUpgradesResponse;
import org.museframework.bian.ebranchmanagement.dto.RetrieveMaintenanceAndUpgradesRequest;
import org.museframework.bian.ebranchmanagement.dto.RetrieveMaintenanceAndUpgradesResponse;
import org.museframework.bian.ebranchmanagement.dto.UpdateMaintenanceAndUpgradesRequest;
import org.museframework.bian.ebranchmanagement.dto.UpdateMaintenanceAndUpgradesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="eBranchManagement", group="MaintenanceAndUpgrades")
public interface BqMaintenanceAndUpgrades {
    @GenericDtxEndpoint
    @Description("CrBQ Create a maintenance or upgrade task plan item for the channel")
    CreateMaintenanceAndUpgradesResponse createMaintenanceAndUpgrades(CreateMaintenanceAndUpgradesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a maintenance or upgrade management plan item")
    UpdateMaintenanceAndUpgradesResponse updateMaintenanceAndUpgrades(UpdateMaintenanceAndUpgradesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to a maintenance or upgrade action")
    RequestMaintenanceAndUpgradesResponse requestMaintenanceAndUpgrades(RequestMaintenanceAndUpgradesRequest req);

    @Description("ReBQ Retrieve details about a maintenance or upgrade management plan")
    RetrieveMaintenanceAndUpgradesResponse retrieveMaintenanceAndUpgrades(RetrieveMaintenanceAndUpgradesRequest req);
}