/*Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. (ISO20022)*/
package org.museframework.bian.classes;

public class InterestFeature {
    /*Type of Interest*/
    private String interestType;

    /**/
    private String interestDefinition;

    /*A classification that distinguishes between interest rates according to 
- a reference rate
- financial calculation
- contextual adjustment 

Specifies the type of rate used to calculate the interest. (ISO20022)*/
    private String interestRateType;

    /*Period during which the interest rate can be applied. (ISO20022)*/
    private String interestPeriod;

    /*A plan (formula or structure) used to derive the value of interest rate 

*/
    private String interestRatePlan;

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestDefinition(String interestDefinition) {
        this.interestDefinition = interestDefinition;
    }

    public String getInterestDefinition() {
        return interestDefinition;
    }

    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType;
    }

    public String getInterestRateType() {
        return interestRateType;
    }

    public void setInterestPeriod(String interestPeriod) {
        this.interestPeriod = interestPeriod;
    }

    public String getInterestPeriod() {
        return interestPeriod;
    }

    public void setInterestRatePlan(String interestRatePlan) {
        this.interestRatePlan = interestRatePlan;
    }

    public String getInterestRatePlan() {
        return interestRatePlan;
    }
}