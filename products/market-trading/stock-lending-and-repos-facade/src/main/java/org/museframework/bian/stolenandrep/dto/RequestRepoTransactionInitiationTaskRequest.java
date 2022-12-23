package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRepoTransactionInitiationTaskRequest {
    @MetaField
    private String stocklendingandreposid;

    @MetaField
    private String repotransactioninitiationtaskid;

    @MetaField(ref=true)
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