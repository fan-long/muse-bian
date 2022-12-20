package org.museframework.bian.orderallocation.dto;

public class InitiateUpdate_PartiallyCompleted_MarketOrderWorkstepRequest {
    private String orderallocationid;

    private String update_partiallycompleted_marketorderworkstepid;

    private org.museframework.bian.orderallocation.dto.bq.Update_PartiallyCompleted_MarketOrderWorkstep update_PartiallyCompleted_MarketOrderWorkstep;

    public void setOrderallocationid(String orderallocationid) {
        this.orderallocationid = orderallocationid;
    }

    public String getOrderallocationid() {
        return orderallocationid;
    }

    public void setUpdate_partiallycompleted_marketorderworkstepid(String update_partiallycompleted_marketorderworkstepid) {
        this.update_partiallycompleted_marketorderworkstepid = update_partiallycompleted_marketorderworkstepid;
    }

    public String getUpdate_partiallycompleted_marketorderworkstepid() {
        return update_partiallycompleted_marketorderworkstepid;
    }

    public void setUpdate_PartiallyCompleted_MarketOrderWorkstep(org.museframework.bian.orderallocation.dto.bq.Update_PartiallyCompleted_MarketOrderWorkstep update_PartiallyCompleted_MarketOrderWorkstep) {
        this.update_PartiallyCompleted_MarketOrderWorkstep = update_PartiallyCompleted_MarketOrderWorkstep;
    }

    public org.museframework.bian.orderallocation.dto.bq.Update_PartiallyCompleted_MarketOrderWorkstep getUpdate_PartiallyCompleted_MarketOrderWorkstep() {
        return update_PartiallyCompleted_MarketOrderWorkstep;
    }
}