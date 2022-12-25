/**/
package org.museframework.bian.merchandisingloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MerchandisingLoanOutcome {
    /**/
    @MetaField(0)
    private String merchandisingLoanFinancialFacility;

    /**/
    @MetaField(0)
    private String merchandisingLoanWorkProduct;

    public void setMerchandisingLoanFinancialFacility(String merchandisingLoanFinancialFacility) {
        this.merchandisingLoanFinancialFacility = merchandisingLoanFinancialFacility;
    }

    public String getMerchandisingLoanFinancialFacility() {
        return merchandisingLoanFinancialFacility;
    }

    public void setMerchandisingLoanWorkProduct(String merchandisingLoanWorkProduct) {
        this.merchandisingLoanWorkProduct = merchandisingLoanWorkProduct;
    }

    public String getMerchandisingLoanWorkProduct() {
        return merchandisingLoanWorkProduct;
    }
}