package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssuranceRequest {
    @MetaField
    private String systemsadministrationid;

    @MetaField
    private String assuranceid;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setAssuranceid(String assuranceid) {
        this.assuranceid = assuranceid;
    }

    public String getAssuranceid() {
        return assuranceid;
    }
}