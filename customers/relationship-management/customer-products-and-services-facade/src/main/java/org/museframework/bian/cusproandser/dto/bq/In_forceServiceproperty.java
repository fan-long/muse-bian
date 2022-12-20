/*The In-force Product property properties that represent a discrete aspect of the In-force Product property*/
package org.museframework.bian.cusproandser.dto.bq;

public class In_forceServiceproperty {
    /*The required status/situation before the property is valid/meaningful*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    private String schedule;

    /*The version reference for the property value*/
    private String versionNumber;

    /*The In-force Service property specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to In-force Service property*/
    private org.museframework.bian.classes.DirectoryEntry customerProductsAndServicesDirectoryEntryReference;

    /*Reference to In-force Service property*/
    private org.museframework.bian.classes.Object in_forceServicepropertyReference;

    /*The type of In-force Service property*/
    private String in_forceServicepropertyType;

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

    public void setIn_forceServicepropertyReference(org.museframework.bian.classes.Object in_forceServicepropertyReference) {
        this.in_forceServicepropertyReference = in_forceServicepropertyReference;
    }

    public org.museframework.bian.classes.Object getIn_forceServicepropertyReference() {
        return in_forceServicepropertyReference;
    }

    public void setIn_forceServicepropertyType(String in_forceServicepropertyType) {
        this.in_forceServicepropertyType = in_forceServicepropertyType;
    }

    public String getIn_forceServicepropertyType() {
        return in_forceServicepropertyType;
    }
}