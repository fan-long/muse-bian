/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcase.dto.bq;

public class Chargeback {
    /*Reference to the card transaction for the consolidation*/
    private org.museframework.bian.classes.Object chargebackCardTransactionRecordReference;

    /*The instruction to book chargeback for the transaction - could be partial chargeback*/
    private String chargebackInstruction;

    public void setChargebackCardTransactionRecordReference(org.museframework.bian.classes.Object chargebackCardTransactionRecordReference) {
        this.chargebackCardTransactionRecordReference = chargebackCardTransactionRecordReference;
    }

    public org.museframework.bian.classes.Object getChargebackCardTransactionRecordReference() {
        return chargebackCardTransactionRecordReference;
    }

    public void setChargebackInstruction(String chargebackInstruction) {
        this.chargebackInstruction = chargebackInstruction;
    }

    public String getChargebackInstruction() {
        return chargebackInstruction;
    }
}