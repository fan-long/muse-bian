/*The product features/services available with a financical facility*/
package org.museframework.bian.meracqfac.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Settlement extends org.museframework.bian.classes.Settlement {
    /*Reference to the Merchant Acquiring bank for settlement processing*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object participantMerchantAcquirerBankReference;

    /*Reference to the Issuing bank for payments made to the issuer for chargebacks*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object participantIssuerBankReference;

    /*Details the individual participant Issuer or Acquirer payments calculated to be due for this settlement window - covers only the instructions specific to the participant Merchant Acquirer*/
    @MetaField
    private String cardFinancialSettlementServicePaymentAdviceRecord;

    /*Details the payment made, typically from Issuer to Acquirer participant bank*/
    @MetaField
    private String participantPaymentTransaction;

    /*The settlement account statement for the processing window - used to confirm payments*/
    @MetaField
    private String participantAcquirerBankSettlementAccountStatement;

    public void setParticipantMerchantAcquirerBankReference(org.museframework.bian.classes.Object participantMerchantAcquirerBankReference) {
        this.participantMerchantAcquirerBankReference = participantMerchantAcquirerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantMerchantAcquirerBankReference() {
        return participantMerchantAcquirerBankReference;
    }

    public void setParticipantIssuerBankReference(org.museframework.bian.classes.Object participantIssuerBankReference) {
        this.participantIssuerBankReference = participantIssuerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantIssuerBankReference() {
        return participantIssuerBankReference;
    }

    public void setCardFinancialSettlementServicePaymentAdviceRecord(String cardFinancialSettlementServicePaymentAdviceRecord) {
        this.cardFinancialSettlementServicePaymentAdviceRecord = cardFinancialSettlementServicePaymentAdviceRecord;
    }

    public String getCardFinancialSettlementServicePaymentAdviceRecord() {
        return cardFinancialSettlementServicePaymentAdviceRecord;
    }

    public void setParticipantPaymentTransaction(String participantPaymentTransaction) {
        this.participantPaymentTransaction = participantPaymentTransaction;
    }

    public String getParticipantPaymentTransaction() {
        return participantPaymentTransaction;
    }

    public void setParticipantAcquirerBankSettlementAccountStatement(String participantAcquirerBankSettlementAccountStatement) {
        this.participantAcquirerBankSettlementAccountStatement = participantAcquirerBankSettlementAccountStatement;
    }

    public String getParticipantAcquirerBankSettlementAccountStatement() {
        return participantAcquirerBankSettlementAccountStatement;
    }
}