/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.parroupro.dto.bq;

public class Alert {
    /*Defines the type of alert (e.g. detected potential fraud)*/
    private String customerRelationshipAlertType;

    /*The maintained alert value (historical values may be retained as appropriate)*/
    private String customerRelationshipAlert;

    /*Explanation/description for given alert value if necessary*/
    private String customerRelationshipAlertNarrative;

    /*Indication when the alert value is updated and time until given value applies/is relevant as appropriate*/
    private String customerRelationshipAlertValidFromToDate;

    public void setCustomerRelationshipAlertType(String customerRelationshipAlertType) {
        this.customerRelationshipAlertType = customerRelationshipAlertType;
    }

    public String getCustomerRelationshipAlertType() {
        return customerRelationshipAlertType;
    }

    public void setCustomerRelationshipAlert(String customerRelationshipAlert) {
        this.customerRelationshipAlert = customerRelationshipAlert;
    }

    public String getCustomerRelationshipAlert() {
        return customerRelationshipAlert;
    }

    public void setCustomerRelationshipAlertNarrative(String customerRelationshipAlertNarrative) {
        this.customerRelationshipAlertNarrative = customerRelationshipAlertNarrative;
    }

    public String getCustomerRelationshipAlertNarrative() {
        return customerRelationshipAlertNarrative;
    }

    public void setCustomerRelationshipAlertValidFromToDate(String customerRelationshipAlertValidFromToDate) {
        this.customerRelationshipAlertValidFromToDate = customerRelationshipAlertValidFromToDate;
    }

    public String getCustomerRelationshipAlertValidFromToDate() {
        return customerRelationshipAlertValidFromToDate;
    }
}