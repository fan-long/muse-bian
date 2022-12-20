/*An arrangement that specifies obligations/rights engaged in the financial advisory service agreement to deliver the ProductGuidanceAdvisoryService*/
package org.museframework.bian.classes;

public class ProductGuidanceAdvisoryServiceArrangement {
    /*The service charge to be made to the customer for the specialist support*/
    private String applicableServiceCharge;

    public void setApplicableServiceCharge(String applicableServiceCharge) {
        this.applicableServiceCharge = applicableServiceCharge;
    }

    public String getApplicableServiceCharge() {
        return applicableServiceCharge;
    }
}