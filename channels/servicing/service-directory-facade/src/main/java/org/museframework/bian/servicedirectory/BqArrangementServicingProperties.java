package org.museframework.bian.servicedirectory;

import org.museframework.bian.servicedirectory.dto.ExecuteArrangementServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.ExecuteArrangementServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.NotifyArrangementServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.NotifyArrangementServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RegisterArrangementServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RegisterArrangementServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RequestArrangementServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RequestArrangementServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RetrieveArrangementServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RetrieveArrangementServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.UpdateArrangementServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.UpdateArrangementServicingPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties")
@GenericDomain(name="ServiceDirectory", group="ArrangementServicingProperties")
public interface BqArrangementServicingProperties {
    @GenericDtxEndpoint
    @Description("Execute Arrangement Servicing Properties")
    ExecuteArrangementServicingPropertiesResponse executeArrangementServicingProperties(ExecuteArrangementServicingPropertiesRequest req);

    @Description("Notify Arrangement Servicing Properties")
    NotifyArrangementServicingPropertiesResponse notifyArrangementServicingProperties(NotifyArrangementServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Arrangement Servicing Properties")
    RegisterArrangementServicingPropertiesResponse registerArrangementServicingProperties(RegisterArrangementServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Arrangement Servicing Properties")
    RequestArrangementServicingPropertiesResponse requestArrangementServicingProperties(RequestArrangementServicingPropertiesRequest req);

    @Description("Retrieve Arrangement Servicing Properties")
    RetrieveArrangementServicingPropertiesResponse retrieveArrangementServicingProperties(RetrieveArrangementServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Arrangement Servicing Properties")
    UpdateArrangementServicingPropertiesResponse updateArrangementServicingProperties(UpdateArrangementServicingPropertiesRequest req);
}