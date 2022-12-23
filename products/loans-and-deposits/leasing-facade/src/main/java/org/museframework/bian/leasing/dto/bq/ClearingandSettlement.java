/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ClearingandSettlement {
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