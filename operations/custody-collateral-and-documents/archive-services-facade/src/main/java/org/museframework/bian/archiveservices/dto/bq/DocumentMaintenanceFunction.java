/*An operational service or function supported within the Document Capture Function for doing Document Capture Function*/
package org.museframework.bian.archiveservices.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DocumentMaintenanceFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Document Maintenance Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Document Maintenance Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session archiveOperatingSessionReference;

    /*Reference to Document Maintenance Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function documentMaintenanceFunctionReference;

    /*The type of Document Maintenance Function*/
    @MetaField
    private String documentMaintenanceFunctionType;

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

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setArchiveOperatingSessionReference(org.museframework.bian.classes.Session archiveOperatingSessionReference) {
        this.archiveOperatingSessionReference = archiveOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getArchiveOperatingSessionReference() {
        return archiveOperatingSessionReference;
    }

    public void setDocumentMaintenanceFunctionReference(org.museframework.bian.classes.Function documentMaintenanceFunctionReference) {
        this.documentMaintenanceFunctionReference = documentMaintenanceFunctionReference;
    }

    public org.museframework.bian.classes.Function getDocumentMaintenanceFunctionReference() {
        return documentMaintenanceFunctionReference;
    }

    public void setDocumentMaintenanceFunctionType(String documentMaintenanceFunctionType) {
        this.documentMaintenanceFunctionType = documentMaintenanceFunctionType;
    }

    public String getDocumentMaintenanceFunctionType() {
        return documentMaintenanceFunctionType;
    }
}