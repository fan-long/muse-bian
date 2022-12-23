package org.museframework.bian.salesproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductandServiceAgreementRequest {
    @MetaField
    private String salesproductid;

    @MetaField(ref=true)
    private org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement;

    public void setSalesproductid(String salesproductid) {
        this.salesproductid = salesproductid;
    }

    public String getSalesproductid() {
        return salesproductid;
    }

    public void setProductandServiceAgreement(org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement) {
        this.productandServiceAgreement = productandServiceAgreement;
    }

    public org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement getProductandServiceAgreement() {
        return productandServiceAgreement;
    }
}