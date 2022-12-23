package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyWarrantInstrumentpropertyRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField
    private String warrantinstrumentpropertyid;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setWarrantinstrumentpropertyid(String warrantinstrumentpropertyid) {
        this.warrantinstrumentpropertyid = warrantinstrumentpropertyid;
    }

    public String getWarrantinstrumentpropertyid() {
        return warrantinstrumentpropertyid;
    }
}