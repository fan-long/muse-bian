package org.museframework.bian.intpropor;

import org.museframework.bian.intpropor.dto.InitiateMaintenanceRequest;
import org.museframework.bian.intpropor.dto.InitiateMaintenanceResponse;
import org.museframework.bian.intpropor.dto.RequestMaintenanceRequest;
import org.museframework.bian.intpropor.dto.RequestMaintenanceResponse;
import org.museframework.bian.intpropor.dto.RetrieveMaintenanceRequest;
import org.museframework.bian.intpropor.dto.RetrieveMaintenanceResponse;
import org.museframework.bian.intpropor.dto.UpdateMaintenanceRequest;
import org.museframework.bian.intpropor.dto.UpdateMaintenanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="IntellectualPropertyPortfolio", group="Maintenance")
public interface BqMaintenance {
    @GenericDtxEndpoint
    @Description("InBQ Initiate maintenance activity for an intellectual property asset")
    InitiateMaintenanceResponse initiateMaintenance(InitiateMaintenanceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update maintenance activity details for an intellectual property asset")
    UpdateMaintenanceResponse updateMaintenance(UpdateMaintenanceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request a maintenance task is undertaken for an intellectual property asset")
    RequestMaintenanceResponse requestMaintenance(RequestMaintenanceRequest req);

    @Description("ReBQ Retrieve details about asset maintenance activity")
    RetrieveMaintenanceResponse retrieveMaintenance(RetrieveMaintenanceRequest req);
}