package org.museframework.bian.servicedirectory;

import org.museframework.bian.servicedirectory.dto.ExecuteServiceDeliveryServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.ExecuteServiceDeliveryServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.NotifyServiceDeliveryServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.NotifyServiceDeliveryServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RegisterServiceDeliveryServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RegisterServiceDeliveryServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RequestServiceDeliveryServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RequestServiceDeliveryServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RetrieveServiceDeliveryServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RetrieveServiceDeliveryServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.UpdateServiceDeliveryServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.UpdateServiceDeliveryServicingPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties")
@GenericDomain(name="ServiceDirectory", group="ServiceDeliveryServicingProperties")
public interface BqServiceDeliveryServicingProperties {
    @GenericDtxEndpoint
    @Description("Execute Service Delivery Servicing Properties")
    ExecuteServiceDeliveryServicingPropertiesResponse executeServiceDeliveryServicingProperties(ExecuteServiceDeliveryServicingPropertiesRequest req);

    @Description("Notify Service Delivery Servicing Properties")
    NotifyServiceDeliveryServicingPropertiesResponse notifyServiceDeliveryServicingProperties(NotifyServiceDeliveryServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Service Delivery Servicing Properties")
    RegisterServiceDeliveryServicingPropertiesResponse registerServiceDeliveryServicingProperties(RegisterServiceDeliveryServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Service Delivery Servicing Properties")
    RequestServiceDeliveryServicingPropertiesResponse requestServiceDeliveryServicingProperties(RequestServiceDeliveryServicingPropertiesRequest req);

    @Description("Retrieve Service Delivery Servicing Properties")
    RetrieveServiceDeliveryServicingPropertiesResponse retrieveServiceDeliveryServicingProperties(RetrieveServiceDeliveryServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Service Delivery Servicing Properties")
    UpdateServiceDeliveryServicingPropertiesResponse updateServiceDeliveryServicingProperties(UpdateServiceDeliveryServicingPropertiesRequest req);
}