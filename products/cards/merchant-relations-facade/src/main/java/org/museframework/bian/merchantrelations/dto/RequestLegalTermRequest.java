package org.museframework.bian.merchantrelations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestLegalTermRequest {
    @MetaField
    private String merchantrelationsid;

    @MetaField
    private String legaltermid;

    @MetaField(ref=true)
    private org.museframework.bian.merchantrelations.dto.bq.LegalTerm legalTerm;

    public void setMerchantrelationsid(String merchantrelationsid) {
        this.merchantrelationsid = merchantrelationsid;
    }

    public String getMerchantrelationsid() {
        return merchantrelationsid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }

    public void setLegalTerm(org.museframework.bian.merchantrelations.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}