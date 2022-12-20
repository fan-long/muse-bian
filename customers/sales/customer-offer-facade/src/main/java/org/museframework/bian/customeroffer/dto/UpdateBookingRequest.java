package org.museframework.bian.customeroffer.dto;

public class UpdateBookingRequest {
    private String customerofferid;

    private String bookingid;

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