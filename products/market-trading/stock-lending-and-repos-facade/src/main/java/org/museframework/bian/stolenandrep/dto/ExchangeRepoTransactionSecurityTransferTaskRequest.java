package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeRepoTransactionSecurityTransferTaskRequest {
    @MetaField
    private String stocklendingandreposid;

    @MetaField
    private String repotransactionsecuritytransfertaskid;

    @MetaField(ref=true)
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