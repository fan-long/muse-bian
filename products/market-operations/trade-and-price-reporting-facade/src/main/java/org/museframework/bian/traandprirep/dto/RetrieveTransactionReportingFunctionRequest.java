package org.museframework.bian.traandprirep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionReportingFunctionRequest {
    @MetaField
    private String tradeandpricereportingid;

    @MetaField
    private String transactionreportingfunctionid;

    public void setTradeandpricereportingid(String tradeandpricereportingid) {
        this.tradeandpricereportingid = tradeandpricereportingid;
    }

    public String getTradeandpricereportingid() {
        return tradeandpricereportingid;
    }

    public void setTransactionreportingfunctionid(String transactionreportingfunctionid) {
        this.transactionreportingfunctionid = transactionreportingfunctionid;
    }

    public String getTransactionreportingfunctionid() {
        return transactionreportingfunctionid;
    }
}