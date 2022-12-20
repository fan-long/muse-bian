/*An arrangement to limit something
e.g., the number of transaction per week, the amount of money allowed to withdraw per week/day and etc. */
package org.museframework.bian.classes;

public class LimitArrangement {
    /*Nature of the limit.*/
    private String limitType;

    /*Currency unit used to specify the limit amount. (ISO20022)*/
    private String limitCurrency;

    /*Period at which the limit is effective. (ISO20022)*/
    private String limitValidityPeriod;

    /*Amount of money of the limit, expressed in a currency. (ISO20022)*/
    private String limitAmount;

    /*Current status of the limit.*/
    private String limitStatus;

    /*Specifies that the limit is a percentage of a related amount. (ISO20022)*/
    private String limitRate;

    /*Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly. (ISO20022)*/
    private String limitFrequency;

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitCurrency(String limitCurrency) {
        this.limitCurrency = limitCurrency;
    }

    public String getLimitCurrency() {
        return limitCurrency;
    }

    public void setLimitValidityPeriod(String limitValidityPeriod) {
        this.limitValidityPeriod = limitValidityPeriod;
    }

    public String getLimitValidityPeriod() {
        return limitValidityPeriod;
    }

    public void setLimitAmount(String limitAmount) {
        this.limitAmount = limitAmount;
    }

    public String getLimitAmount() {
        return limitAmount;
    }

    public void setLimitStatus(String limitStatus) {
        this.limitStatus = limitStatus;
    }

    public String getLimitStatus() {
        return limitStatus;
    }

    public void setLimitRate(String limitRate) {
        this.limitRate = limitRate;
    }

    public String getLimitRate() {
        return limitRate;
    }

    public void setLimitFrequency(String limitFrequency) {
        this.limitFrequency = limitFrequency;
    }

    public String getLimitFrequency() {
        return limitFrequency;
    }
}