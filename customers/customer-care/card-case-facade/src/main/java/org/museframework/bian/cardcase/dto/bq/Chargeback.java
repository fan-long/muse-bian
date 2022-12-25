/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcase.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Chargeback {
    /*Reference to the card transaction for the consolidation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object chargebackCardTransactionRecordReference;

    /*The instruction to book chargeback for the transaction - could be partial chargeback*/
    @MetaField(0)
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