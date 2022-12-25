/*An operational service or function supported within the Document Capture Function for doing Document Capture Function*/
package org.museframework.bian.archiveservices.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DocumentCaptureFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Document Capture Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Document Capture Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session archiveOperatingSessionReference;

    /*Reference to Document Capture Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function documentCaptureFunctionReference;

    /*The type of Document Capture Function*/
    @MetaField(0)
    private String documentCaptureFunctionType;

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

    public void setDocumentCaptureFunctionReference(org.museframework.bian.classes.Function documentCaptureFunctionReference) {
        this.documentCaptureFunctionReference = documentCaptureFunctionReference;
    }

    public org.museframework.bian.classes.Function getDocumentCaptureFunctionReference() {
        return documentCaptureFunctionReference;
    }

    public void setDocumentCaptureFunctionType(String documentCaptureFunctionType) {
        this.documentCaptureFunctionType = documentCaptureFunctionType;
    }

    public String getDocumentCaptureFunctionType() {
        return documentCaptureFunctionType;
    }
}