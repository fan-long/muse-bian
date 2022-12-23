package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAccountRecoveryProcedureRequest {
    @MetaField
    private String accountrecoveryid;

    @MetaField(ref=true)
    private org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setAccountRecoveryProcedure(org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure) {
        this.accountRecoveryProcedure = accountRecoveryProcedure;
    }

    public org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure getAccountRecoveryProcedure() {
        return accountRecoveryProcedure;
    }
}