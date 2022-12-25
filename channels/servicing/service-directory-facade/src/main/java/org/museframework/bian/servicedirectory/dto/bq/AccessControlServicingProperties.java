/*The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties*/
package org.museframework.bian.servicedirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccessControlServicingProperties {
    /*The required status/situation before the property is valid/meaningful*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    @MetaField(0)
    private String schedule;

    /*The version reference for the property value*/
    @MetaField(0)
    private String versionNumber;

    /*The Access Control Servicing Properties specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Access Control Servicing Properties*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntryReference;

    /*Reference to Access Control Servicing Properties*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object accessControlServicingPropertiesReference;

    /*The type of Access Control Servicing Properties*/
    @MetaField(0)
    private String accessControlServicingPropertiesType;

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

    public void setServiceDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntryReference) {
        this.serviceDirectoryEntryReference = serviceDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getServiceDirectoryEntryReference() {
        return serviceDirectoryEntryReference;
    }

    public void setAccessControlServicingPropertiesReference(org.museframework.bian.classes.Object accessControlServicingPropertiesReference) {
        this.accessControlServicingPropertiesReference = accessControlServicingPropertiesReference;
    }

    public org.museframework.bian.classes.Object getAccessControlServicingPropertiesReference() {
        return accessControlServicingPropertiesReference;
    }

    public void setAccessControlServicingPropertiesType(String accessControlServicingPropertiesType) {
        this.accessControlServicingPropertiesType = accessControlServicingPropertiesType;
    }

    public String getAccessControlServicingPropertiesType() {
        return accessControlServicingPropertiesType;
    }
}