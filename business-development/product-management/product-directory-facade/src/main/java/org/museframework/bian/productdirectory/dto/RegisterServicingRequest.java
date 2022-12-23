package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterServicingRequest {
    @MetaField
    private String productdirectoryid;

    @MetaField
    private String servicingid;

    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.bq.Servicing servicing;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setServicingid(String servicingid) {
        this.servicingid = servicingid;
    }

    public String getServicingid() {
        return servicingid;
    }

    public void setServicing(org.museframework.bian.productdirectory.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.productdirectory.dto.bq.Servicing getServicing() {
        return servicing;
    }
}