package org.museframework.bian.opeiteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateOpenItemProcedureRequest {
    @MetaField
    private String openitemmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure openItemProcedure;

    public void setOpenitemmanagementid(String openitemmanagementid) {
        this.openitemmanagementid = openitemmanagementid;
    }

    public String getOpenitemmanagementid() {
        return openitemmanagementid;
    }

    public void setOpenItemProcedure(org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure openItemProcedure) {
        this.openItemProcedure = openItemProcedure;
    }

    public org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure getOpenItemProcedure() {
        return openItemProcedure;
    }
}