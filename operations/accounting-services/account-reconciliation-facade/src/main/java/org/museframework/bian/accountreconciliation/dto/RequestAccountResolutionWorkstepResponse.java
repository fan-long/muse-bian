package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestAccountResolutionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep accountResolutionWorkstep;

    public void setAccountResolutionWorkstep(org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep accountResolutionWorkstep) {
        this.accountResolutionWorkstep = accountResolutionWorkstep;
    }

    public org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep getAccountResolutionWorkstep() {
        return accountResolutionWorkstep;
    }
}