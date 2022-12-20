package org.museframework.bian.productmatching.dto;

public class UpdateProductTypeSelectionRequest {
    private String productmatchingid;

    private String producttypeselectionid;

    private org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setProducttypeselectionid(String producttypeselectionid) {
        this.producttypeselectionid = producttypeselectionid;
    }

    public String getProducttypeselectionid() {
        return producttypeselectionid;
    }

    public void setProductTypeSelection(org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection) {
        this.productTypeSelection = productTypeSelection;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductTypeSelection getProductTypeSelection() {
        return productTypeSelection;
    }
}