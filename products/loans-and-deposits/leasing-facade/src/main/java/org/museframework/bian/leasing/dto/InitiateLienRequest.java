package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateLienRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String lienid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Lien lien;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }

    public void setLien(org.museframework.bian.leasing.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.leasing.dto.bq.Lien getLien() {
        return lien;
    }
}