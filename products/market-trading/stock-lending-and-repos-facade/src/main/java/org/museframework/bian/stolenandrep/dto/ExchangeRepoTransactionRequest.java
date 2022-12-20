package org.museframework.bian.stolenandrep.dto;

public class ExchangeRepoTransactionRequest {
    private String stocklendingandreposid;

    private org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepoTransaction(org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction) {
        this.repoTransaction = repoTransaction;
    }

    public org.museframework.bian.stolenandrep.dto.cr.RepoTransaction getRepoTransaction() {
        return repoTransaction;
    }
}