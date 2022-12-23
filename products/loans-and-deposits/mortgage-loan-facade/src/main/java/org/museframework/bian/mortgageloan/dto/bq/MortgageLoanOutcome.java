/**/
package org.museframework.bian.mortgageloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MortgageLoanOutcome {
    /**/
    @MetaField
    private String mortgageLoanFinancialFacility;

    /**/
    @MetaField
    private String mortgageLoanWorkProduct;

    public void setMortgageLoanFinancialFacility(String mortgageLoanFinancialFacility) {
        this.mortgageLoanFinancialFacility = mortgageLoanFinancialFacility;
    }

    public String getMortgageLoanFinancialFacility() {
        return mortgageLoanFinancialFacility;
    }

    public void setMortgageLoanWorkProduct(String mortgageLoanWorkProduct) {
        this.mortgageLoanWorkProduct = mortgageLoanWorkProduct;
    }

    public String getMortgageLoanWorkProduct() {
        return mortgageLoanWorkProduct;
    }
}