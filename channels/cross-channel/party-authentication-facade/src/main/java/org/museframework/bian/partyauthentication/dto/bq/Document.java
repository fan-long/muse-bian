/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

public class Document extends org.museframework.bian.classes.Document {
    /*Reference to the document and document type being presented for authentication*/
    private org.museframework.bian.classes.Object authenticationDocumentReference;

    /*The submitted document content in any appropriate format/media (e.g. scan)*/
    private String authenticationDocumentContent;

    /*The document reference for the authentication document*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The stored document - available in any suitable media for comparison*/
    private String documentContent;

    /*The result of comparing the presented document to the stored value*/
    private String authenticationDocumentComparisonTestResult;

    public void setAuthenticationDocumentReference(org.museframework.bian.classes.Object authenticationDocumentReference) {
        this.authenticationDocumentReference = authenticationDocumentReference;
    }

    public org.museframework.bian.classes.Object getAuthenticationDocumentReference() {
        return authenticationDocumentReference;
    }

    public void setAuthenticationDocumentContent(String authenticationDocumentContent) {
        this.authenticationDocumentContent = authenticationDocumentContent;
    }

    public String getAuthenticationDocumentContent() {
        return authenticationDocumentContent;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setAuthenticationDocumentComparisonTestResult(String authenticationDocumentComparisonTestResult) {
        this.authenticationDocumentComparisonTestResult = authenticationDocumentComparisonTestResult;
    }

    public String getAuthenticationDocumentComparisonTestResult() {
        return authenticationDocumentComparisonTestResult;
    }
}