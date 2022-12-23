package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateAccountRecoveryProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure;

    public void setAccountRecoveryProcedure(org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure) {
        this.accountRecoveryProcedure = accountRecoveryProcedure;
    }

    public org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure getAccountRecoveryProcedure() {
        return accountRecoveryProcedure;
    }
}