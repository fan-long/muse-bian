package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAccountResolutionWorkstepRequest {
    @MetaField
    private String accountreconciliationid;

    @MetaField
    private String accountresolutionworkstepid;

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
}