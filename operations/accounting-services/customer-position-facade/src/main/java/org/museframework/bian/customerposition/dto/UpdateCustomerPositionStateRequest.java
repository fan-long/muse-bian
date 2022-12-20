package org.museframework.bian.customerposition.dto;

public class UpdateCustomerPositionStateRequest {
    private String customerpositionid;

    private org.museframework.bian.customerposition.dto.cr.CustomerPositionState customerPositionState;

    public void setCustomerpositionid(String customerpositionid) {
        this.customerpositionid = customerpositionid;
    }

    public String getCustomerpositionid() {
        return customerpositionid;
    }

    public void setCustomerPositionState(org.museframework.bian.customerposition.dto.cr.CustomerPositionState customerPositionState) {
        this.customerPositionState = customerPositionState;
    }

    public org.museframework.bian.customerposition.dto.cr.CustomerPositionState getCustomerPositionState() {
        return customerPositionState;
    }
}