package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBookingRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String bookingid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Booking booking;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public String getBookingid() {
        return bookingid;
    }

    public void setBooking(org.museframework.bian.customeroffer.dto.bq.Booking booking) {
        this.booking = booking;
    }

    public org.museframework.bian.customeroffer.dto.bq.Booking getBooking() {
        return booking;
    }
}