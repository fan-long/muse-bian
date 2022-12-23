package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateFinancialInstrumentRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String financialinstrumentid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument financialInstrument;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setFinancialinstrumentid(String financialinstrumentid) {
        this.financialinstrumentid = financialinstrumentid;
    }

    public String getFinancialinstrumentid() {
        return financialinstrumentid;
    }

    public void setFinancialInstrument(org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}