/*The In-force Product property properties that represent a discrete aspect of the In-force Product property*/
package org.museframework.bian.cusproandser.dto.bq;

public class In_forceProductproperty {
    /*The required status/situation before the property is valid/meaningful*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    private String schedule;

    /*The version reference for the property value*/
    private String versionNumber;

    /*The In-force Product property specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to In-force Product property*/
    private org.museframework.bian.classes.DirectoryEntry customerProductsAndServicesDirectoryEntryReference;

    /*Reference to In-force Product property*/
    private org.museframework.bian.classes.Object in_forceProductpropertyReference;

    /*The type of In-force Product property*/
    private String in_forceProductpropertyType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setCustomerProductsAndServicesDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry customerProductsAndServicesDirectoryEntryReference) {
        this.customerProductsAndServicesDirectoryEntryReference = customerProductsAndServicesDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getCustomerProductsAndServicesDirectoryEntryReference() {
        return customerProductsAndServicesDirectoryEntryReference;
    }

    public void setIn_forceProductpropertyReference(org.museframework.bian.classes.Object in_forceProductpropertyReference) {
        this.in_forceProductpropertyReference = in_forceProductpropertyReference;
    }

    public org.museframework.bian.classes.Object getIn_forceProductpropertyReference() {
        return in_forceProductpropertyReference;
    }

    public void setIn_forceProductpropertyType(String in_forceProductpropertyType) {
        this.in_forceProductpropertyType = in_forceProductpropertyType;
    }

    public String getIn_forceProductpropertyType() {
        return in_forceProductpropertyType;
    }
}