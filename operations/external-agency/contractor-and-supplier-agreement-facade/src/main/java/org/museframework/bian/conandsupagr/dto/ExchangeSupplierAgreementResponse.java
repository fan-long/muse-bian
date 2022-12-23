package org.museframework.bian.conandsupagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeSupplierAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.conandsupagr.dto.cr.SupplierAgreement supplierAgreement;

    public void setSupplierAgreement(org.museframework.bian.conandsupagr.dto.cr.SupplierAgreement supplierAgreement) {
        this.supplierAgreement = supplierAgreement;
    }

    public org.museframework.bian.conandsupagr.dto.cr.SupplierAgreement getSupplierAgreement() {
        return supplierAgreement;
    }
}