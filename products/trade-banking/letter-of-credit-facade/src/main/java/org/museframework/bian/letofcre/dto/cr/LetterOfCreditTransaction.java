/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Letter of Credit. */
package org.museframework.bian.letofcre.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.LetterOfCreditTransaction
@MetaDto
public class LetterOfCreditTransaction {
    /*A Classification value that distinguishes between business service transaction within Letter Of Credit Transaction*/
    @MetaField
    private String letterOfCreditTransactionParameterType;

    /*A selected optional business service as subject matter of Letter Of Credit Transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Service letterOfCreditTransactionSelectedOption;

    /*The status of Letter Of Credit Transaction*/
    @MetaField
    private String letterOfCreditTransactionStatus;

    /*A Classification value that specifies type of transaction for this  Letter Of Credit Transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Letterofcredittransactiontypevalues letterOfCreditTransactionType;

    /*An unique reference to an item or an occurrence of Letter Of Credit Transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LetterOfCreditTransaction letterOfCreditTransactionReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Document letterOfCreditDocumentReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LetterOfCreditAgreement letterOfCreditAgreementReference;

    /**/
    @MetaField
    private String letterOfCreditInvolvedPartyReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Letterofcreditinvolvementtypevalues letterOfCreditInvolvementType;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LetterOfCreditArrangement letterOfCreditArrangementReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LetterOfCredit letterofCreditFInancialInstrumentReference;

    public void setLetterOfCreditTransactionParameterType(String letterOfCreditTransactionParameterType) {
        this.letterOfCreditTransactionParameterType = letterOfCreditTransactionParameterType;
    }

    public String getLetterOfCreditTransactionParameterType() {
        return letterOfCreditTransactionParameterType;
    }

    public void setLetterOfCreditTransactionSelectedOption(org.museframework.bian.classes.Service letterOfCreditTransactionSelectedOption) {
        this.letterOfCreditTransactionSelectedOption = letterOfCreditTransactionSelectedOption;
    }

    public org.museframework.bian.classes.Service getLetterOfCreditTransactionSelectedOption() {
        return letterOfCreditTransactionSelectedOption;
    }

    public void setLetterOfCreditTransactionStatus(String letterOfCreditTransactionStatus) {
        this.letterOfCreditTransactionStatus = letterOfCreditTransactionStatus;
    }

    public String getLetterOfCreditTransactionStatus() {
        return letterOfCreditTransactionStatus;
    }

    public void setLetterOfCreditTransactionType(org.museframework.bian.enumerations.Letterofcredittransactiontypevalues letterOfCreditTransactionType) {
        this.letterOfCreditTransactionType = letterOfCreditTransactionType;
    }

    public org.museframework.bian.enumerations.Letterofcredittransactiontypevalues getLetterOfCreditTransactionType() {
        return letterOfCreditTransactionType;
    }

    public void setLetterOfCreditTransactionReference(org.museframework.bian.classes.LetterOfCreditTransaction letterOfCreditTransactionReference) {
        this.letterOfCreditTransactionReference = letterOfCreditTransactionReference;
    }

    public org.museframework.bian.classes.LetterOfCreditTransaction getLetterOfCreditTransactionReference() {
        return letterOfCreditTransactionReference;
    }

    public void setLetterOfCreditDocumentReference(org.museframework.bian.classes.Document letterOfCreditDocumentReference) {
        this.letterOfCreditDocumentReference = letterOfCreditDocumentReference;
    }

    public org.museframework.bian.classes.Document getLetterOfCreditDocumentReference() {
        return letterOfCreditDocumentReference;
    }

    public void setLetterOfCreditAgreementReference(org.museframework.bian.classes.LetterOfCreditAgreement letterOfCreditAgreementReference) {
        this.letterOfCreditAgreementReference = letterOfCreditAgreementReference;
    }

    public org.museframework.bian.classes.LetterOfCreditAgreement getLetterOfCreditAgreementReference() {
        return letterOfCreditAgreementReference;
    }

    public void setLetterOfCreditInvolvedPartyReference(String letterOfCreditInvolvedPartyReference) {
        this.letterOfCreditInvolvedPartyReference = letterOfCreditInvolvedPartyReference;
    }

    public String getLetterOfCreditInvolvedPartyReference() {
        return letterOfCreditInvolvedPartyReference;
    }

    public void setLetterOfCreditInvolvementType(org.museframework.bian.enumerations.Letterofcreditinvolvementtypevalues letterOfCreditInvolvementType) {
        this.letterOfCreditInvolvementType = letterOfCreditInvolvementType;
    }

    public org.museframework.bian.enumerations.Letterofcreditinvolvementtypevalues getLetterOfCreditInvolvementType() {
        return letterOfCreditInvolvementType;
    }

    public void setLetterOfCreditArrangementReference(org.museframework.bian.classes.LetterOfCreditArrangement letterOfCreditArrangementReference) {
        this.letterOfCreditArrangementReference = letterOfCreditArrangementReference;
    }

    public org.museframework.bian.classes.LetterOfCreditArrangement getLetterOfCreditArrangementReference() {
        return letterOfCreditArrangementReference;
    }

    public void setLetterofCreditFInancialInstrumentReference(org.museframework.bian.classes.LetterOfCredit letterofCreditFInancialInstrumentReference) {
        this.letterofCreditFInancialInstrumentReference = letterofCreditFInancialInstrumentReference;
    }

    public org.museframework.bian.classes.LetterOfCredit getLetterofCreditFInancialInstrumentReference() {
        return letterofCreditFInancialInstrumentReference;
    }
}