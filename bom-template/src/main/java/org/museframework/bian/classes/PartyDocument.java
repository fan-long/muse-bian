/**/
package org.museframework.bian.classes;

public class PartyDocument {
    /**/
    private Party partyReference;

    /**/
    private Document documentReference;

    /**/
    private org.museframework.bian.enumerations.Partydocumenttypevalues partyDocumentType;

    public void setPartyReference(Party partyReference) {
        this.partyReference = partyReference;
    }

    public Party getPartyReference() {
        return partyReference;
    }

    public void setDocumentReference(Document documentReference) {
        this.documentReference = documentReference;
    }

    public Document getDocumentReference() {
        return documentReference;
    }

    public void setPartyDocumentType(org.museframework.bian.enumerations.Partydocumenttypevalues partyDocumentType) {
        this.partyDocumentType = partyDocumentType;
    }

    public org.museframework.bian.enumerations.Partydocumenttypevalues getPartyDocumentType() {
        return partyDocumentType;
    }
}