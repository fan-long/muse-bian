package org.museframework.bian.servicedirectory;

import org.museframework.bian.servicedirectory.dto.ExecuteRelationshipServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.ExecuteRelationshipServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.NotifyRelationshipServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.NotifyRelationshipServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RegisterRelationshipServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RegisterRelationshipServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RequestRelationshipServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RequestRelationshipServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RetrieveRelationshipServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RetrieveRelationshipServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.UpdateRelationshipServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.UpdateRelationshipServicingPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties")
@GenericDomain(name="ServiceDirectory", group="RelationshipServicingProperties")
public interface BqRelationshipServicingProperties {
    @GenericDtxEndpoint
    @Description("Execute Relationship Servicing Properties")
    ExecuteRelationshipServicingPropertiesResponse executeRelationshipServicingProperties(ExecuteRelationshipServicingPropertiesRequest req);

    @Description("Notify Relationship Servicing Properties")
    NotifyRelationshipServicingPropertiesResponse notifyRelationshipServicingProperties(NotifyRelationshipServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Relationship Servicing Properties")
    RegisterRelationshipServicingPropertiesResponse registerRelationshipServicingProperties(RegisterRelationshipServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Relationship Servicing Properties")
    RequestRelationshipServicingPropertiesResponse requestRelationshipServicingProperties(RequestRelationshipServicingPropertiesRequest req);

    @Description("Retrieve Relationship Servicing Properties")
    RetrieveRelationshipServicingPropertiesResponse retrieveRelationshipServicingProperties(RetrieveRelationshipServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Relationship Servicing Properties")
    UpdateRelationshipServicingPropertiesResponse updateRelationshipServicingProperties(UpdateRelationshipServicingPropertiesRequest req);
}