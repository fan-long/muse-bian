/*A collateral arrangement which is planned for valuation of a collateral asset*/
package org.museframework.bian.classes;

public class CollateralValuationArrangement {
    /*Method used for valuation of the collateral asset*/
    private String valuationMethod;

    /*A schedule arranged in the collateral agreement to ensure maintenance the collateral item so that the value of the collateral item is maintained.*/
    private String valuationSchedule;

    /*Percentage by which the collateral amount needs to be adjusted. (ISO20022)*/
    private String valuationRate;

    public void setValuationMethod(String valuationMethod) {
        this.valuationMethod = valuationMethod;
    }

    public String getValuationMethod() {
        return valuationMethod;
    }

    public void setValuationSchedule(String valuationSchedule) {
        this.valuationSchedule = valuationSchedule;
    }

    public String getValuationSchedule() {
        return valuationSchedule;
    }

    public void setValuationRate(String valuationRate) {
        this.valuationRate = valuationRate;
    }

    public String getValuationRate() {
        return valuationRate;
    }
}