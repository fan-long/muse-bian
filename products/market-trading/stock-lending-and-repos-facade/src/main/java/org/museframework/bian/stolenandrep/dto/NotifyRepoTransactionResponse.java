package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyRepoTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction;

    public void setRepoTransaction(org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction) {
        this.repoTransaction = repoTransaction;
    }

    public org.museframework.bian.stolenandrep.dto.cr.RepoTransaction getRepoTransaction() {
        return repoTransaction;
    }
}