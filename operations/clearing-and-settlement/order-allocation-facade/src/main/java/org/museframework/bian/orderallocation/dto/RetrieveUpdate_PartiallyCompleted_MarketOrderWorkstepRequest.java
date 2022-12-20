package org.museframework.bian.orderallocation.dto;

public class RetrieveUpdate_PartiallyCompleted_MarketOrderWorkstepRequest {
    private String orderallocationid;

    private String update_partiallycompleted_marketorderworkstepid;

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
}