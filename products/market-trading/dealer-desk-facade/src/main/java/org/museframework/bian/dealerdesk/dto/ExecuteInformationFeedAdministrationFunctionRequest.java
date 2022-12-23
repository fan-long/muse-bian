package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteInformationFeedAdministrationFunctionRequest {
    @MetaField
    private String dealerdeskid;

    @MetaField
    private String informationfeedadministrationfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction informationFeedAdministrationFunction;

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

    public void setInformationFeedAdministrationFunction(org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction informationFeedAdministrationFunction) {
        this.informationFeedAdministrationFunction = informationFeedAdministrationFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction getInformationFeedAdministrationFunction() {
        return informationFeedAdministrationFunction;
    }
}