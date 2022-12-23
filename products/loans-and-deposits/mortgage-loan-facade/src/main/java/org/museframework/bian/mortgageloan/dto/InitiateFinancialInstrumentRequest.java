package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateFinancialInstrumentRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String financialinstrumentid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setFinancialinstrumentid(String financialinstrumentid) {
        this.financialinstrumentid = financialinstrumentid;
    }

    public String getFinancialinstrumentid() {
        return financialinstrumentid;
    }

    public void setFinancialInstrument(org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}