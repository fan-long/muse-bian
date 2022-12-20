/*A specific role of a specific Party in the specific Customer Relationship.*/
package org.museframework.bian.classes;

public class CustomerRelationshipInvolvement {
    /*A Functional Classification Hierarchy that distinguishes between roles/responsibilities involved in the customer relationship like Customer, Supplier/Bank, the relationship manager. */
    private org.museframework.bian.enumerations.Customerrelationshipinvolvementtypevalues customerRelationshipInvolvementType;

    public void setCustomerRelationshipInvolvementType(org.museframework.bian.enumerations.Customerrelationshipinvolvementtypevalues customerRelationshipInvolvementType) {
        this.customerRelationshipInvolvementType = customerRelationshipInvolvementType;
    }

    public org.museframework.bian.enumerations.Customerrelationshipinvolvementtypevalues getCustomerRelationshipInvolvementType() {
        return customerRelationshipInvolvementType;
    }
}