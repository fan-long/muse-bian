package org.museframework.bian.proexpsalsup.dto;

public class RequestSalesSpecialistSupportAdministrativePlanRequest {
    private String productexpertsalessupportid;

    private org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan salesSpecialistSupportAdministrativePlan;

    public void setProductexpertsalessupportid(String productexpertsalessupportid) {
        this.productexpertsalessupportid = productexpertsalessupportid;
    }

    public String getProductexpertsalessupportid() {
        return productexpertsalessupportid;
    }

    public void setSalesSpecialistSupportAdministrativePlan(org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan salesSpecialistSupportAdministrativePlan) {
        this.salesSpecialistSupportAdministrativePlan = salesSpecialistSupportAdministrativePlan;
    }

    public org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan getSalesSpecialistSupportAdministrativePlan() {
        return salesSpecialistSupportAdministrativePlan;
    }
}