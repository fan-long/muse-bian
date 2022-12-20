package org.museframework.bian.stolenandrep.dto;

public class ExecuteRepoTransactionCashTransferTaskRequest {
    private String stocklendingandreposid;

    private String repotransactioncashtransfertaskid;

    private org.museframework.bian.stolenandrep.dto.bq.RepoTransactionCashTransferTask repoTransactionCashTransferTask;

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

    public void setRepoTransactionCashTransferTask(org.museframework.bian.stolenandrep.dto.bq.RepoTransactionCashTransferTask repoTransactionCashTransferTask) {
        this.repoTransactionCashTransferTask = repoTransactionCashTransferTask;
    }

    public org.museframework.bian.stolenandrep.dto.bq.RepoTransactionCashTransferTask getRepoTransactionCashTransferTask() {
        return repoTransactionCashTransferTask;
    }
}