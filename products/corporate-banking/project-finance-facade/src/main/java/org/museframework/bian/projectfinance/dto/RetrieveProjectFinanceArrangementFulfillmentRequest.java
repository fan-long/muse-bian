package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProjectFinanceArrangementFulfillmentRequest {
    @MetaField
    private String projectfinanceid;

    @MetaField
    private String projectfinancearrangementfulfillmentid;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinancearrangementfulfillmentid(String projectfinancearrangementfulfillmentid) {
        this.projectfinancearrangementfulfillmentid = projectfinancearrangementfulfillmentid;
    }

    public String getProjectfinancearrangementfulfillmentid() {
        return projectfinancearrangementfulfillmentid;
    }
}