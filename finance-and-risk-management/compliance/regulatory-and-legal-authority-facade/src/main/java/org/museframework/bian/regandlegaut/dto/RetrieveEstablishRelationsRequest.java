package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEstablishRelationsRequest {
    @MetaField
    private String regulatoryandlegalauthorityid;

    @MetaField
    private String establishrelationsid;

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
}