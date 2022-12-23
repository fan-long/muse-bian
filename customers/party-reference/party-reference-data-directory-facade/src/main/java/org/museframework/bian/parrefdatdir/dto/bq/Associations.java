/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.parrefdatdir.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Associations {
    /*Reference to a contact at the customer's employer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeReference;

    /*Associated individuals of interest*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object associateReference;

    /*The type of association with the customer (e.g. familial or corporate, includes household associations, for corporations allowed users/buyers)*/
    @MetaField
    private String associateType;

    /*Description of the rights or obligations granted to the associate*/
    @MetaField
    private String associateObligationDependencyDescription;

    /*The start and end dates for the association if appropriate*/
    @MetaField
    private String associationValidFromToDate;

    /*Reference to a product or service where the association is linked in some manner (e.g. guarantor)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to individuals with specific representation rights (e.g. a lawyer with power of attorney)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object proxyRepresentativePowerofAttorneyReference;

    public void setEmployeeReference(org.museframework.bian.classes.Object employeeReference) {
        this.employeeReference = employeeReference;
    }

    public org.museframework.bian.classes.Object getEmployeeReference() {
        return employeeReference;
    }

    public void setAssociateReference(org.museframework.bian.classes.Object associateReference) {
        this.associateReference = associateReference;
    }

    public org.museframework.bian.classes.Object getAssociateReference() {
        return associateReference;
    }

    public void setAssociateType(String associateType) {
        this.associateType = associateType;
    }

    public String getAssociateType() {
        return associateType;
    }

    public void setAssociateObligationDependencyDescription(String associateObligationDependencyDescription) {
        this.associateObligationDependencyDescription = associateObligationDependencyDescription;
    }

    public String getAssociateObligationDependencyDescription() {
        return associateObligationDependencyDescription;
    }

    public void setAssociationValidFromToDate(String associationValidFromToDate) {
        this.associationValidFromToDate = associationValidFromToDate;
    }

    public String getAssociationValidFromToDate() {
        return associationValidFromToDate;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProxyRepresentativePowerofAttorneyReference(org.museframework.bian.classes.Object proxyRepresentativePowerofAttorneyReference) {
        this.proxyRepresentativePowerofAttorneyReference = proxyRepresentativePowerofAttorneyReference;
    }

    public org.museframework.bian.classes.Object getProxyRepresentativePowerofAttorneyReference() {
        return proxyRepresentativePowerofAttorneyReference;
    }
}