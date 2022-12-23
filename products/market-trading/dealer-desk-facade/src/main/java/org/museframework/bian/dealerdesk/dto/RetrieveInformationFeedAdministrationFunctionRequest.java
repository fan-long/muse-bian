package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInformationFeedAdministrationFunctionRequest {
    @MetaField
    private String dealerdeskid;

    @MetaField
    private String informationfeedadministrationfunctionid;

    public void setDealerdeskid(String dealerdeskid) {
        this.dealerdeskid = dealerdeskid;
    }

    public String getDealerdeskid() {
        return dealerdeskid;
    }

    public void setInformationfeedadministrationfunctionid(String informationfeedadministrationfunctionid) {
        this.informationfeedadministrationfunctionid = informationfeedadministrationfunctionid;
    }

    public String getInformationfeedadministrationfunctionid() {
        return informationfeedadministrationfunctionid;
    }
}