package org.museframework.bian.corporatelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAdministerRequest {
    @MetaField
    private String corporateleaseid;

    @MetaField
    private String administerid;

    public void setCorporateleaseid(String corporateleaseid) {
        this.corporateleaseid = corporateleaseid;
    }

    public String getCorporateleaseid() {
        return corporateleaseid;
    }

    public void setAdministerid(String administerid) {
        this.administerid = administerid;
    }

    public String getAdministerid() {
        return administerid;
    }
}