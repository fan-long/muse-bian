/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.producttraining.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductTrainingOutcome {
    /**/
    @MetaField
    private String productTrainingWorkProduct;

    /**/
    @MetaField
    private String productTrainingProcedure;

    public void setProductTrainingWorkProduct(String productTrainingWorkProduct) {
        this.productTrainingWorkProduct = productTrainingWorkProduct;
    }

    public String getProductTrainingWorkProduct() {
        return productTrainingWorkProduct;
    }

    public void setProductTrainingProcedure(String productTrainingProcedure) {
        this.productTrainingProcedure = productTrainingProcedure;
    }

    public String getProductTrainingProcedure() {
        return productTrainingProcedure;
    }
}