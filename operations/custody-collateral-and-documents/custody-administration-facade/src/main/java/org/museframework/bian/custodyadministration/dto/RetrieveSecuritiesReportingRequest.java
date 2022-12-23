package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSecuritiesReportingRequest {
    @MetaField
    private String custodyadministrationid;

    @MetaField
    private String securitiesreportingid;

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
}