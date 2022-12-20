package org.museframework.bian.customerposition.dto;

public class UpdateCustomerPositionStateResponse {
    private org.museframework.bian.customerposition.dto.cr.CustomerPositionState customerPositionState;

    public void setCustomerPositionState(org.museframework.bian.customerposition.dto.cr.CustomerPositionState customerPositionState) {
        this.customerPositionState = customerPositionState;
    }

    public org.museframework.bian.customerposition.dto.cr.CustomerPositionState getCustomerPositionState() {
        return customerPositionState;
    }
}