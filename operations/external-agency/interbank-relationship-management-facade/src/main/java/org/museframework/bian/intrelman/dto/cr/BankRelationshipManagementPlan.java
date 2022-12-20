/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Interbank Relationship Management.*/
package org.museframework.bian.intrelman.dto.cr;

public class BankRelationshipManagementPlan extends org.museframework.bian.classes.BankRelationshipManagementPlan {
    /*Reference to the associated bank*/
    private org.museframework.bian.classes.Object bankReference;

    /*Key features and details of the bank (e.g. business/segment profile)*/
    private String bankDetails;

    /*The assigned individual or business unit for the relationship*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The type of relationship with the bank (e.g. trading partner, joint venture partner)*/
    private String bankRelationshipType;

    /*A description of the relationship, outlining roles and expectations as appropriate*/
    private String bankRelationshipDescription;

    /*The target and actual budget covering expenditures and reciprocal business activity as appropriate*/
    private String bankRelationshipBudget;

    /*Defines the role and contact details for bank representatives*/
    private String bankContactDetails;

    public void setBankReference(org.museframework.bian.classes.Object bankReference) {
        this.bankReference = bankReference;
    }

    public org.museframework.bian.classes.Object getBankReference() {
        return bankReference;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setBankRelationshipType(String bankRelationshipType) {
        this.bankRelationshipType = bankRelationshipType;
    }

    public String getBankRelationshipType() {
        return bankRelationshipType;
    }

    public void setBankRelationshipDescription(String bankRelationshipDescription) {
        this.bankRelationshipDescription = bankRelationshipDescription;
    }

    public String getBankRelationshipDescription() {
        return bankRelationshipDescription;
    }

    public void setBankRelationshipBudget(String bankRelationshipBudget) {
        this.bankRelationshipBudget = bankRelationshipBudget;
    }

    public String getBankRelationshipBudget() {
        return bankRelationshipBudget;
    }

    public void setBankContactDetails(String bankContactDetails) {
        this.bankContactDetails = bankContactDetails;
    }

    public String getBankContactDetails() {
        return bankContactDetails;
    }
}