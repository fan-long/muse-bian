package org.museframework.bian.commissionagreement.dto;

public class InitiateEmployeeCommissionAgreementResponse {
    private org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement employeeCommissionAgreement;

    public void setEmployeeCommissionAgreement(org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement employeeCommissionAgreement) {
        this.employeeCommissionAgreement = employeeCommissionAgreement;
    }

    public org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement getEmployeeCommissionAgreement() {
        return employeeCommissionAgreement;
    }
}