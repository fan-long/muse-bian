/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FraudCheck {
    /*Result of the fraud check*/
    @MetaField
    private String fraudCheckResult;

    public void setFraudCheckResult(String fraudCheckResult) {
        this.fraudCheckResult = fraudCheckResult;
    }

    public String getFraudCheckResult() {
        return fraudCheckResult;
    }
}