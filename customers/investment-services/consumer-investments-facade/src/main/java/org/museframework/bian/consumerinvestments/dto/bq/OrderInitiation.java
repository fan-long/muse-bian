/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.consumerinvestments.dto.bq;

public class OrderInitiation {
    /*The reference to the market order. Note this can be the internal bank 'order' made against the bank's managed position and may not result in a matched trade in the wholesale markets*/
    private org.museframework.bian.classes.Object consumerSecuritiesOrderTransactionInstanceReference;

    /*The returned status of the customer securities order*/
    private String consumerSecuritiesOrderTransactionInstanceStatus;

    /*Details of the market order initiation task*/
    private String consumerSecuritiesOrderInitiationTaskResult;

    public void setConsumerSecuritiesOrderTransactionInstanceReference(org.museframework.bian.classes.Object consumerSecuritiesOrderTransactionInstanceReference) {
        this.consumerSecuritiesOrderTransactionInstanceReference = consumerSecuritiesOrderTransactionInstanceReference;
    }

    public org.museframework.bian.classes.Object getConsumerSecuritiesOrderTransactionInstanceReference() {
        return consumerSecuritiesOrderTransactionInstanceReference;
    }

    public void setConsumerSecuritiesOrderTransactionInstanceStatus(String consumerSecuritiesOrderTransactionInstanceStatus) {
        this.consumerSecuritiesOrderTransactionInstanceStatus = consumerSecuritiesOrderTransactionInstanceStatus;
    }

    public String getConsumerSecuritiesOrderTransactionInstanceStatus() {
        return consumerSecuritiesOrderTransactionInstanceStatus;
    }

    public void setConsumerSecuritiesOrderInitiationTaskResult(String consumerSecuritiesOrderInitiationTaskResult) {
        this.consumerSecuritiesOrderInitiationTaskResult = consumerSecuritiesOrderInitiationTaskResult;
    }

    public String getConsumerSecuritiesOrderInitiationTaskResult() {
        return consumerSecuritiesOrderInitiationTaskResult;
    }
}