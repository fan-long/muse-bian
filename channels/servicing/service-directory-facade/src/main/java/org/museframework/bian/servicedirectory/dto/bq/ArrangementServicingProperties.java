/*The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties*/
package org.museframework.bian.servicedirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ArrangementServicingProperties {
    /*The required status/situation before the property is valid/meaningful*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    @MetaField
    private String schedule;

    /*The version reference for the property value*/
    @MetaField
    private String versionNumber;

    /*The Arrangement Servicing Properties specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Arrangement Servicing Properties*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntryReference;

    /*Reference to Arrangement Servicing Properties*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object arrangementServicingPropertiesReference;

    /*The type of Arrangement Servicing Properties*/
    @MetaField
    private String arrangementServicingPropertiesType;

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

    public void setArrangementServicingPropertiesReference(org.museframework.bian.classes.Object arrangementServicingPropertiesReference) {
        this.arrangementServicingPropertiesReference = arrangementServicingPropertiesReference;
    }

    public org.museframework.bian.classes.Object getArrangementServicingPropertiesReference() {
        return arrangementServicingPropertiesReference;
    }

    public void setArrangementServicingPropertiesType(String arrangementServicingPropertiesType) {
        this.arrangementServicingPropertiesType = arrangementServicingPropertiesType;
    }

    public String getArrangementServicingPropertiesType() {
        return arrangementServicingPropertiesType;
    }
}