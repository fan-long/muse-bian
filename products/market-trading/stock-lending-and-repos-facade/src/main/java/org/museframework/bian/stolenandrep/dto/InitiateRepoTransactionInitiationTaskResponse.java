package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateRepoTransactionInitiationTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.stolenandrep.dto.bq.RepoTransactionInitiationTask repoTransactionInitiationTask;

    public void setRepoTransactionInitiationTask(org.museframework.bian.stolenandrep.dto.bq.RepoTransactionInitiationTask repoTransactionInitiationTask) {
        this.repoTransactionInitiationTask = repoTransactionInitiationTask;
    }

    public org.museframework.bian.stolenandrep.dto.bq.RepoTransactionInitiationTask getRepoTransactionInitiationTask() {
        return repoTransactionInitiationTask;
    }
}