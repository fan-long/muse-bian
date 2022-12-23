package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateRepoTransactionCashTransferTaskRequest {
    @MetaField
    private String stocklendingandreposid;

    @MetaField
    private String repotransactioncashtransfertaskid;

    @MetaField(ref=true)
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