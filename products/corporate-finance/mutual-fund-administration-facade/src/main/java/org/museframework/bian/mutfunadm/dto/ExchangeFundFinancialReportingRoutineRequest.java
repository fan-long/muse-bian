package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeFundFinancialReportingRoutineRequest {
    @MetaField
    private String mutualfundadministrationid;

    @MetaField
    private String fundfinancialreportingroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundfinancialreportingroutineid(String fundfinancialreportingroutineid) {
        this.fundfinancialreportingroutineid = fundfinancialreportingroutineid;
    }

    public String getFundfinancialreportingroutineid() {
        return fundfinancialreportingroutineid;
    }

    public void setFundFinancialReportingRoutine(org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}