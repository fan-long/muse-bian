/*An operational service or function supported within the Document Capture Function for doing Document Capture Function*/
package org.museframework.bian.archiveservices.dto.bq;

public class DocumentRetrievalFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    private String schedule;

    /*The Document Retrieval Function specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Document Retrieval Function*/
    private org.museframework.bian.classes.Session archiveOperatingSessionReference;

    /*Reference to Document Retrieval Function*/
    private org.museframework.bian.classes.Function documentRetrievalFunctionReference;

    /*The type of Document Retrieval Function*/
    private String documentRetrievalFunctionType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setArchiveOperatingSessionReference(org.museframework.bian.classes.Session archiveOperatingSessionReference) {
        this.archiveOperatingSessionReference = archiveOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getArchiveOperatingSessionReference() {
        return archiveOperatingSessionReference;
    }

    public void setDocumentRetrievalFunctionReference(org.museframework.bian.classes.Function documentRetrievalFunctionReference) {
        this.documentRetrievalFunctionReference = documentRetrievalFunctionReference;
    }

    public org.museframework.bian.classes.Function getDocumentRetrievalFunctionReference() {
        return documentRetrievalFunctionReference;
    }

    public void setDocumentRetrievalFunctionType(String documentRetrievalFunctionType) {
        this.documentRetrievalFunctionType = documentRetrievalFunctionType;
    }

    public String getDocumentRetrievalFunctionType() {
        return documentRetrievalFunctionType;
    }
}