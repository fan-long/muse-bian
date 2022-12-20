package org.museframework.bian.customeroffer.dto;

public class RetrieveBookingRequest {
    private String customerofferid;

    private String bookingid;

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
}