/*the status of the customer relationship (e.g. account in distress, retention candidate, campaign eligible, sales target, over-sold relationship)*/
package org.museframework.bian.classes;

public class CustomerRelationshipStatus {
    /**/
    private String customerRelationshipStatusType;

    /**/
    private String customerRelationshipStatusDescription;

    /**/
    private String customerRelationshipStatusValue;

    /**/
    private String customerRelationshipStatusValidityPeriod;

    public void setCustomerRelationshipStatusType(String customerRelationshipStatusType) {
        this.customerRelationshipStatusType = customerRelationshipStatusType;
    }

    public String getCustomerRelationshipStatusType() {
        return customerRelationshipStatusType;
    }

    public void setCustomerRelationshipStatusDescription(String customerRelationshipStatusDescription) {
        this.customerRelationshipStatusDescription = customerRelationshipStatusDescription;
    }

    public String getCustomerRelationshipStatusDescription() {
        return customerRelationshipStatusDescription;
    }

    public void setCustomerRelationshipStatusValue(String customerRelationshipStatusValue) {
        this.customerRelationshipStatusValue = customerRelationshipStatusValue;
    }

    public String getCustomerRelationshipStatusValue() {
        return customerRelationshipStatusValue;
    }

    public void setCustomerRelationshipStatusValidityPeriod(String customerRelationshipStatusValidityPeriod) {
        this.customerRelationshipStatusValidityPeriod = customerRelationshipStatusValidityPeriod;
    }

    public String getCustomerRelationshipStatusValidityPeriod() {
        return customerRelationshipStatusValidityPeriod;
    }
}