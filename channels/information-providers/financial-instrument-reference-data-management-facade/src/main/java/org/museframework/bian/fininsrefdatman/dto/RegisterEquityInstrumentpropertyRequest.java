package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterEquityInstrumentpropertyRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField
    private String equityinstrumentpropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty equityInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setEquityinstrumentpropertyid(String equityinstrumentpropertyid) {
        this.equityinstrumentpropertyid = equityinstrumentpropertyid;
    }

    public String getEquityinstrumentpropertyid() {
        return equityinstrumentpropertyid;
    }

    public void setEquityInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty equityInstrumentproperty) {
        this.equityInstrumentproperty = equityInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty getEquityInstrumentproperty() {
        return equityInstrumentproperty;
    }
}