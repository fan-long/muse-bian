package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFundFinancialReportingRoutineRequest {
    @MetaField
    private String unittrustadministrationid;

    @MetaField
    private String fundfinancialreportingroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundfinancialreportingroutineid(String fundfinancialreportingroutineid) {
        this.fundfinancialreportingroutineid = fundfinancialreportingroutineid;
    }

    public String getFundfinancialreportingroutineid() {
        return fundfinancialreportingroutineid;
    }

    public void setFundFinancialReportingRoutine(org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}