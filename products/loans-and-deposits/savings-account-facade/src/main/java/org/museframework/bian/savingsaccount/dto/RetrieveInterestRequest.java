package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInterestRequest {
    @MetaField
    private String savingsaccountid;

    @MetaField
    private String interestid;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }
}