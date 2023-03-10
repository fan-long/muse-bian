/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marketorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerProcessing {
    /*Details of any customer specific processing requirements applied to the market order*/
    @MetaField(0)
    private String marketOrderCustomerProcessingCheckResult;

    public void setMarketOrderCustomerProcessingCheckResult(String marketOrderCustomerProcessingCheckResult) {
        this.marketOrderCustomerProcessingCheckResult = marketOrderCustomerProcessingCheckResult;
    }

    public String getMarketOrderCustomerProcessingCheckResult() {
        return marketOrderCustomerProcessingCheckResult;
    }
}