/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.carfinset.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Instruction extends org.museframework.bian.classes.Instruction {
    /*Settlement account statement for processing window - used to confirm payments*/
    @MetaField
    private String participantAcquirerBankSettlementAccountStatement;

    /*Settlement account statement for processing window - used to confirm payments*/
    @MetaField
    private String participantIssuerBankSettlementAccountStatement;

    public void setParticipantAcquirerBankSettlementAccountStatement(String participantAcquirerBankSettlementAccountStatement) {
        this.participantAcquirerBankSettlementAccountStatement = participantAcquirerBankSettlementAccountStatement;
    }

    public String getParticipantAcquirerBankSettlementAccountStatement() {
        return participantAcquirerBankSettlementAccountStatement;
    }

    public void setParticipantIssuerBankSettlementAccountStatement(String participantIssuerBankSettlementAccountStatement) {
        this.participantIssuerBankSettlementAccountStatement = participantIssuerBankSettlementAccountStatement;
    }

    public String getParticipantIssuerBankSettlementAccountStatement() {
        return participantIssuerBankSettlementAccountStatement;
    }
}