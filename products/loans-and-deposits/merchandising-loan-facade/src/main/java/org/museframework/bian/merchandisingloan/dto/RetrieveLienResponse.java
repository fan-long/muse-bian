package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLienResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Lien lien;

    public void setLien(org.museframework.bian.merchandisingloan.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Lien getLien() {
        return lien;
    }
}