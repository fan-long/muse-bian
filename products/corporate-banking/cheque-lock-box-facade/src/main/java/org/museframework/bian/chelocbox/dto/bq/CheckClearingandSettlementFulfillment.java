/*The configuration and execution of Check Clearing and Settlement Fulfillment arrangement within the Check Clearing and Settlement Fulfillment*/
package org.museframework.bian.chelocbox.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CheckClearingandSettlementFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Check Clearing and Settlement Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Check Clearing and Settlement Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference;

    /*Reference to Check Clearing and Settlement Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object checkClearingandSettlementFulfillmentReference;

    /*The type of Check Clearing and Settlement Fulfillment*/
    @MetaField
    private String checkClearingandSettlementFulfillmentType;

    /*An unique reference to an item or an occurance (data type is Object)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object clearingandSettlementInstanceReference;

    /*The clearing arrangement between the bank and clearing house - includes schedule, limits*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondentBankClearingArrangementReference;

    /*Customer specific default clearing instructions*/
    @MetaField
    private String correspondentBankClearingArrangementClearingInstructions;

    /*Customer specific default settlement instructions (e.g. to handle netting arrangements)*/
    @MetaField
    private String correspondentBankClearingArrangementSettlementInstructions;

    /*Used for central bank clearing reconciliations*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mirrorNostroAccountReference;

    /*A record of a clearing transaction*/
    @MetaField
    private String clearingTransaction;

    /*A record of a settlement transaction*/
    @MetaField
    private String settlementTransaction;

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

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setLockBoxFacilityReference(org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference) {
        this.lockBoxFacilityReference = lockBoxFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getLockBoxFacilityReference() {
        return lockBoxFacilityReference;
    }

    public void setCheckClearingandSettlementFulfillmentReference(org.museframework.bian.classes.Object checkClearingandSettlementFulfillmentReference) {
        this.checkClearingandSettlementFulfillmentReference = checkClearingandSettlementFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getCheckClearingandSettlementFulfillmentReference() {
        return checkClearingandSettlementFulfillmentReference;
    }

    public void setCheckClearingandSettlementFulfillmentType(String checkClearingandSettlementFulfillmentType) {
        this.checkClearingandSettlementFulfillmentType = checkClearingandSettlementFulfillmentType;
    }

    public String getCheckClearingandSettlementFulfillmentType() {
        return checkClearingandSettlementFulfillmentType;
    }

    public void setClearingandSettlementInstanceReference(org.museframework.bian.classes.Object clearingandSettlementInstanceReference) {
        this.clearingandSettlementInstanceReference = clearingandSettlementInstanceReference;
    }

    public org.museframework.bian.classes.Object getClearingandSettlementInstanceReference() {
        return clearingandSettlementInstanceReference;
    }

    public void setCorrespondentBankClearingArrangementReference(org.museframework.bian.classes.Object correspondentBankClearingArrangementReference) {
        this.correspondentBankClearingArrangementReference = correspondentBankClearingArrangementReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentBankClearingArrangementReference() {
        return correspondentBankClearingArrangementReference;
    }

    public void setCorrespondentBankClearingArrangementClearingInstructions(String correspondentBankClearingArrangementClearingInstructions) {
        this.correspondentBankClearingArrangementClearingInstructions = correspondentBankClearingArrangementClearingInstructions;
    }

    public String getCorrespondentBankClearingArrangementClearingInstructions() {
        return correspondentBankClearingArrangementClearingInstructions;
    }

    public void setCorrespondentBankClearingArrangementSettlementInstructions(String correspondentBankClearingArrangementSettlementInstructions) {
        this.correspondentBankClearingArrangementSettlementInstructions = correspondentBankClearingArrangementSettlementInstructions;
    }

    public String getCorrespondentBankClearingArrangementSettlementInstructions() {
        return correspondentBankClearingArrangementSettlementInstructions;
    }

    public void setMirrorNostroAccountReference(org.museframework.bian.classes.Object mirrorNostroAccountReference) {
        this.mirrorNostroAccountReference = mirrorNostroAccountReference;
    }

    public org.museframework.bian.classes.Object getMirrorNostroAccountReference() {
        return mirrorNostroAccountReference;
    }

    public void setClearingTransaction(String clearingTransaction) {
        this.clearingTransaction = clearingTransaction;
    }

    public String getClearingTransaction() {
        return clearingTransaction;
    }

    public void setSettlementTransaction(String settlementTransaction) {
        this.settlementTransaction = settlementTransaction;
    }

    public String getSettlementTransaction() {
        return settlementTransaction;
    }
}