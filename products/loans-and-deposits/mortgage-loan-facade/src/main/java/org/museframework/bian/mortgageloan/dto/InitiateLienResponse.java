package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateLienResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Lien lien;

    public void setLien(org.museframework.bian.mortgageloan.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Lien getLien() {
        return lien;
    }
}