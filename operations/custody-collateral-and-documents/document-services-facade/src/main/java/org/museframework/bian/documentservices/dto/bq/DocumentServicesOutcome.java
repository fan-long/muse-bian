/**/
package org.museframework.bian.documentservices.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DocumentServicesOutcome {
    /**/
    @MetaField(0)
    private String documentServicesWorkProduct;

    /**/
    @MetaField(ref=true)
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