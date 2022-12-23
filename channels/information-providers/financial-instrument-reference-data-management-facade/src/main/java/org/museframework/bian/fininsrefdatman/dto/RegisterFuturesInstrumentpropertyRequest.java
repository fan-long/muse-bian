package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterFuturesInstrumentpropertyRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField
    private String futuresinstrumentpropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty futuresInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setFuturesinstrumentpropertyid(String futuresinstrumentpropertyid) {
        this.futuresinstrumentpropertyid = futuresinstrumentpropertyid;
    }

    public String getFuturesinstrumentpropertyid() {
        return futuresinstrumentpropertyid;
    }

    public void setFuturesInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty futuresInstrumentproperty) {
        this.futuresInstrumentproperty = futuresInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty getFuturesInstrumentproperty() {
        return futuresInstrumentproperty;
    }
}