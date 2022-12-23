package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureAssuranceRequest {
    @MetaField
    private String systemsadministrationid;

    @MetaField
    private String assuranceid;

    @MetaField(ref=true)
    private org.museframework.bian.systemsadministration.dto.bq.Assurance assurance;

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

    public void setAssurance(org.museframework.bian.systemsadministration.dto.bq.Assurance assurance) {
        this.assurance = assurance;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Assurance getAssurance() {
        return assurance;
    }
}