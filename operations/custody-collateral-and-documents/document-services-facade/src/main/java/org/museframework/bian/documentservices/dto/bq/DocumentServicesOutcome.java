/**/
package org.museframework.bian.documentservices.dto.bq;

public class DocumentServicesOutcome {
    /**/
    private String documentServicesWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure documentServicesProcedure;

    public void setDocumentServicesWorkProduct(String documentServicesWorkProduct) {
        this.documentServicesWorkProduct = documentServicesWorkProduct;
    }

    public String getDocumentServicesWorkProduct() {
        return documentServicesWorkProduct;
    }

    public void setDocumentServicesProcedure(org.museframework.bian.classes.Procedure documentServicesProcedure) {
        this.documentServicesProcedure = documentServicesProcedure;
    }

    public org.museframework.bian.classes.Procedure getDocumentServicesProcedure() {
        return documentServicesProcedure;
    }
}