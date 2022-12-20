/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Bank Drafts. */
package org.museframework.bian.bankdrafts.dto.cr;

public class BearerDocumentTransaction {
    /*A Classification value that distinguishes between business service transaction within Bearer Document Transaction*/
    private String bearerDocumentTransactionParameterType;

    /*A selected optional business service as subject matter of Bearer Document Transaction*/
    private org.museframework.bian.classes.Service bearerDocumentTransactionSelectedOption;

    /*The status of Bearer Document Transaction*/
    private String bearerDocumentTransactionStatus;

    /*An unique reference to an item or an occurrence of Bearer Document Transaction*/
    private org.museframework.bian.classes.Transaction bearerDocumentTransactionReference;

    /**/
    private org.museframework.bian.classes.Document bearerDocumentReference;

    /**/
    private org.museframework.bian.classes.PaymentInstruction bearerDocumentInstructionReference;

    /**/
    private String bearerDocumentInvolvedPartyReference;

    public void setBearerDocumentTransactionParameterType(String bearerDocumentTransactionParameterType) {
        this.bearerDocumentTransactionParameterType = bearerDocumentTransactionParameterType;
    }

    public String getBearerDocumentTransactionParameterType() {
        return bearerDocumentTransactionParameterType;
    }

    public void setBearerDocumentTransactionSelectedOption(org.museframework.bian.classes.Service bearerDocumentTransactionSelectedOption) {
        this.bearerDocumentTransactionSelectedOption = bearerDocumentTransactionSelectedOption;
    }

    public org.museframework.bian.classes.Service getBearerDocumentTransactionSelectedOption() {
        return bearerDocumentTransactionSelectedOption;
    }

    public void setBearerDocumentTransactionStatus(String bearerDocumentTransactionStatus) {
        this.bearerDocumentTransactionStatus = bearerDocumentTransactionStatus;
    }

    public String getBearerDocumentTransactionStatus() {
        return bearerDocumentTransactionStatus;
    }

    public void setBearerDocumentTransactionReference(org.museframework.bian.classes.Transaction bearerDocumentTransactionReference) {
        this.bearerDocumentTransactionReference = bearerDocumentTransactionReference;
    }

    public org.museframework.bian.classes.Transaction getBearerDocumentTransactionReference() {
        return bearerDocumentTransactionReference;
    }

    public void setBearerDocumentReference(org.museframework.bian.classes.Document bearerDocumentReference) {
        this.bearerDocumentReference = bearerDocumentReference;
    }

    public org.museframework.bian.classes.Document getBearerDocumentReference() {
        return bearerDocumentReference;
    }

    public void setBearerDocumentInstructionReference(org.museframework.bian.classes.PaymentInstruction bearerDocumentInstructionReference) {
        this.bearerDocumentInstructionReference = bearerDocumentInstructionReference;
    }

    public org.museframework.bian.classes.PaymentInstruction getBearerDocumentInstructionReference() {
        return bearerDocumentInstructionReference;
    }

    public void setBearerDocumentInvolvedPartyReference(String bearerDocumentInvolvedPartyReference) {
        this.bearerDocumentInvolvedPartyReference = bearerDocumentInvolvedPartyReference;
    }

    public String getBearerDocumentInvolvedPartyReference() {
        return bearerDocumentInvolvedPartyReference;
    }
}