package org.museframework.bian.stolenandrep.dto;

public class NotifyRepoTransactionCashTransferTaskRequest {
    private String stocklendingandreposid;

    private String repotransactioncashtransfertaskid;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepotransactioncashtransfertaskid(String repotransactioncashtransfertaskid) {
        this.repotransactioncashtransfertaskid = repotransactioncashtransfertaskid;
    }

    public String getRepotransactioncashtransfertaskid() {
        return repotransactioncashtransfertaskid;
    }
}