package org.museframework.bian.subcusagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSubCustodianAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement subCustodianAgreement;

    public void setSubCustodianAgreement(org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement subCustodianAgreement) {
        this.subCustodianAgreement = subCustodianAgreement;
    }

    public org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement getSubCustodianAgreement() {
        return subCustodianAgreement;
    }
}