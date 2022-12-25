/*Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.enterprisearchitecture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Organization {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(0)
    private String organizationPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(0)
    private String organizationSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(0)
    private String organizationVersionNumber;

    /*The Business Architecture Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService organizationalModel;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String organizationalModelServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String organizationalModelServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String organizationalModelServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String organizationalModelServiceWorkProduct;

    /**/
    @MetaField(0)
    private String organizationalModelServiceName;

    public void setOrganizationPreconditions(String organizationPreconditions) {
        this.organizationPreconditions = organizationPreconditions;
    }

    public String getOrganizationPreconditions() {
        return organizationPreconditions;
    }

    public void setOrganizationSpecificationSchedule(String organizationSpecificationSchedule) {
        this.organizationSpecificationSchedule = organizationSpecificationSchedule;
    }

    public String getOrganizationSpecificationSchedule() {
        return organizationSpecificationSchedule;
    }

    public void setOrganizationVersionNumber(String organizationVersionNumber) {
        this.organizationVersionNumber = organizationVersionNumber;
    }

    public String getOrganizationVersionNumber() {
        return organizationVersionNumber;
    }

    public void setOrganizationalModel(org.museframework.bian.classes.BusinessService organizationalModel) {
        this.organizationalModel = organizationalModel;
    }

    public org.museframework.bian.classes.BusinessService getOrganizationalModel() {
        return organizationalModel;
    }

    public void setOrganizationalModelServiceType(String organizationalModelServiceType) {
        this.organizationalModelServiceType = organizationalModelServiceType;
    }

    public String getOrganizationalModelServiceType() {
        return organizationalModelServiceType;
    }

    public void setOrganizationalModelServiceDescription(String organizationalModelServiceDescription) {
        this.organizationalModelServiceDescription = organizationalModelServiceDescription;
    }

    public String getOrganizationalModelServiceDescription() {
        return organizationalModelServiceDescription;
    }

    public void setOrganizationalModelServiceInputsandOuputs(String organizationalModelServiceInputsandOuputs) {
        this.organizationalModelServiceInputsandOuputs = organizationalModelServiceInputsandOuputs;
    }

    public String getOrganizationalModelServiceInputsandOuputs() {
        return organizationalModelServiceInputsandOuputs;
    }

    public void setOrganizationalModelServiceWorkProduct(String organizationalModelServiceWorkProduct) {
        this.organizationalModelServiceWorkProduct = organizationalModelServiceWorkProduct;
    }

    public String getOrganizationalModelServiceWorkProduct() {
        return organizationalModelServiceWorkProduct;
    }

    public void setOrganizationalModelServiceName(String organizationalModelServiceName) {
        this.organizationalModelServiceName = organizationalModelServiceName;
    }

    public String getOrganizationalModelServiceName() {
        return organizationalModelServiceName;
    }
}