package org.museframework.bian.merchantrelations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestMerchantRelationshipAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement merchantRelationshipAgreement;

    public void setMerchantRelationshipAgreement(org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement merchantRelationshipAgreement) {
        this.merchantRelationshipAgreement = merchantRelationshipAgreement;
    }

    public org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement getMerchantRelationshipAgreement() {
        return merchantRelationshipAgreement;
    }
}