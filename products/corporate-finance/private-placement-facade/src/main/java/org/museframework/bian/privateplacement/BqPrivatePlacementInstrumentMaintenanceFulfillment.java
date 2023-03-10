package org.museframework.bian.privateplacement;

import org.museframework.bian.privateplacement.dto.ExchangePrivatePlacementInstrumentMaintenanceFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.ExchangePrivatePlacementInstrumentMaintenanceFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.ExecutePrivatePlacementInstrumentMaintenanceFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.ExecutePrivatePlacementInstrumentMaintenanceFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.InitiatePrivatePlacementInstrumentMaintenanceFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.InitiatePrivatePlacementInstrumentMaintenanceFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.NotifyPrivatePlacementInstrumentMaintenanceFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.NotifyPrivatePlacementInstrumentMaintenanceFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.RequestPrivatePlacementInstrumentMaintenanceFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.RequestPrivatePlacementInstrumentMaintenanceFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.RetrievePrivatePlacementInstrumentMaintenanceFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.RetrievePrivatePlacementInstrumentMaintenanceFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.UpdatePrivatePlacementInstrumentMaintenanceFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.UpdatePrivatePlacementInstrumentMaintenanceFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Private Placement Fulfillment arrangement within the Private Placement Fulfillment")
@GenericDomain(name="PrivatePlacement", group="PrivatePlacementInstrumentMaintenanceFulfillment")
public interface BqPrivatePlacementInstrumentMaintenanceFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Private Placement Instrument Maintenance Fulfillment")
    ExchangePrivatePlacementInstrumentMaintenanceFulfillmentResponse exchangePrivatePlacementInstrumentMaintenanceFulfillment(ExchangePrivatePlacementInstrumentMaintenanceFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Private Placement Instrument Maintenance Fulfillment")
    ExecutePrivatePlacementInstrumentMaintenanceFulfillmentResponse executePrivatePlacementInstrumentMaintenanceFulfillment(ExecutePrivatePlacementInstrumentMaintenanceFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Private Placement Instrument Maintenance Fulfillment")
    InitiatePrivatePlacementInstrumentMaintenanceFulfillmentResponse initiatePrivatePlacementInstrumentMaintenanceFulfillment(InitiatePrivatePlacementInstrumentMaintenanceFulfillmentRequest req);

    @Description("Notify Private Placement Instrument Maintenance Fulfillment")
    NotifyPrivatePlacementInstrumentMaintenanceFulfillmentResponse notifyPrivatePlacementInstrumentMaintenanceFulfillment(NotifyPrivatePlacementInstrumentMaintenanceFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Private Placement Instrument Maintenance Fulfillment")
    RequestPrivatePlacementInstrumentMaintenanceFulfillmentResponse requestPrivatePlacementInstrumentMaintenanceFulfillment(RequestPrivatePlacementInstrumentMaintenanceFulfillmentRequest req);

    @Description("Retrieve Private Placement Instrument Maintenance Fulfillment")
    RetrievePrivatePlacementInstrumentMaintenanceFulfillmentResponse retrievePrivatePlacementInstrumentMaintenanceFulfillment(RetrievePrivatePlacementInstrumentMaintenanceFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Private Placement Instrument Maintenance Fulfillment")
    UpdatePrivatePlacementInstrumentMaintenanceFulfillmentResponse updatePrivatePlacementInstrumentMaintenanceFulfillment(UpdatePrivatePlacementInstrumentMaintenanceFulfillmentRequest req);
}