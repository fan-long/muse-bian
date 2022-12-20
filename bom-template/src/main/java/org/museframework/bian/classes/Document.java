/*Something tangible that records something, such as a recording or a photograph, or a writing that can be used to furnish evidence or information (FIBO)

Definition: A physical or digital representation of something meaningful to the audience.

Comment: 
1.Technical: Manuals, instructions, tutorials, procedures, specifications, etc., that accompany a piece of equipment or software, and provide guidance for its proper use and maintenance.
2.Trading: Preparation of a set of commercial and financial documents that record or support a business transaction. International trade documentations include air waybill, bill of exchange, bill of lading, certificate of inspection, certificate of insurance, certificate of origin, commercial invoice, and consular invoice.


Read more: http://www.businessdictionary.com/definition/documentation.html#ixzz3EQGRGC4W
*/
package org.museframework.bian.classes;

public class Document {
    /*An identifier that allows to uniquely refer to an instance of a Document.*/
    private String documentIdentifer;

    /**/
    private String documentVersion;

    /*Specifies the type of the document, for example commercial invoice. (ISO20022)*/
    private org.museframework.bian.enumerations.Financialdocumenttypevalues documentType;

    /*Status of the document (e.g. delivered, paid, etc.). ISO20022*/
    private String documentStatus;

    /**/
    private String documentDateTime;

    /**/
    private String documentName;

    /**/
    private org.museframework.bian.enumerations.Documentdatetimetypevalues documentDateTimeType;

    /*Specifies the function of the document. (ISO20022)*/
    private String documentPurpose;

    /**/
    private String documentFormat;

    /**/
    private String documentSubject;

    /**/
    private String documentDescription;

    /**/
    private String documentValidityPeriod;

    public void setDocumentIdentifer(String documentIdentifer) {
        this.documentIdentifer = documentIdentifer;
    }

    public String getDocumentIdentifer() {
        return documentIdentifer;
    }

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    public String getDocumentVersion() {
        return documentVersion;
    }

    public void setDocumentType(org.museframework.bian.enumerations.Financialdocumenttypevalues documentType) {
        this.documentType = documentType;
    }

    public org.museframework.bian.enumerations.Financialdocumenttypevalues getDocumentType() {
        return documentType;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    public String getDocumentDateTime() {
        return documentDateTime;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentDateTimeType(org.museframework.bian.enumerations.Documentdatetimetypevalues documentDateTimeType) {
        this.documentDateTimeType = documentDateTimeType;
    }

    public org.museframework.bian.enumerations.Documentdatetimetypevalues getDocumentDateTimeType() {
        return documentDateTimeType;
    }

    public void setDocumentPurpose(String documentPurpose) {
        this.documentPurpose = documentPurpose;
    }

    public String getDocumentPurpose() {
        return documentPurpose;
    }

    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    public String getDocumentFormat() {
        return documentFormat;
    }

    public void setDocumentSubject(String documentSubject) {
        this.documentSubject = documentSubject;
    }

    public String getDocumentSubject() {
        return documentSubject;
    }

    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    public String getDocumentDescription() {
        return documentDescription;
    }

    public void setDocumentValidityPeriod(String documentValidityPeriod) {
        this.documentValidityPeriod = documentValidityPeriod;
    }

    public String getDocumentValidityPeriod() {
        return documentValidityPeriod;
    }
}