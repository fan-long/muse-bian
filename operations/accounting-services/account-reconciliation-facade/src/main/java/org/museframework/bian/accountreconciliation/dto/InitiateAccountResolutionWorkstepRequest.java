package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateAccountResolutionWorkstepRequest {
    @MetaField
    private String accountreconciliationid;

    @MetaField
    private String accountresolutionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep accountResolutionWorkstep;

    public void setAccountreconciliationid(String accountreconciliationid) {
        this.accountreconciliationid = accountreconciliationid;
    }

    public String getAccountreconciliationid() {
        return accountreconciliationid;
    }

    public void setAccountresolutionworkstepid(String accountresolutionworkstepid) {
        this.accountresolutionworkstepid = accountresolutionworkstepid;
    }

    public String getAccountresolutionworkstepid() {
        return accountresolutionworkstepid;
    }

    public void setAccountResolutionWorkstep(org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep accountResolutionWorkstep) {
        this.accountResolutionWorkstep = accountResolutionWorkstep;
    }

    public org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep getAccountResolutionWorkstep() {
        return accountResolutionWorkstep;
    }
}