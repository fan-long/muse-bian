package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestOptionInstrumentpropertyRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField
    private String optioninstrumentpropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty optionInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setOptioninstrumentpropertyid(String optioninstrumentpropertyid) {
        this.optioninstrumentpropertyid = optioninstrumentpropertyid;
    }

    public String getOptioninstrumentpropertyid() {
        return optioninstrumentpropertyid;
    }

    public void setOptionInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty optionInstrumentproperty) {
        this.optionInstrumentproperty = optionInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty getOptionInstrumentproperty() {
        return optionInstrumentproperty;
    }
}