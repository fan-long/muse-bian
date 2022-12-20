package org.museframework.bian.commissionagreement.dto;

public class GrantEmployeeCommissionAgreementRequest {
    private String commissionagreementid;

    private org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement employeeCommissionAgreement;

    public void setCommissionagreementid(String commissionagreementid) {
        this.commissionagreementid = commissionagreementid;
    }

    public String getCommissionagreementid() {
        return commissionagreementid;
    }

    public void setEmployeeCommissionAgreement(org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement employeeCommissionAgreement) {
        this.employeeCommissionAgreement = employeeCommissionAgreement;
    }

    public org.museframework.bian.commissionagreement.dto.cr.EmployeeCommissionAgreement getEmployeeCommissionAgreement() {
        return employeeCommissionAgreement;
    }
}