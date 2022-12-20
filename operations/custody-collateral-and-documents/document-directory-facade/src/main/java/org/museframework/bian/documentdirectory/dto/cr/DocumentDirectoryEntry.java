/*Capture and maintain reference information about some type of entitity within Document Library.*/
package org.museframework.bian.documentdirectory.dto.cr;

public class DocumentDirectoryEntry extends org.museframework.bian.classes.DocumentDirectoryEntry {
    /*Descriptive name of the document*/
    private String documentName;

    /*Location  within the bank  where the original document is created/captured*/
    private org.museframework.bian.classes.Object locationReference;

    /*Reference of unit or employee responsible for creating or capturing the original*/
    private org.museframework.bian.classes.Object businessUnitEmployeeReference;

    /*Reference to the associated product or service*/
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Reference to the associated product or service activity (clarifies why the document was captured)*/
    private org.museframework.bian.classes.Object productandServiceActionReference;

    /*The creation date of the original document*/
    private String documentCreationDate;

    /*Date the document was first created/captured at the bank (can be the same as creation date for bank generated documents)*/
    private String documentCaptureDateTime;

    /*General description of the type and outline content of the document*/
    private String documentTypeDescription;

    /*Retrievable document content in any suitable media and format*/
    private String documentContent;

    /*Tracks the movements of the document, from the original request for submission, through reference and access and eventual archiving*/
    private String documentProvisioningHistory;

    /*Details of the request to a holding party to provide access to a document*/
    private String documentProvisioningRequest;

    /*The planned and actual schedule for receipt and return as appropriate, including any time limits or deadlines*/
    private String documentProvisioningSchedule;

    /*The result of the provisioning action (e.g. document received, document not provided in time)*/
    private String documentProvisioningResult;

    /*Maintains links to earlier versions for a document with a replacement cycle*/
    private String documentVersionHistory;

    /*The version with overview as needed*/
    private String documentVersion;

    /*The valid from-to dates for the version*/
    private String documentVersionDate;

    /*Tracks any verification tasks performed against the document*/
    private String documentVerificationHistory;

    /*A description of the actions taken to verify the document*/
    private String documentVerificationTaskDescription;

    /*Reference to an external agency used to perform a verification service*/
    private org.museframework.bian.classes.Object documentVerificationServiceProviderReference;

    /*The outcome of the verification assessment*/
    private String documentVerificationTaskResult;

    /*Tracks any amendments or corrections made to the document*/
    private String documentAmendmentHistory;

    /*Description of the amendment and the reason for the correction or change*/
    private String documentAmendmentDescription;

    /*The outcome of the amendment in terms of changes made*/
    private String documentAmendmentResult;

    /*Maintains an update log for a document with allowed updates*/
    private String documentUpdateHistory;

    /*Description of the update and reason for the change*/
    private String documentUpdateDescription;

    /*The outcome of the update in terms of changes made*/
    private String documentUpdateResult;

    /*Maintains a log of the physical and electronic archiving of a document including retrieval activity as appropriate*/
    private String documentArchivingHistory;

    /*Details of an action to archive or retrieve a document*/
    private String documentArchivingAction;

    /*The archive storage reference for a document*/
    private org.museframework.bian.classes.Object documentArchiveReference;

    /*The available media and format for storing and retrieving the document*/
    private String documentMediaFormat;

    /*Reference to associated parties  (e.g. source, custodian, subject, owner)*/
    private org.museframework.bian.classes.Object documentSubjectReference;

    /*Tracked location of the physical document master version and any copies*/
    private String documentLocation;

    /*The status of the document  (e.g. on-file, authenticated, archived)*/
    private String documentStatus;

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setLocationReference(org.museframework.bian.classes.Object locationReference) {
        this.locationReference = locationReference;
    }

    public org.museframework.bian.classes.Object getLocationReference() {
        return locationReference;
    }

    public void setBusinessUnitEmployeeReference(org.museframework.bian.classes.Object businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setProductandServiceReference(org.museframework.bian.classes.Object productandServiceReference) {
        this.productandServiceReference = productandServiceReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceReference() {
        return productandServiceReference;
    }

    public void setProductandServiceActionReference(org.museframework.bian.classes.Object productandServiceActionReference) {
        this.productandServiceActionReference = productandServiceActionReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceActionReference() {
        return productandServiceActionReference;
    }

    public void setDocumentCreationDate(String documentCreationDate) {
        this.documentCreationDate = documentCreationDate;
    }

    public String getDocumentCreationDate() {
        return documentCreationDate;
    }

    public void setDocumentCaptureDateTime(String documentCaptureDateTime) {
        this.documentCaptureDateTime = documentCaptureDateTime;
    }

    public String getDocumentCaptureDateTime() {
        return documentCaptureDateTime;
    }

    public void setDocumentTypeDescription(String documentTypeDescription) {
        this.documentTypeDescription = documentTypeDescription;
    }

    public String getDocumentTypeDescription() {
        return documentTypeDescription;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentProvisioningHistory(String documentProvisioningHistory) {
        this.documentProvisioningHistory = documentProvisioningHistory;
    }

    public String getDocumentProvisioningHistory() {
        return documentProvisioningHistory;
    }

    public void setDocumentProvisioningRequest(String documentProvisioningRequest) {
        this.documentProvisioningRequest = documentProvisioningRequest;
    }

    public String getDocumentProvisioningRequest() {
        return documentProvisioningRequest;
    }

    public void setDocumentProvisioningSchedule(String documentProvisioningSchedule) {
        this.documentProvisioningSchedule = documentProvisioningSchedule;
    }

    public String getDocumentProvisioningSchedule() {
        return documentProvisioningSchedule;
    }

    public void setDocumentProvisioningResult(String documentProvisioningResult) {
        this.documentProvisioningResult = documentProvisioningResult;
    }

    public String getDocumentProvisioningResult() {
        return documentProvisioningResult;
    }

    public void setDocumentVersionHistory(String documentVersionHistory) {
        this.documentVersionHistory = documentVersionHistory;
    }

    public String getDocumentVersionHistory() {
        return documentVersionHistory;
    }

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    public String getDocumentVersion() {
        return documentVersion;
    }

    public void setDocumentVersionDate(String documentVersionDate) {
        this.documentVersionDate = documentVersionDate;
    }

    public String getDocumentVersionDate() {
        return documentVersionDate;
    }

    public void setDocumentVerificationHistory(String documentVerificationHistory) {
        this.documentVerificationHistory = documentVerificationHistory;
    }

    public String getDocumentVerificationHistory() {
        return documentVerificationHistory;
    }

    public void setDocumentVerificationTaskDescription(String documentVerificationTaskDescription) {
        this.documentVerificationTaskDescription = documentVerificationTaskDescription;
    }

    public String getDocumentVerificationTaskDescription() {
        return documentVerificationTaskDescription;
    }

    public void setDocumentVerificationServiceProviderReference(org.museframework.bian.classes.Object documentVerificationServiceProviderReference) {
        this.documentVerificationServiceProviderReference = documentVerificationServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getDocumentVerificationServiceProviderReference() {
        return documentVerificationServiceProviderReference;
    }

    public void setDocumentVerificationTaskResult(String documentVerificationTaskResult) {
        this.documentVerificationTaskResult = documentVerificationTaskResult;
    }

    public String getDocumentVerificationTaskResult() {
        return documentVerificationTaskResult;
    }

    public void setDocumentAmendmentHistory(String documentAmendmentHistory) {
        this.documentAmendmentHistory = documentAmendmentHistory;
    }

    public String getDocumentAmendmentHistory() {
        return documentAmendmentHistory;
    }

    public void setDocumentAmendmentDescription(String documentAmendmentDescription) {
        this.documentAmendmentDescription = documentAmendmentDescription;
    }

    public String getDocumentAmendmentDescription() {
        return documentAmendmentDescription;
    }

    public void setDocumentAmendmentResult(String documentAmendmentResult) {
        this.documentAmendmentResult = documentAmendmentResult;
    }

    public String getDocumentAmendmentResult() {
        return documentAmendmentResult;
    }

    public void setDocumentUpdateHistory(String documentUpdateHistory) {
        this.documentUpdateHistory = documentUpdateHistory;
    }

    public String getDocumentUpdateHistory() {
        return documentUpdateHistory;
    }

    public void setDocumentUpdateDescription(String documentUpdateDescription) {
        this.documentUpdateDescription = documentUpdateDescription;
    }

    public String getDocumentUpdateDescription() {
        return documentUpdateDescription;
    }

    public void setDocumentUpdateResult(String documentUpdateResult) {
        this.documentUpdateResult = documentUpdateResult;
    }

    public String getDocumentUpdateResult() {
        return documentUpdateResult;
    }

    public void setDocumentArchivingHistory(String documentArchivingHistory) {
        this.documentArchivingHistory = documentArchivingHistory;
    }

    public String getDocumentArchivingHistory() {
        return documentArchivingHistory;
    }

    public void setDocumentArchivingAction(String documentArchivingAction) {
        this.documentArchivingAction = documentArchivingAction;
    }

    public String getDocumentArchivingAction() {
        return documentArchivingAction;
    }

    public void setDocumentArchiveReference(org.museframework.bian.classes.Object documentArchiveReference) {
        this.documentArchiveReference = documentArchiveReference;
    }

    public org.museframework.bian.classes.Object getDocumentArchiveReference() {
        return documentArchiveReference;
    }

    public void setDocumentMediaFormat(String documentMediaFormat) {
        this.documentMediaFormat = documentMediaFormat;
    }

    public String getDocumentMediaFormat() {
        return documentMediaFormat;
    }

    public void setDocumentSubjectReference(org.museframework.bian.classes.Object documentSubjectReference) {
        this.documentSubjectReference = documentSubjectReference;
    }

    public org.museframework.bian.classes.Object getDocumentSubjectReference() {
        return documentSubjectReference;
    }

    public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation;
    }

    public String getDocumentLocation() {
        return documentLocation;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }
}