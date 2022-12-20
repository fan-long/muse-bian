package org.museframework.bian.producttraining;

import org.museframework.bian.producttraining.dto.ExchangeServiceDeliveryRequest;
import org.museframework.bian.producttraining.dto.ExchangeServiceDeliveryResponse;
import org.museframework.bian.producttraining.dto.ExecuteServiceDeliveryRequest;
import org.museframework.bian.producttraining.dto.ExecuteServiceDeliveryResponse;
import org.museframework.bian.producttraining.dto.InitiateServiceDeliveryRequest;
import org.museframework.bian.producttraining.dto.InitiateServiceDeliveryResponse;
import org.museframework.bian.producttraining.dto.RequestServiceDeliveryRequest;
import org.museframework.bian.producttraining.dto.RequestServiceDeliveryResponse;
import org.museframework.bian.producttraining.dto.RetrieveServiceDeliveryRequest;
import org.museframework.bian.producttraining.dto.RetrieveServiceDeliveryResponse;
import org.museframework.bian.producttraining.dto.UpdateServiceDeliveryRequest;
import org.museframework.bian.producttraining.dto.UpdateServiceDeliveryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="ProductTraining", group="ServiceDelivery")
public interface BqServiceDelivery {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Service Delivery processing")
    ExchangeServiceDeliveryResponse exchangeServiceDelivery(ExchangeServiceDeliveryRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Service Delivery")
    ExecuteServiceDeliveryResponse executeServiceDelivery(ExecuteServiceDeliveryRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Service Delivery")
    InitiateServiceDeliveryResponse initiateServiceDelivery(InitiateServiceDeliveryRequest req);

    @Description("ReBQ Retrieve details about any aspect of Service Delivery")
    RetrieveServiceDeliveryResponse retrieveServiceDelivery(RetrieveServiceDeliveryRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Service Delivery")
    RequestServiceDeliveryResponse requestServiceDelivery(RequestServiceDeliveryRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Service Delivery")
    UpdateServiceDeliveryResponse updateServiceDelivery(UpdateServiceDeliveryRequest req);
}