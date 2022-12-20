package org.museframework.bian.crecarposkee;

import org.museframework.bian.crecarposkee.dto.CaptureCardTransactionEventRequest;
import org.museframework.bian.crecarposkee.dto.CaptureCardTransactionEventResponse;
import org.museframework.bian.crecarposkee.dto.NotifyCardTransactionEventRequest;
import org.museframework.bian.crecarposkee.dto.NotifyCardTransactionEventResponse;
import org.museframework.bian.crecarposkee.dto.RetrieveCardTransactionEventRequest;
import org.museframework.bian.crecarposkee.dto.RetrieveCardTransactionEventResponse;
import org.museframework.bian.crecarposkee.dto.UpdateCardTransactionEventRequest;
import org.museframework.bian.crecarposkee.dto.UpdateCardTransactionEventResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Card Transaction Event is one of the specific types of events that is recorded in the Card Transaction Event")
@GenericDomain(name="CreditCardPositionKeeping", group="CardTransactionEvent")
public interface BqCardTransactionEvent {
    @GenericDtxEndpoint
    @Description("Capture Card Transaction Event")
    CaptureCardTransactionEventResponse captureCardTransactionEvent(CaptureCardTransactionEventRequest req);

    @Description("Notify Card Transaction Event")
    NotifyCardTransactionEventResponse notifyCardTransactionEvent(NotifyCardTransactionEventRequest req);

    @Description("Retrieve Card Transaction Event")
    RetrieveCardTransactionEventResponse retrieveCardTransactionEvent(RetrieveCardTransactionEventRequest req);

    @GenericDtxEndpoint
    @Description("Update Card Transaction Event")
    UpdateCardTransactionEventResponse updateCardTransactionEvent(UpdateCardTransactionEventRequest req);
}