package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeLienResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Lien lien;

    public void setLien(org.museframework.bian.leasing.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.leasing.dto.bq.Lien getLien() {
        return lien;
    }
}