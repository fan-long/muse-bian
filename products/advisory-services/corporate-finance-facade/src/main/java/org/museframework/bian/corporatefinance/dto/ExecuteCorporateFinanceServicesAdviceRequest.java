package org.museframework.bian.corporatefinance.dto;

public class ExecuteCorporateFinanceServicesAdviceRequest {
    private String corporatefinanceid;

    private org.museframework.bian.corporatefinance.dto.cr.CorporateFinanceServicesAdvice corporateFinanceServicesAdvice;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setCorporateFinanceServicesAdvice(org.museframework.bian.corporatefinance.dto.cr.CorporateFinanceServicesAdvice corporateFinanceServicesAdvice) {
        this.corporateFinanceServicesAdvice = corporateFinanceServicesAdvice;
    }

    public org.museframework.bian.corporatefinance.dto.cr.CorporateFinanceServicesAdvice getCorporateFinanceServicesAdvice() {
        return corporateFinanceServicesAdvice;
    }
}