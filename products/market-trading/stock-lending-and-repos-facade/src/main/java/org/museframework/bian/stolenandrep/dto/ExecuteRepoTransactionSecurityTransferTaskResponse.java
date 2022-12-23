package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteRepoTransactionSecurityTransferTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.stolenandrep.dto.bq.RepoTransactionSecurityTransferTask repoTransactionSecurityTransferTask;

    public void setRepoTransactionSecurityTransferTask(org.museframework.bian.stolenandrep.dto.bq.RepoTransactionSecurityTransferTask repoTransactionSecurityTransferTask) {
        this.repoTransactionSecurityTransferTask = repoTransactionSecurityTransferTask;
    }

    public org.museframework.bian.stolenandrep.dto.bq.RepoTransactionSecurityTransferTask getRepoTransactionSecurityTransferTask() {
        return repoTransactionSecurityTransferTask;
    }
}