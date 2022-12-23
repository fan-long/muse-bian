package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateResolutionRequest {
    @MetaField
    private String accountsreceivableid;

    @MetaField
    private String resolutionid;

    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }

    public void setResolution(org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.Resolution getResolution() {
        return resolution;
    }
}