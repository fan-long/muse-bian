/*Covers the legal considerations of the agreement*/
package org.museframework.bian.merchantrelations.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OperationalTerm {
    /*The required status/situation for the terms to apply and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*Any timing/duration considerations applying to the Operational Term*/
    @MetaField
    private String schedule;

    /*The Operational Term specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Operational Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement merchantRelationshipAgreementReference;

    /*Reference to Operational Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement operationalTermReference;

    /*The type of Operational Term*/
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

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setMerchantRelationshipAgreementReference(org.museframework.bian.classes.Agreement merchantRelationshipAgreementReference) {
        this.merchantRelationshipAgreementReference = merchantRelationshipAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getMerchantRelationshipAgreementReference() {
        return merchantRelationshipAgreementReference;
    }

    public void setOperationalTermReference(org.museframework.bian.classes.Arrangement operationalTermReference) {
        this.operationalTermReference = operationalTermReference;
    }

    public org.museframework.bian.classes.Arrangement getOperationalTermReference() {
        return operationalTermReference;
    }

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