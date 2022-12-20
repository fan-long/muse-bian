/*Instruction to disburse an amount due by the lender according to the loan arrangements*/
package org.museframework.bian.classes;

public class DisbursementInstruction {
    /**/
    private String disbursementInstructionIdentification;

    /**/
    private String disbursementValueDate;

    /*Reference to the disbursement arrangement that stipulates the conditions applicable for the request for disbursement.*/
    private String disbursementArrangementReference;

    /*The party that is entitled to the disbursement, as agreed upon in the disbursement arrangement; Can be different from the party who receives the disbursement amount, e.g. in case contractor is payed directly by the bank.*/
    private String disbursementEntitledPartyReference;

    /*Reference to the predict sales agreement a disbursement is requested for.*/
    private String disbursementInstructionAgreementReference;

    public void setDisbursementInstructionIdentification(String disbursementInstructionIdentification) {
        this.disbursementInstructionIdentification = disbursementInstructionIdentification;
    }

    public String getDisbursementInstructionIdentification() {
        return disbursementInstructionIdentification;
    }

    public void setDisbursementValueDate(String disbursementValueDate) {
        this.disbursementValueDate = disbursementValueDate;
    }

    public String getDisbursementValueDate() {
        return disbursementValueDate;
    }

    public void setDisbursementArrangementReference(String disbursementArrangementReference) {
        this.disbursementArrangementReference = disbursementArrangementReference;
    }

    public String getDisbursementArrangementReference() {
        return disbursementArrangementReference;
    }

    public void setDisbursementEntitledPartyReference(String disbursementEntitledPartyReference) {
        this.disbursementEntitledPartyReference = disbursementEntitledPartyReference;
    }

    public String getDisbursementEntitledPartyReference() {
        return disbursementEntitledPartyReference;
    }

    public void setDisbursementInstructionAgreementReference(String disbursementInstructionAgreementReference) {
        this.disbursementInstructionAgreementReference = disbursementInstructionAgreementReference;
    }

    public String getDisbursementInstructionAgreementReference() {
        return disbursementInstructionAgreementReference;
    }
}