package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.RequestMaintenanceRequest;
import org.museframework.bian.consumerloan.dto.RequestMaintenanceResponse;
import org.museframework.bian.consumerloan.dto.RetrieveMaintenanceRequest;
import org.museframework.bian.consumerloan.dto.RetrieveMaintenanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="ConsumerLoan", group="Maintenance")
public interface BqMaintenance {
    @GenericDtxEndpoint
    @Description("RqBQ Request a maintenance activity for a consumer load (e.g. obtain a fee statement)")
    RequestMaintenanceResponse requestMaintenance(RequestMaintenanceRequest req);

    @Description("ReBQ Retrieve details about maintenance processing for a consumer loan")
    RetrieveMaintenanceResponse retrieveMaintenance(RetrieveMaintenanceRequest req);
}