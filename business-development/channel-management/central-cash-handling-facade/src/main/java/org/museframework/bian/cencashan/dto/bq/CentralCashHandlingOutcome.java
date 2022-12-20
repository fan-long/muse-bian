/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.cencashan.dto.bq;

public class CentralCashHandlingOutcome {
    /**/
    private String centralCashHandlingAllocation;

    /**/
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