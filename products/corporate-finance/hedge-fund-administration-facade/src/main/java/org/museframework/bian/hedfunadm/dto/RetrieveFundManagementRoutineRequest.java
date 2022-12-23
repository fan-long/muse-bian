package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFundManagementRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundmanagementroutineid;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundmanagementroutineid(String fundmanagementroutineid) {
        this.fundmanagementroutineid = fundmanagementroutineid;
    }

    public String getFundmanagementroutineid() {
        return fundmanagementroutineid;
    }
}