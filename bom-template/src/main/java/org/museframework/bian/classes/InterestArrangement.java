/*An arrangement into which both parties confirm on an interest product feature. */
package org.museframework.bian.classes;

public class InterestArrangement {
    /*Type of an arranged Interest*/
    private String interestType;

    /*An arranged InterestRate


*/
    private String interestRate;

    /**/
    private String interestDefinition;

    /*Type of Rate which is arranged to apply interest*/
    private org.museframework.bian.enumerations.Interestratetypevalues interestRateType;

    /*Period during which the interest rate has to be applied. */
    private String interestPeriod;

    /*An arranged InterestRatePlan*/
    private String interestRatePlan;

    /*An interest schedule is an arranged/planned set of dates at which interest will be claimed.

- The set can be represented on a calendar, a formula, a table, etc.*/
    private String interestSchedule;

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestDefinition(String interestDefinition) {
        this.interestDefinition = interestDefinition;
    }

    public String getInterestDefinition() {
        return interestDefinition;
    }

    public void setInterestRateType(org.museframework.bian.enumerations.Interestratetypevalues interestRateType) {
        this.interestRateType = interestRateType;
    }

    public org.museframework.bian.enumerations.Interestratetypevalues getInterestRateType() {
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

    public void setInterestSchedule(String interestSchedule) {
        this.interestSchedule = interestSchedule;
    }

    public String getInterestSchedule() {
        return interestSchedule;
    }
}