package org.museframework.bian.stolenandrep.dto;

public class ExecuteRepoTransactionSecurityTransferTaskRequest {
    private String stocklendingandreposid;

    private String repotransactionsecuritytransfertaskid;

    private org.museframework.bian.stolenandrep.dto.bq.RepoTransactionSecurityTransferTask repoTransactionSecurityTransferTask;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepotransactionsecuritytransfertaskid(String repotransactionsecuritytransfertaskid) {
        this.repotransactionsecuritytransfertaskid = repotransactionsecuritytransfertaskid;
    }

    public String getRepotransactionsecuritytransfertaskid() {
        return repotransactionsecuritytransfertaskid;
    }

    public void setRepoTransactionSecurityTransferTask(org.museframework.bian.stolenandrep.dto.bq.RepoTransactionSecurityTransferTask repoTransactionSecurityTransferTask) {
        this.repoTransactionSecurityTransferTask = repoTransactionSecurityTransferTask;
    }

    public org.museframework.bian.stolenandrep.dto.bq.RepoTransactionSecurityTransferTask getRepoTransactionSecurityTransferTask() {
        return repoTransactionSecurityTransferTask;
    }
}