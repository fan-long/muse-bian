/*The Trading Counterparty Credit Limit Indicator is one integral indicator that can be included in Trading Counterparty Credit Limit Indicator monitoring */
package org.museframework.bian.crerisope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditRiskOperationsOutcome {
    /**/
    @MetaField
    private String creditRiskOperationsDashboard;

    public void setCreditRiskOperationsDashboard(String creditRiskOperationsDashboard) {
        this.creditRiskOperationsDashboard = creditRiskOperationsDashboard;
    }

    public String getCreditRiskOperationsDashboard() {
        return creditRiskOperationsDashboard;
    }
}