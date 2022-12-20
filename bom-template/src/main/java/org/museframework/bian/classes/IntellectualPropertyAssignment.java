/*Handling the internal assignment and 3rd party licensing of the IP asse*/
package org.museframework.bian.classes;

public class IntellectualPropertyAssignment {
    /*The type of assignment (e.g. internal, external license)*/
    private String intellectualPropertyAssignmentType;

    /**/
    private String intellectualPropertyAssignmentDescription;

    /**/
    private String intellectualPropertyAssignmentDateTime;

    /**/
    private String intellectualPropertyAssignmentDocument;

    public void setIntellectualPropertyAssignmentType(String intellectualPropertyAssignmentType) {
        this.intellectualPropertyAssignmentType = intellectualPropertyAssignmentType;
    }

    public String getIntellectualPropertyAssignmentType() {
        return intellectualPropertyAssignmentType;
    }

    public void setIntellectualPropertyAssignmentDescription(String intellectualPropertyAssignmentDescription) {
        this.intellectualPropertyAssignmentDescription = intellectualPropertyAssignmentDescription;
    }

    public String getIntellectualPropertyAssignmentDescription() {
        return intellectualPropertyAssignmentDescription;
    }

    public void setIntellectualPropertyAssignmentDateTime(String intellectualPropertyAssignmentDateTime) {
        this.intellectualPropertyAssignmentDateTime = intellectualPropertyAssignmentDateTime;
    }

    public String getIntellectualPropertyAssignmentDateTime() {
        return intellectualPropertyAssignmentDateTime;
    }

    public void setIntellectualPropertyAssignmentDocument(String intellectualPropertyAssignmentDocument) {
        this.intellectualPropertyAssignmentDocument = intellectualPropertyAssignmentDocument;
    }

    public String getIntellectualPropertyAssignmentDocument() {
        return intellectualPropertyAssignmentDocument;
    }
}