package org.museframework.bian.servicedirectory;

import org.museframework.bian.servicedirectory.dto.ExecuteSalesServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.ExecuteSalesServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.NotifySalesServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.NotifySalesServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RegisterSalesServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RegisterSalesServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RequestSalesServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RequestSalesServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RetrieveSalesServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RetrieveSalesServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.UpdateSalesServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.UpdateSalesServicingPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties")
@GenericDomain(name="ServiceDirectory", group="SalesServicingProperties")
public interface BqSalesServicingProperties {
    @GenericDtxEndpoint
    @Description("Execute Sales Servicing Properties")
    ExecuteSalesServicingPropertiesResponse executeSalesServicingProperties(ExecuteSalesServicingPropertiesRequest req);

    @Description("Notify Sales Servicing Properties")
    NotifySalesServicingPropertiesResponse notifySalesServicingProperties(NotifySalesServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Sales Servicing Properties")
    RegisterSalesServicingPropertiesResponse registerSalesServicingProperties(RegisterSalesServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Sales Servicing Properties")
    RequestSalesServicingPropertiesResponse requestSalesServicingProperties(RequestSalesServicingPropertiesRequest req);

    @Description("Retrieve Sales Servicing Properties")
    RetrieveSalesServicingPropertiesResponse retrieveSalesServicingProperties(RetrieveSalesServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Sales Servicing Properties")
    UpdateSalesServicingPropertiesResponse updateSalesServicingProperties(UpdateSalesServicingPropertiesRequest req);
}