/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cusrelman.dto.bq;

public class Incident {
    /*Record of an incident*/
    private String relationshipIncidentRecord;

    /*Reference to involved employees in the original incident or the resolution as appropriate*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Production activity and transaction records relating to the incident*/
    private org.museframework.bian.classes.Object productandServiceActivityReference;

    /*The type of incident (e.g. product error, servicing issue)*/
    private String customerIncidentType;

    /*Description of the incident in whatever form appropriate*/
    private String customerIncidentDescription;

    /*Narrative of the resolution actions made or committed*/
    private String customerIncidentResolution;

    public void setRelationshipIncidentRecord(String relationshipIncidentRecord) {
        this.relationshipIncidentRecord = relationshipIncidentRecord;
    }

    public String getRelationshipIncidentRecord() {
        return relationshipIncidentRecord;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setProductandServiceActivityReference(org.museframework.bian.classes.Object productandServiceActivityReference) {
        this.productandServiceActivityReference = productandServiceActivityReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceActivityReference() {
        return productandServiceActivityReference;
    }

    public void setCustomerIncidentType(String customerIncidentType) {
        this.customerIncidentType = customerIncidentType;
    }

    public String getCustomerIncidentType() {
        return customerIncidentType;
    }

    public void setCustomerIncidentDescription(String customerIncidentDescription) {
        this.customerIncidentDescription = customerIncidentDescription;
    }

    public String getCustomerIncidentDescription() {
        return customerIncidentDescription;
    }

    public void setCustomerIncidentResolution(String customerIncidentResolution) {
        this.customerIncidentResolution = customerIncidentResolution;
    }

    public String getCustomerIncidentResolution() {
        return customerIncidentResolution;
    }
}