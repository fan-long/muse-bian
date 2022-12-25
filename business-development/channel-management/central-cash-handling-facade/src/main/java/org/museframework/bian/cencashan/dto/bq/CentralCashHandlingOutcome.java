/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.cencashan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CentralCashHandlingOutcome {
    /**/
    @MetaField(0)
    private String centralCashHandlingAllocation;

    /**/
    @MetaField(0)
    private String centralCashHandlingWorkProduct;

    public void setCentralCashHandlingAllocation(String centralCashHandlingAllocation) {
        this.centralCashHandlingAllocation = centralCashHandlingAllocation;
    }

    public String getCentralCashHandlingAllocation() {
        return centralCashHandlingAllocation;
    }

    public void setCentralCashHandlingWorkProduct(String centralCashHandlingWorkProduct) {
        this.centralCashHandlingWorkProduct = centralCashHandlingWorkProduct;
    }

    public String getCentralCashHandlingWorkProduct() {
        return centralCashHandlingWorkProduct;
    }
}