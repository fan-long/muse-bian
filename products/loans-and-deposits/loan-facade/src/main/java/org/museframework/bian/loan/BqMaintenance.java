package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.RequestMaintenanceRequest;
import org.museframework.bian.loan.dto.RequestMaintenanceResponse;
import org.museframework.bian.loan.dto.RetrieveMaintenanceRequest;
import org.museframework.bian.loan.dto.RetrieveMaintenanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="Loan", group="Maintenance")
public interface BqMaintenance {
    @GenericDtxEndpoint
    @Description("RqBQ Request a maintenance activity for a consumer load")
    RequestMaintenanceResponse requestMaintenance(RequestMaintenanceRequest req);

    @Description("ReBQ Retrieve details about maintenance processing for a loan")
    RetrieveMaintenanceResponse retrieveMaintenance(RetrieveMaintenanceRequest req);
}