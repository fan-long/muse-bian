package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateLienRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String lienid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Lien lien;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }

    public void setLien(org.museframework.bian.mortgageloan.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Lien getLien() {
        return lien;
    }
}