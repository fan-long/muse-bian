package org.museframework.bian.knowledgeexchange;

import org.museframework.bian.knowledgeexchange.dto.RequestMaintenanceandAccessAdministrationRequest;
import org.museframework.bian.knowledgeexchange.dto.RequestMaintenanceandAccessAdministrationResponse;
import org.museframework.bian.knowledgeexchange.dto.RetrieveMaintenanceandAccessAdministrationRequest;
import org.museframework.bian.knowledgeexchange.dto.RetrieveMaintenanceandAccessAdministrationResponse;
import org.museframework.bian.knowledgeexchange.dto.UpdateMaintenanceandAccessAdministrationRequest;
import org.museframework.bian.knowledgeexchange.dto.UpdateMaintenanceandAccessAdministrationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Knowledge Exchange.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="KnowledgeExchange", group="MaintenanceandAccessAdministration")
public interface BqMaintenanceandAccessAdministration {
    @Description("ReBQ Retrieve details about any aspect of Maintenance and Access Administration")
    RetrieveMaintenanceandAccessAdministrationResponse retrieveMaintenanceandAccessAdministration(RetrieveMaintenanceandAccessAdministrationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Maintenance and Access Administration")
    RequestMaintenanceandAccessAdministrationResponse requestMaintenanceandAccessAdministration(RequestMaintenanceandAccessAdministrationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Maintenance and Access Administration")
    UpdateMaintenanceandAccessAdministrationResponse updateMaintenanceandAccessAdministration(UpdateMaintenanceandAccessAdministrationRequest req);
}