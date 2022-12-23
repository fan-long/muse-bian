package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSecuritiesReportingRequest {
    @MetaField
    private String custodyadministrationid;

    @MetaField
    private String securitiesreportingid;

    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setSecuritiesreportingid(String securitiesreportingid) {
        this.securitiesreportingid = securitiesreportingid;
    }

    public String getSecuritiesreportingid() {
        return securitiesreportingid;
    }

    public void setSecuritiesReporting(org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting) {
        this.securitiesReporting = securitiesReporting;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting getSecuritiesReporting() {
        return securitiesReporting;
    }
}