package org.museframework.bian.customerworkbench.dto;

public class RetrieveSWUpdateRequest {
    private String customerworkbenchid;

    private String swupdateid;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setSwupdateid(String swupdateid) {
        this.swupdateid = swupdateid;
    }

    public String getSwupdateid() {
        return swupdateid;
    }
}