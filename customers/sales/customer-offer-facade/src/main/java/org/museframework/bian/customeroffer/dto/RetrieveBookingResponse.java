package org.museframework.bian.customeroffer.dto;

public class RetrieveBookingResponse {
    private org.museframework.bian.customeroffer.dto.bq.Booking booking;

    public void setBooking(org.museframework.bian.customeroffer.dto.bq.Booking booking) {
        this.booking = booking;
    }

    public org.museframework.bian.customeroffer.dto.bq.Booking getBooking() {
        return booking;
    }
}