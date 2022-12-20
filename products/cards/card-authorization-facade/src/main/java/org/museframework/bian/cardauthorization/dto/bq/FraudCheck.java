/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

public class FraudCheck {
    /*Result of the fraud check*/
    private String fraudCheckResult;

    public void setFraudCheckResult(String fraudCheckResult) {
        this.fraudCheckResult = fraudCheckResult;
    }

    public String getFraudCheckResult() {
        return fraudCheckResult;
    }
}