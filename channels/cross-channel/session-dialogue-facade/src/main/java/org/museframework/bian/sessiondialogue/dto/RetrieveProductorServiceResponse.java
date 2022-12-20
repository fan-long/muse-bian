package org.museframework.bian.sessiondialogue.dto;

public class RetrieveProductorServiceResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService;

    public void setProductorService(org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService) {
        this.productorService = productorService;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.ProductorService getProductorService() {
        return productorService;
    }
}