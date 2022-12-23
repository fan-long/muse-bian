package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyRepoTransactionCashTransferTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.stolenandrep.dto.bq.RepoTransactionCashTransferTask repoTransactionCashTransferTask;

    public void setRepoTransactionCashTransferTask(org.museframework.bian.stolenandrep.dto.bq.RepoTransactionCashTransferTask repoTransactionCashTransferTask) {
        this.repoTransactionCashTransferTask = repoTransactionCashTransferTask;
    }

    public org.museframework.bian.stolenandrep.dto.bq.RepoTransactionCashTransferTask getRepoTransactionCashTransferTask() {
        return repoTransactionCashTransferTask;
    }
}