package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteDebtInstrumentpropertyRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField
    private String debtinstrumentpropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty debtInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setDebtinstrumentpropertyid(String debtinstrumentpropertyid) {
        this.debtinstrumentpropertyid = debtinstrumentpropertyid;
    }

    public String getDebtinstrumentpropertyid() {
        return debtinstrumentpropertyid;
    }

    public void setDebtInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty debtInstrumentproperty) {
        this.debtInstrumentproperty = debtInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty getDebtInstrumentproperty() {
        return debtInstrumentproperty;
    }
}