package org.museframework.bian.orderallocation.dto;

public class RetrieveApplyOrderAllocationRulesWorkstepRequest {
    private String orderallocationid;

    private String applyorderallocationrulesworkstepid;

    public void setOrderallocationid(String orderallocationid) {
        this.orderallocationid = orderallocationid;
    }

    public String getOrderallocationid() {
        return orderallocationid;
    }

    public void setApplyorderallocationrulesworkstepid(String applyorderallocationrulesworkstepid) {
        this.applyorderallocationrulesworkstepid = applyorderallocationrulesworkstepid;
    }

    public String getApplyorderallocationrulesworkstepid() {
        return applyorderallocationrulesworkstepid;
    }
}