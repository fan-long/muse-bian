/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.accountrecovery.dto.bq;

public class Negotiation {
    /*Defines bank's policies and guidelines for account recovery/write down handling*/
    private String accountRecoveryGuidelines;

    /*Reference to negotiation/confirmation messages sent to involved parties, includes internal and external legal/law enforcement authorities*/
    private org.museframework.bian.classes.Object correspondenceReference;

    /*Copies of correspondence content as appropriate*/
    private String correspondenceContent;

    /*Reference to legal documents created & referenced during the account recovery negotiation process*/
    private org.museframework.bian.classes.Object documentReference;

    /*Copies of document copy/content as appropriate*/
    private String documentContent;

    /*Processing record for the negotiation task within the account recovery process*/
    private String accountRecoveryCaseNegotiationTaskRecord;

    public void setAccountRecoveryGuidelines(String accountRecoveryGuidelines) {
        this.accountRecoveryGuidelines = accountRecoveryGuidelines;
    }

    public String getAccountRecoveryGuidelines() {
        return accountRecoveryGuidelines;
    }

    public void setCorrespondenceReference(org.museframework.bian.classes.Object correspondenceReference) {
        this.correspondenceReference = correspondenceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceReference() {
        return correspondenceReference;
    }

    public void setCorrespondenceContent(String correspondenceContent) {
        this.correspondenceContent = correspondenceContent;
    }

    public String getCorrespondenceContent() {
        return correspondenceContent;
    }

    public void setDocumentReference(org.museframework.bian.classes.Object documentReference) {
        this.documentReference = documentReference;
    }

    public org.museframework.bian.classes.Object getDocumentReference() {
        return documentReference;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setAccountRecoveryCaseNegotiationTaskRecord(String accountRecoveryCaseNegotiationTaskRecord) {
        this.accountRecoveryCaseNegotiationTaskRecord = accountRecoveryCaseNegotiationTaskRecord;
    }

    public String getAccountRecoveryCaseNegotiationTaskRecord() {
        return accountRecoveryCaseNegotiationTaskRecord;
    }
}