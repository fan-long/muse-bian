package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveBookingRequest;
import org.museframework.bian.customeroffer.dto.RetrieveBookingResponse;
import org.museframework.bian.customeroffer.dto.UpdateBookingRequest;
import org.museframework.bian.customeroffer.dto.UpdateBookingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Booking")
public interface BqBooking {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the offer asset and liability booking")
    UpdateBookingResponse updateBooking(UpdateBookingRequest req);

    @Description("ReBQ Retrieve details about the booking")
    RetrieveBookingResponse retrieveBooking(RetrieveBookingRequest req);
}