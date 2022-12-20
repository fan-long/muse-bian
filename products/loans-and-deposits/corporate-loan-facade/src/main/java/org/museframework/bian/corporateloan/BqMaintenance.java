package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.RequestMaintenanceRequest;
import org.museframework.bian.corporateloan.dto.RequestMaintenanceResponse;
import org.museframework.bian.corporateloan.dto.RetrieveMaintenanceRequest;
import org.museframework.bian.corporateloan.dto.RetrieveMaintenanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateLoan", group="Maintenance")
public interface BqMaintenance {
    @GenericDtxEndpoint
    @Description("RqBQ Request a maintenance activity for a consumer load")
    RequestMaintenanceResponse requestMaintenance(RequestMaintenanceRequest req);

    @Description("ReBQ Retrieve details about maintenance processing for a corporate loan")
    RetrieveMaintenanceResponse retrieveMaintenance(RetrieveMaintenanceRequest req);
}