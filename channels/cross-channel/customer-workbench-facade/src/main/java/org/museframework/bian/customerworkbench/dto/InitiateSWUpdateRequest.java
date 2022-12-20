package org.museframework.bian.customerworkbench.dto;

public class InitiateSWUpdateRequest {
    private String customerworkbenchid;

    private String swupdateid;

    private org.museframework.bian.customerworkbench.dto.bq.SWUpdate sWUpdate;

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

    public void setsWUpdate(org.museframework.bian.customerworkbench.dto.bq.SWUpdate sWUpdate) {
        this.sWUpdate = sWUpdate;
    }

    public org.museframework.bian.customerworkbench.dto.bq.SWUpdate getsWUpdate() {
        return sWUpdate;
    }
}