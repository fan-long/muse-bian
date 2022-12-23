package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterWarrantInstrumentpropertyRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField
    private String warrantinstrumentpropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty warrantInstrumentproperty;

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

    public void setWarrantInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty warrantInstrumentproperty) {
        this.warrantInstrumentproperty = warrantInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty getWarrantInstrumentproperty() {
        return warrantInstrumentproperty;
    }
}