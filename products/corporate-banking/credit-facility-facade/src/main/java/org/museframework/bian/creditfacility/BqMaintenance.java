package org.museframework.bian.creditfacility;

import org.museframework.bian.creditfacility.dto.RequestMaintenanceRequest;
import org.museframework.bian.creditfacility.dto.RequestMaintenanceResponse;
import org.museframework.bian.creditfacility.dto.RetrieveMaintenanceRequest;
import org.museframework.bian.creditfacility.dto.RetrieveMaintenanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CreditFacility", group="Maintenance")
public interface BqMaintenance {
    @GenericDtxEndpoint
    @Description("RqBQ Request a maintenance activity for a credit facility")
    RequestMaintenanceResponse requestMaintenance(RequestMaintenanceRequest req);

    @Description("ReBQ Retrieve details about maintenance processing for a credit facility")
    RetrieveMaintenanceResponse retrieveMaintenance(RetrieveMaintenanceRequest req);
}