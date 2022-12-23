package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateSalesRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String salesid;

    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Sales sales;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }

    public String getSalesid() {
        return salesid;
    }

    public void setSales(org.museframework.bian.sessiondialogue.dto.bq.Sales sales) {
        this.sales = sales;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Sales getSales() {
        return sales;
    }
}