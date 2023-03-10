package org.museframework.bian.publicoffering;

import org.museframework.bian.publicoffering.dto.ExchangePublicPlacementInstrumentSpecificationFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.ExchangePublicPlacementInstrumentSpecificationFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.ExecutePublicPlacementInstrumentSpecificationFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.ExecutePublicPlacementInstrumentSpecificationFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.InitiatePublicPlacementInstrumentSpecificationFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.InitiatePublicPlacementInstrumentSpecificationFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.NotifyPublicPlacementInstrumentSpecificationFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.NotifyPublicPlacementInstrumentSpecificationFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.RequestPublicPlacementInstrumentSpecificationFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.RequestPublicPlacementInstrumentSpecificationFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.RetrievePublicPlacementInstrumentSpecificationFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.RetrievePublicPlacementInstrumentSpecificationFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.UpdatePublicPlacementInstrumentSpecificationFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.UpdatePublicPlacementInstrumentSpecificationFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment")
@GenericDomain(name="PublicOffering", group="PublicPlacementInstrumentSpecificationFulfillment")
public interface BqPublicPlacementInstrumentSpecificationFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Public Placement Instrument Specification Fulfillment")
    ExchangePublicPlacementInstrumentSpecificationFulfillmentResponse exchangePublicPlacementInstrumentSpecificationFulfillment(ExchangePublicPlacementInstrumentSpecificationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Public Placement Instrument Specification Fulfillment")
    ExecutePublicPlacementInstrumentSpecificationFulfillmentResponse executePublicPlacementInstrumentSpecificationFulfillment(ExecutePublicPlacementInstrumentSpecificationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Public Placement Instrument Specification Fulfillment")
    InitiatePublicPlacementInstrumentSpecificationFulfillmentResponse initiatePublicPlacementInstrumentSpecificationFulfillment(InitiatePublicPlacementInstrumentSpecificationFulfillmentRequest req);

    @Description("Notify Public Placement Instrument Specification Fulfillment")
    NotifyPublicPlacementInstrumentSpecificationFulfillmentResponse notifyPublicPlacementInstrumentSpecificationFulfillment(NotifyPublicPlacementInstrumentSpecificationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Public Placement Instrument Specification Fulfillment")
    RequestPublicPlacementInstrumentSpecificationFulfillmentResponse requestPublicPlacementInstrumentSpecificationFulfillment(RequestPublicPlacementInstrumentSpecificationFulfillmentRequest req);

    @Description("Retrieve Public Placement Instrument Specification Fulfillment")
    RetrievePublicPlacementInstrumentSpecificationFulfillmentResponse retrievePublicPlacementInstrumentSpecificationFulfillment(RetrievePublicPlacementInstrumentSpecificationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Public Placement Instrument Specification Fulfillment")
    UpdatePublicPlacementInstrumentSpecificationFulfillmentResponse updatePublicPlacementInstrumentSpecificationFulfillment(UpdatePublicPlacementInstrumentSpecificationFulfillmentRequest req);
}