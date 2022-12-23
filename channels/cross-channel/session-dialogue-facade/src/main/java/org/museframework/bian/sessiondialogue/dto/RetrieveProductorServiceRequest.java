package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductorServiceRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String productorserviceid;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setProductorserviceid(String productorserviceid) {
        this.productorserviceid = productorserviceid;
    }

    public String getProductorserviceid() {
        return productorserviceid;
    }
}