package org.museframework.bian.salesproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateProductandServiceAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement;

    public void setProductandServiceAgreement(org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement) {
        this.productandServiceAgreement = productandServiceAgreement;
    }

    public org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement getProductandServiceAgreement() {
        return productandServiceAgreement;
    }
}