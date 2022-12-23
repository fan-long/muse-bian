/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.salesproduct.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OperationalTerm {
    /*Type of term (e.g. fee waiver, rate discount, linked service)*/
    @MetaField
    private String operationalTermType;

    /*Description of the term, including servicing and fulfillment details*/
    @MetaField
    private String operationalTermDescription;

    /*Parameters that govern the execution of the term (e.g. rate discounted by, fee reduced by)*/
    @MetaField
    private String operationalTermParameterType;

    /*The value of the parameter for this instance*/
    @MetaField
    private String operationalTermParameterSetting;

    /*Details of cash flows associated with fulfillment instances of the term (can be charges made to the customer or compensating transfers to the base product profit center)*/
    @MetaField
    private String operationalTermTransactionRecord;

    /*The type of transaction and the resulting cash adjustment (e.g. interest forgiveness, fee reduction)*/
    @MetaField
    private String operationalTermTransactionType;

    /*Description of the transaction detailing amounts and source and the creditor of transfers*/
    @MetaField
    private String operationalTermTransactionDescription;

    /*The actual cash flows associated with the fulfillment of the term*/
    @MetaField
    private String operationalTermAugmentedCashFlows;

    /*Reference to the underlying funds transfer transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentInitiationTransactionInstanceReference;

    public void setOperationalTermType(String operationalTermType) {
        this.operationalTermType = operationalTermType;
    }

    public String getOperationalTermType() {
        return operationalTermType;
    }

    public void setOperationalTermDescription(String operationalTermDescription) {
        this.operationalTermDescription = operationalTermDescription;
    }

    public String getOperationalTermDescription() {
        return operationalTermDescription;
    }

    public void setOperationalTermParameterType(String operationalTermParameterType) {
        this.operationalTermParameterType = operationalTermParameterType;
    }

    public String getOperationalTermParameterType() {
        return operationalTermParameterType;
    }

    public void setOperationalTermParameterSetting(String operationalTermParameterSetting) {
        this.operationalTermParameterSetting = operationalTermParameterSetting;
    }

    public String getOperationalTermParameterSetting() {
        return operationalTermParameterSetting;
    }

    public void setOperationalTermTransactionRecord(String operationalTermTransactionRecord) {
        this.operationalTermTransactionRecord = operationalTermTransactionRecord;
    }

    public String getOperationalTermTransactionRecord() {
        return operationalTermTransactionRecord;
    }

    public void setOperationalTermTransactionType(String operationalTermTransactionType) {
        this.operationalTermTransactionType = operationalTermTransactionType;
    }

    public String getOperationalTermTransactionType() {
        return operationalTermTransactionType;
    }

    public void setOperationalTermTransactionDescription(String operationalTermTransactionDescription) {
        this.operationalTermTransactionDescription = operationalTermTransactionDescription;
    }

    public String getOperationalTermTransactionDescription() {
        return operationalTermTransactionDescription;
    }

    public void setOperationalTermAugmentedCashFlows(String operationalTermAugmentedCashFlows) {
        this.operationalTermAugmentedCashFlows = operationalTermAugmentedCashFlows;
    }

    public String getOperationalTermAugmentedCashFlows() {
        return operationalTermAugmentedCashFlows;
    }

    public void setPaymentInitiationTransactionInstanceReference(org.museframework.bian.classes.Object paymentInitiationTransactionInstanceReference) {
        this.paymentInitiationTransactionInstanceReference = paymentInitiationTransactionInstanceReference;
    }

    public org.museframework.bian.classes.Object getPaymentInitiationTransactionInstanceReference() {
        return paymentInitiationTransactionInstanceReference;
    }
}