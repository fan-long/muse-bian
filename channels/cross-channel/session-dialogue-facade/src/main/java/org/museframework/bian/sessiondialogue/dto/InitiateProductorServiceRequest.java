package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateProductorServiceRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String productorserviceid;

    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService;

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

    public void setProductorService(org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService) {
        this.productorService = productorService;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.ProductorService getProductorService() {
        return productorService;
    }
}