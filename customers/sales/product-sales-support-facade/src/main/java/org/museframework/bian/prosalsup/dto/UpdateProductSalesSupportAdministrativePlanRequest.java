package org.museframework.bian.prosalsup.dto;

public class UpdateProductSalesSupportAdministrativePlanRequest {
    private String productsalessupportid;

    private org.museframework.bian.prosalsup.dto.cr.ProductSalesSupportAdministrativePlan productSalesSupportAdministrativePlan;

    public void setProductsalessupportid(String productsalessupportid) {
        this.productsalessupportid = productsalessupportid;
    }

    public String getProductsalessupportid() {
        return productsalessupportid;
    }

    public void setProductSalesSupportAdministrativePlan(org.museframework.bian.prosalsup.dto.cr.ProductSalesSupportAdministrativePlan productSalesSupportAdministrativePlan) {
        this.productSalesSupportAdministrativePlan = productSalesSupportAdministrativePlan;
    }

    public org.museframework.bian.prosalsup.dto.cr.ProductSalesSupportAdministrativePlan getProductSalesSupportAdministrativePlan() {
        return productSalesSupportAdministrativePlan;
    }
}