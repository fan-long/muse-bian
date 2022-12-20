package org.museframework.bian.productmatching.dto;

public class UpdateProductTypeSelectionResponse {
    private org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection;

    public void setProductTypeSelection(org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection) {
        this.productTypeSelection = productTypeSelection;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductTypeSelection getProductTypeSelection() {
        return productTypeSelection;
    }
}