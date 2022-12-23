package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateEstablishRelationsRequest {
    @MetaField
    private String regulatoryandlegalauthorityid;

    @MetaField
    private String establishrelationsid;

    @MetaField(ref=true)
    private org.museframework.bian.regandlegaut.dto.bq.EstablishRelations establishRelations;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setEstablishrelationsid(String establishrelationsid) {
        this.establishrelationsid = establishrelationsid;
    }

    public String getEstablishrelationsid() {
        return establishrelationsid;
    }

    public void setEstablishRelations(org.museframework.bian.regandlegaut.dto.bq.EstablishRelations establishRelations) {
        this.establishRelations = establishRelations;
    }

    public org.museframework.bian.regandlegaut.dto.bq.EstablishRelations getEstablishRelations() {
        return establishRelations;
    }
}