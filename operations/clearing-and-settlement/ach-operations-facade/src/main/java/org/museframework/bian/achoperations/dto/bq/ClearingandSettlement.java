/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.achoperations.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ClearingandSettlement {
    /*Reference to the correspondent bank referenced in the ACH transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondentBankReference;

    /*Reference to the clearing agreement between bank and clearing house - includes schedule, limits*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondentBankClearingAgreementReference;

    /*Customer specific default clearing instructions*/
    @MetaField
    private String correspondentBankClearingAgreementClearingInstructions;

    /*Customer specific default settlement instruction e.g. to handle netting arrangements*/
    @MetaField
    private String correspondentBankClearingAgreementSettlementInstructions;

    /*Account used central bank clearing reconciliations*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mirrorNostroAccountReference;

    public void setCorrespondentBankReference(org.museframework.bian.classes.Object correspondentBankReference) {
        this.correspondentBankReference = correspondentBankReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentBankReference() {
        return correspondentBankReference;
    }

    public void setCorrespondentBankClearingAgreementReference(org.museframework.bian.classes.Object correspondentBankClearingAgreementReference) {
        this.correspondentBankClearingAgreementReference = correspondentBankClearingAgreementReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentBankClearingAgreementReference() {
        return correspondentBankClearingAgreementReference;
    }

    public void setCorrespondentBankClearingAgreementClearingInstructions(String correspondentBankClearingAgreementClearingInstructions) {
        this.correspondentBankClearingAgreementClearingInstructions = correspondentBankClearingAgreementClearingInstructions;
    }

    public String getCorrespondentBankClearingAgreementClearingInstructions() {
        return correspondentBankClearingAgreementClearingInstructions;
    }

    public void setCorrespondentBankClearingAgreementSettlementInstructions(String correspondentBankClearingAgreementSettlementInstructions) {
        this.correspondentBankClearingAgreementSettlementInstructions = correspondentBankClearingAgreementSettlementInstructions;
    }

    public String getCorrespondentBankClearingAgreementSettlementInstructions() {
        return correspondentBankClearingAgreementSettlementInstructions;
    }

    public void setMirrorNostroAccountReference(org.museframework.bian.classes.Object mirrorNostroAccountReference) {
        this.mirrorNostroAccountReference = mirrorNostroAccountReference;
    }

    public org.museframework.bian.classes.Object getMirrorNostroAccountReference() {
        return mirrorNostroAccountReference;
    }
}