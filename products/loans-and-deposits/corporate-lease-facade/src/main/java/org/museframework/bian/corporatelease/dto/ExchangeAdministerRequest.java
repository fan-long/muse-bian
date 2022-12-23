package org.museframework.bian.corporatelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeAdministerRequest {
    @MetaField
    private String corporateleaseid;

    @MetaField
    private String administerid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatelease.dto.bq.Administer administer;

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

    public void setAdminister(org.museframework.bian.corporatelease.dto.bq.Administer administer) {
        this.administer = administer;
    }

    public org.museframework.bian.corporatelease.dto.bq.Administer getAdminister() {
        return administer;
    }
}