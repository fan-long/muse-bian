package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePlanningRequest {
    @MetaField
    private String accountrecoveryid;

    @MetaField
    private String planningid;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setPlanningid(String planningid) {
        this.planningid = planningid;
    }

    public String getPlanningid() {
        return planningid;
    }
}