package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ExchangeTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExchangeTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.cortruser.dto.ExecuteTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExecuteTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.cortruser.dto.InitiateTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.cortruser.dto.InitiateTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.cortruser.dto.NotifyTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.cortruser.dto.NotifyTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RequestTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RequestTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RetrieveTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RetrieveTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.cortruser.dto.UpdateTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.cortruser.dto.UpdateTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment")
@GenericDomain(name="CorporateTrustServices", group="TrustAssetMaintenanceandManagementFulfillment")
public interface BqTrustAssetMaintenanceandManagementFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Trust Asset Maintenance and Management Fulfillment")
    ExchangeTrustAssetMaintenanceandManagementFulfillmentResponse exchangeTrustAssetMaintenanceandManagementFulfillment(ExchangeTrustAssetMaintenanceandManagementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trust Asset Maintenance and Management Fulfillment")
    ExecuteTrustAssetMaintenanceandManagementFulfillmentResponse executeTrustAssetMaintenanceandManagementFulfillment(ExecuteTrustAssetMaintenanceandManagementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trust Asset Maintenance and Management Fulfillment")
    InitiateTrustAssetMaintenanceandManagementFulfillmentResponse initiateTrustAssetMaintenanceandManagementFulfillment(InitiateTrustAssetMaintenanceandManagementFulfillmentRequest req);

    @Description("Notify Trust Asset Maintenance and Management Fulfillment")
    NotifyTrustAssetMaintenanceandManagementFulfillmentResponse notifyTrustAssetMaintenanceandManagementFulfillment(NotifyTrustAssetMaintenanceandManagementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Trust Asset Maintenance and Management Fulfillment")
    RequestTrustAssetMaintenanceandManagementFulfillmentResponse requestTrustAssetMaintenanceandManagementFulfillment(RequestTrustAssetMaintenanceandManagementFulfillmentRequest req);

    @Description("Retrieve Trust Asset Maintenance and Management Fulfillment")
    RetrieveTrustAssetMaintenanceandManagementFulfillmentResponse retrieveTrustAssetMaintenanceandManagementFulfillment(RetrieveTrustAssetMaintenanceandManagementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Trust Asset Maintenance and Management Fulfillment")
    UpdateTrustAssetMaintenanceandManagementFulfillmentResponse updateTrustAssetMaintenanceandManagementFulfillment(UpdateTrustAssetMaintenanceandManagementFulfillmentRequest req);
}