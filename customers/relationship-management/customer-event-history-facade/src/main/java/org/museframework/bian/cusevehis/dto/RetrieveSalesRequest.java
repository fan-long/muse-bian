package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSalesRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String salesid;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }

    public String getSalesid() {
        return salesid;
    }
}