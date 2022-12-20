package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.InitiateOrderRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateOrderResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveOrderRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveOrderResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateOrderRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateOrderResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="Order")
public interface BqOrder {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer order handling")
    InitiateOrderResponse initiateOrder(InitiateOrderRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for order handling")
    UpdateOrderResponse updateOrder(UpdateOrderRequest req);

    @Description("ReBQ Retrieve details about order handling")
    RetrieveOrderResponse retrieveOrder(RetrieveOrderRequest req);
}