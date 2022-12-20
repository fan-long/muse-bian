package org.museframework.bian.stolenandrep.dto;

public class NotifyRepoTransactionInitiationTaskRequest {
    private String stocklendingandreposid;

    private String repotransactioninitiationtaskid;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepotransactioninitiationtaskid(String repotransactioninitiationtaskid) {
        this.repotransactioninitiationtaskid = repotransactioninitiationtaskid;
    }

    public String getRepotransactioninitiationtaskid() {
        return repotransactioninitiationtaskid;
    }
}