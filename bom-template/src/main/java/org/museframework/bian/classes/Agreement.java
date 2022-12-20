/*A formal or informal common understanding between two or more (legal competent) parties concerning one or more subject matters expressed in a set of arrangements, terms and conditions. (adapted from Legal System and FIBO) */
package org.museframework.bian.classes;

public class Agreement {
    /*Date on which the agreement was signed by all parties. (ISO20022)*/
    private String agreementSignedDate;

    /*Specifies the category of agreement. Agreement type is very often referred to product. But, the term product does not cover all kinds of agreements. An Agreement can be subtyped from the perspective of various aspects of interest. One can classify the agreement from the perspective of format type (e.g., verbal agreement, written agreement). Other one can classify agreement based on duration like short-term agreement or long-term agreement.*/
    private org.museframework.bian.enumerations.Agreementtypevalues agreementType;

    /*Period during which the agreement is valid
*/
    private String agreementValidityPeriod;

    /**/
    private String agreementVersion;

    /*A characteristic of agreement which refers to the LifecycleStatus of agreement (e.g., potential, offered, confirmed, completed, signed, terminated).*/
    private String agreementStatus;

    /**/
    private String agreementSubjectMatter;

    /*The identifier of agreement like Agreement Number, Contract Number, Contract Registration Number, etc. */
    private String agreementIdentification;

    /*A characteristic of agreement which refers to 1) LifecycleDate of agreement (e.g., SignedDate, TerminatedDate, FulfilledDate) OR 2) ArrangedDate of agreement (e.g., StartingDate, EndingDate, ValidityPeriod, EffectiveDate).*/
    private String agreementDate;

    public void setAgreementSignedDate(String agreementSignedDate) {
        this.agreementSignedDate = agreementSignedDate;
    }

    public String getAgreementSignedDate() {
        return agreementSignedDate;
    }

    public void setAgreementType(org.museframework.bian.enumerations.Agreementtypevalues agreementType) {
        this.agreementType = agreementType;
    }

    public org.museframework.bian.enumerations.Agreementtypevalues getAgreementType() {
        return agreementType;
    }

    public void setAgreementValidityPeriod(String agreementValidityPeriod) {
        this.agreementValidityPeriod = agreementValidityPeriod;
    }

    public String getAgreementValidityPeriod() {
        return agreementValidityPeriod;
    }

    public void setAgreementVersion(String agreementVersion) {
        this.agreementVersion = agreementVersion;
    }

    public String getAgreementVersion() {
        return agreementVersion;
    }

    public void setAgreementStatus(String agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    public String getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementSubjectMatter(String agreementSubjectMatter) {
        this.agreementSubjectMatter = agreementSubjectMatter;
    }

    public String getAgreementSubjectMatter() {
        return agreementSubjectMatter;
    }

    public void setAgreementIdentification(String agreementIdentification) {
        this.agreementIdentification = agreementIdentification;
    }

    public String getAgreementIdentification() {
        return agreementIdentification;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getAgreementDate() {
        return agreementDate;
    }
}