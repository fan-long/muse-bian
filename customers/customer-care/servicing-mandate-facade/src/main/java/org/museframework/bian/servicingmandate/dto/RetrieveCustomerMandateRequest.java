package org.museframework.bian.servicingmandate.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerMandateRequest {
    @MetaField
    private String servicingmandateid;

    @MetaField
    private String customermandateid;

    public void setServicingmandateid(String servicingmandateid) {
        this.servicingmandateid = servicingmandateid;
    }

    public String getServicingmandateid() {
        return servicingmandateid;
    }

    public void setCustomermandateid(String customermandateid) {
        this.customermandateid = customermandateid;
    }

    public String getCustomermandateid() {
        return customermandateid;
    }
}