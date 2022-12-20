package org.museframework.bian.stolenandrep.dto;

public class RequestRepoTransactionInitiationTaskRequest {
    private String stocklendingandreposid;

    private String repotransactioninitiationtaskid;

    private org.museframework.bian.stolenandrep.dto.bq.RepoTransactionInitiationTask repoTransactionInitiationTask;

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

    public void setRepoTransactionInitiationTask(org.museframework.bian.stolenandrep.dto.bq.RepoTransactionInitiationTask repoTransactionInitiationTask) {
        this.repoTransactionInitiationTask = repoTransactionInitiationTask;
    }

    public org.museframework.bian.stolenandrep.dto.bq.RepoTransactionInitiationTask getRepoTransactionInitiationTask() {
        return repoTransactionInitiationTask;
    }
}