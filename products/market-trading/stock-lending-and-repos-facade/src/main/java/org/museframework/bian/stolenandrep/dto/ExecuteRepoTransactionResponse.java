package org.museframework.bian.stolenandrep.dto;

public class ExecuteRepoTransactionResponse {
    private org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction;

    public void setRepoTransaction(org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction) {
        this.repoTransaction = repoTransaction;
    }

    public org.museframework.bian.stolenandrep.dto.cr.RepoTransaction getRepoTransaction() {
        return repoTransaction;
    }
}