package org.museframework.bian.merchantrelations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMerchantRelationshipAgreementRequest {
    @MetaField
    private String merchantrelationsid;

    @MetaField(ref=true)
    private org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement merchantRelationshipAgreement;

    public void setMerchantrelationsid(String merchantrelationsid) {
        this.merchantrelationsid = merchantrelationsid;
    }

    public String getMerchantrelationsid() {
        return merchantrelationsid;
    }

    public void setMerchantRelationshipAgreement(org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement merchantRelationshipAgreement) {
        this.merchantRelationshipAgreement = merchantRelationshipAgreement;
    }

    public org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement getMerchantRelationshipAgreement() {
        return merchantRelationshipAgreement;
    }
}