package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateBankRelationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.BankRelations bankRelations;

    public void setBankRelations(org.museframework.bian.parrefdatdir.dto.bq.BankRelations bankRelations) {
        this.bankRelations = bankRelations;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.BankRelations getBankRelations() {
        return bankRelations;
    }
}