package org.museframework.bian.subcusagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSubCustodianAgreementRequest {
    @MetaField
    private String subcustodianagreementid;

    @MetaField(ref=true)
    private org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement subCustodianAgreement;

    public void setSubcustodianagreementid(String subcustodianagreementid) {
        this.subcustodianagreementid = subcustodianagreementid;
    }

    public String getSubcustodianagreementid() {
        return subcustodianagreementid;
    }

    public void setSubCustodianAgreement(org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement subCustodianAgreement) {
        this.subCustodianAgreement = subCustodianAgreement;
    }

    public org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement getSubCustodianAgreement() {
        return subCustodianAgreement;
    }
}