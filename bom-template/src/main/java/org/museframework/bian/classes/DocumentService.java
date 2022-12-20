/*A service for Verification, Amendment, Update, Archiving of document. */
package org.museframework.bian.classes;

public class DocumentService {
    /**/
    private org.museframework.bian.enumerations.Documentservicetypevalues documentServiceType;

    /*The planned and actual schedule for a document service, including any time limits or deadlines*/
    private String documentServiceSchedule;

    /*An external agency used to perform a document service*/
    private Party documentServiceProvider;

    /**/
    private String documentServiceName;

    /**/
    private String documentServiceDescription;

    /**/
    private String documentServiceOutcome;

    /**/
    private Instruction documentServiceRequest;

    /**/
    private Function documentServiceFunction;

    public void setDocumentServiceType(org.museframework.bian.enumerations.Documentservicetypevalues documentServiceType) {
        this.documentServiceType = documentServiceType;
    }

    public org.museframework.bian.enumerations.Documentservicetypevalues getDocumentServiceType() {
        return documentServiceType;
    }

    public void setDocumentServiceSchedule(String documentServiceSchedule) {
        this.documentServiceSchedule = documentServiceSchedule;
    }

    public String getDocumentServiceSchedule() {
        return documentServiceSchedule;
    }

    public void setDocumentServiceProvider(Party documentServiceProvider) {
        this.documentServiceProvider = documentServiceProvider;
    }

    public Party getDocumentServiceProvider() {
        return documentServiceProvider;
    }

    public void setDocumentServiceName(String documentServiceName) {
        this.documentServiceName = documentServiceName;
    }

    public String getDocumentServiceName() {
        return documentServiceName;
    }

    public void setDocumentServiceDescription(String documentServiceDescription) {
        this.documentServiceDescription = documentServiceDescription;
    }

    public String getDocumentServiceDescription() {
        return documentServiceDescription;
    }

    public void setDocumentServiceOutcome(String documentServiceOutcome) {
        this.documentServiceOutcome = documentServiceOutcome;
    }

    public String getDocumentServiceOutcome() {
        return documentServiceOutcome;
    }

    public void setDocumentServiceRequest(Instruction documentServiceRequest) {
        this.documentServiceRequest = documentServiceRequest;
    }

    public Instruction getDocumentServiceRequest() {
        return documentServiceRequest;
    }

    public void setDocumentServiceFunction(Function documentServiceFunction) {
        this.documentServiceFunction = documentServiceFunction;
    }

    public Function getDocumentServiceFunction() {
        return documentServiceFunction;
    }
}