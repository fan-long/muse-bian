/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Stock Lending and Repos. */
package org.museframework.bian.stolenandrep.dto.cr;

public class RepoTransaction extends org.museframework.bian.classes.RepoTransaction {
    /*A Classification value that distinguishes between business service transaction within Repo Transaction*/
    private String repoTransactionParameterType;

    /*A selected optional business service as subject matter of Repo Transaction*/
    private org.museframework.bian.classes.Service repoTransactionSelectedOption;

    /*The status of Repo Transaction*/
    private String repoTransactionStatus;

    /*A Classification value that specifies type of transaction for this  Repo Transaction*/
    private org.museframework.bian.enumerations.Repurchasetypevalues repoTransactionType;

    /*An unique reference to an item or an occurrence of Repo Transaction*/
    private org.museframework.bian.classes.RepoTransaction repoTransactionReference;

    /**/
    private org.museframework.bian.classes.RepurchaseAgreement repurchaseAgreementReference;

    /**/
    private String repurchaseAgreementInvolvedPartyReference;

    /**/
    private org.museframework.bian.enumerations.Repurchaseagreementinvolvementtypevalues repurchaseAgreementInvolvementType;

    /**/
    private org.museframework.bian.classes.RepoArrangement repurchaseArrangementReference;

    public void setRepoTransactionParameterType(String repoTransactionParameterType) {
        this.repoTransactionParameterType = repoTransactionParameterType;
    }

    public String getRepoTransactionParameterType() {
        return repoTransactionParameterType;
    }

    public void setRepoTransactionSelectedOption(org.museframework.bian.classes.Service repoTransactionSelectedOption) {
        this.repoTransactionSelectedOption = repoTransactionSelectedOption;
    }

    public org.museframework.bian.classes.Service getRepoTransactionSelectedOption() {
        return repoTransactionSelectedOption;
    }

    public void setRepoTransactionStatus(String repoTransactionStatus) {
        this.repoTransactionStatus = repoTransactionStatus;
    }

    public String getRepoTransactionStatus() {
        return repoTransactionStatus;
    }

    public void setRepoTransactionType(org.museframework.bian.enumerations.Repurchasetypevalues repoTransactionType) {
        this.repoTransactionType = repoTransactionType;
    }

    public org.museframework.bian.enumerations.Repurchasetypevalues getRepoTransactionType() {
        return repoTransactionType;
    }

    public void setRepoTransactionReference(org.museframework.bian.classes.RepoTransaction repoTransactionReference) {
        this.repoTransactionReference = repoTransactionReference;
    }

    public org.museframework.bian.classes.RepoTransaction getRepoTransactionReference() {
        return repoTransactionReference;
    }

    public void setRepurchaseAgreementReference(org.museframework.bian.classes.RepurchaseAgreement repurchaseAgreementReference) {
        this.repurchaseAgreementReference = repurchaseAgreementReference;
    }

    public org.museframework.bian.classes.RepurchaseAgreement getRepurchaseAgreementReference() {
        return repurchaseAgreementReference;
    }

    public void setRepurchaseAgreementInvolvedPartyReference(String repurchaseAgreementInvolvedPartyReference) {
        this.repurchaseAgreementInvolvedPartyReference = repurchaseAgreementInvolvedPartyReference;
    }

    public String getRepurchaseAgreementInvolvedPartyReference() {
        return repurchaseAgreementInvolvedPartyReference;
    }

    public void setRepurchaseAgreementInvolvementType(org.museframework.bian.enumerations.Repurchaseagreementinvolvementtypevalues repurchaseAgreementInvolvementType) {
        this.repurchaseAgreementInvolvementType = repurchaseAgreementInvolvementType;
    }

    public org.museframework.bian.enumerations.Repurchaseagreementinvolvementtypevalues getRepurchaseAgreementInvolvementType() {
        return repurchaseAgreementInvolvementType;
    }

    public void setRepurchaseArrangementReference(org.museframework.bian.classes.RepoArrangement repurchaseArrangementReference) {
        this.repurchaseArrangementReference = repurchaseArrangementReference;
    }

    public org.museframework.bian.classes.RepoArrangement getRepurchaseArrangementReference() {
        return repurchaseArrangementReference;
    }
}