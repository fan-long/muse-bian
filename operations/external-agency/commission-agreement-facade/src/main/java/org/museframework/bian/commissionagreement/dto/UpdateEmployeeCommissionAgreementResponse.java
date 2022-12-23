package org.museframework.bian.commissionagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateEmployeeCommissionAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement employeeCommissionAgreement;

    public void setEmployeeCommissionAgreement(org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement employeeCommissionAgreement) {
        this.employeeCommissionAgreement = employeeCommissionAgreement;
    }

    public org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement getEmployeeCommissionAgreement() {
        return employeeCommissionAgreement;
    }
}