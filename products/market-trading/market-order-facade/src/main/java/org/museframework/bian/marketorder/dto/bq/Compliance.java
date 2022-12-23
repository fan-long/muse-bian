/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marketorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Compliance {
    /*The type of compliance check performed (e.g. AML, Watch lists)*/
    @MetaField
    private String marketOrderTransactionComplianceCheckType;

    /*The outcome of the compliance check*/
    @MetaField
    private String marketOrderTransactionComplianceCheckResult;

    /*Details of the overall compliance checking process*/
    @MetaField
    private String marketOrderTransactionComplianceTaskResult;

    public void setMarketOrderTransactionComplianceCheckType(String marketOrderTransactionComplianceCheckType) {
        this.marketOrderTransactionComplianceCheckType = marketOrderTransactionComplianceCheckType;
    }

    public String getMarketOrderTransactionComplianceCheckType() {
        return marketOrderTransactionComplianceCheckType;
    }

    public void setMarketOrderTransactionComplianceCheckResult(String marketOrderTransactionComplianceCheckResult) {
        this.marketOrderTransactionComplianceCheckResult = marketOrderTransactionComplianceCheckResult;
    }

    public String getMarketOrderTransactionComplianceCheckResult() {
        return marketOrderTransactionComplianceCheckResult;
    }

    public void setMarketOrderTransactionComplianceTaskResult(String marketOrderTransactionComplianceTaskResult) {
        this.marketOrderTransactionComplianceTaskResult = marketOrderTransactionComplianceTaskResult;
    }

    public String getMarketOrderTransactionComplianceTaskResult() {
        return marketOrderTransactionComplianceTaskResult;
    }
}