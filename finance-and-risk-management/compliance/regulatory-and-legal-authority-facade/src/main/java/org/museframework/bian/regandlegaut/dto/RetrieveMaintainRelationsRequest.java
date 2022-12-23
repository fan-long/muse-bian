package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMaintainRelationsRequest {
    @MetaField
    private String regulatoryandlegalauthorityid;

    @MetaField
    private String maintainrelationsid;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setMaintainrelationsid(String maintainrelationsid) {
        this.maintainrelationsid = maintainrelationsid;
    }

    public String getMaintainrelationsid() {
        return maintainrelationsid;
    }
}