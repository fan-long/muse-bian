/*The product features/services available with a financical facility*/
package org.museframework.bian.custaxhan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Analysis
@MetaDto
public class Analysis {
    /*Work documentation, forms and schedules produced and referenced to develop the customer tax position/statement that is used for reporting*/
    @MetaField(0)
    private String customerTaxHandlingAnalysisWorkProducts;

    public void setCustomerTaxHandlingAnalysisWorkProducts(String customerTaxHandlingAnalysisWorkProducts) {
        this.customerTaxHandlingAnalysisWorkProducts = customerTaxHandlingAnalysisWorkProducts;
    }

    public String getCustomerTaxHandlingAnalysisWorkProducts() {
        return customerTaxHandlingAnalysisWorkProducts;
    }
}