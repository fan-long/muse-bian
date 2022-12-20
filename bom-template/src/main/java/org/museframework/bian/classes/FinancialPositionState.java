/*A mechanism to track/monitor the bank's consolidated financial positions for major customers and complex market conditions.*/
package org.museframework.bian.classes;

public class FinancialPositionState {
    /*Description of the specification and purpose position monitoring (e.g. real-time limit, trend).*/
    private String purpose;

    /*The current, historical and if applicable projected values of the monitored position.*/
    private String value;

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}