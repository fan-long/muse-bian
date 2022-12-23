package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBookingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Booking booking;

    public void setBooking(org.museframework.bian.customeroffer.dto.bq.Booking booking) {
        this.booking = booking;
    }

    public org.museframework.bian.customeroffer.dto.bq.Booking getBooking() {
        return booking;
    }
}