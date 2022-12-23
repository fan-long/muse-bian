package org.museframework.bian.leaiteadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssuranceRequest {
    @MetaField
    private String leasingitemadministrationid;

    @MetaField
    private String assuranceid;

    @MetaField(ref=true)
    private org.museframework.bian.leaiteadm.dto.bq.Assurance assurance;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setAssuranceid(String assuranceid) {
        this.assuranceid = assuranceid;
    }

    public String getAssuranceid() {
        return assuranceid;
    }

    public void setAssurance(org.museframework.bian.leaiteadm.dto.bq.Assurance assurance) {
        this.assurance = assurance;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Assurance getAssurance() {
        return assurance;
    }
}