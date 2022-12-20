package org.museframework.bian.servicedirectory;

import org.museframework.bian.servicedirectory.dto.ExecuteAccessControlServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.ExecuteAccessControlServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.NotifyAccessControlServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.NotifyAccessControlServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RegisterAccessControlServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RegisterAccessControlServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RequestAccessControlServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RequestAccessControlServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RetrieveAccessControlServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RetrieveAccessControlServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.UpdateAccessControlServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.UpdateAccessControlServicingPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties")
@GenericDomain(name="ServiceDirectory", group="AccessControlServicingProperties")
public interface BqAccessControlServicingProperties {
    @GenericDtxEndpoint
    @Description("Execute Access Control Servicing Properties")
    ExecuteAccessControlServicingPropertiesResponse executeAccessControlServicingProperties(ExecuteAccessControlServicingPropertiesRequest req);

    @Description("Notify Access Control Servicing Properties")
    NotifyAccessControlServicingPropertiesResponse notifyAccessControlServicingProperties(NotifyAccessControlServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Access Control Servicing Properties")
    RegisterAccessControlServicingPropertiesResponse registerAccessControlServicingProperties(RegisterAccessControlServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Access Control Servicing Properties")
    RequestAccessControlServicingPropertiesResponse requestAccessControlServicingProperties(RequestAccessControlServicingPropertiesRequest req);

    @Description("Retrieve Access Control Servicing Properties")
    RetrieveAccessControlServicingPropertiesResponse retrieveAccessControlServicingProperties(RetrieveAccessControlServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Access Control Servicing Properties")
    UpdateAccessControlServicingPropertiesResponse updateAccessControlServicingProperties(UpdateAccessControlServicingPropertiesRequest req);
}