package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOptionInstrumentpropertyRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField
    private String optioninstrumentpropertyid;

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
}