package org.museframework.bian.orderallocation.dto;

public class InitiateApplyOrderAllocationRulesWorkstepRequest {
    private String orderallocationid;

    private String applyorderallocationrulesworkstepid;

    private org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep applyOrderAllocationRulesWorkstep;

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

    public void setApplyOrderAllocationRulesWorkstep(org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep applyOrderAllocationRulesWorkstep) {
        this.applyOrderAllocationRulesWorkstep = applyOrderAllocationRulesWorkstep;
    }

    public org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep getApplyOrderAllocationRulesWorkstep() {
        return applyOrderAllocationRulesWorkstep;
    }
}