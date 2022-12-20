package org.museframework.bian.trustservices;

import org.museframework.bian.trustservices.dto.ExchangeTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExchangeTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.trustservices.dto.ExecuteTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExecuteTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.trustservices.dto.InitiateTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.trustservices.dto.InitiateTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.trustservices.dto.NotifyTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.trustservices.dto.NotifyTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RequestTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RequestTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RetrieveTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RetrieveTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.bian.trustservices.dto.UpdateTrustAssetMaintenanceandManagementFulfillmentRequest;
import org.museframework.bian.trustservices.dto.UpdateTrustAssetMaintenanceandManagementFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment")
@GenericDomain(name="TrustServices", group="TrustAssetMaintenanceandManagementFulfillment")
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