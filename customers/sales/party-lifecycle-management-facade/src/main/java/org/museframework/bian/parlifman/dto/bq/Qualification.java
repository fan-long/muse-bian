/**/
package org.museframework.bian.parlifman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Qualification {
    /*The type of qualification check  (e.g. PEP/watch list checks, credit worthiness, legal jeopardy)*/
    @MetaField(0)
    private String qualificationType;

    /*Reference to an external verification source (e.g. for registered address/location verification)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicDirectoryReference;

    /*Reference to an external verification service (e.g. to perform background verification checks)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object specialistAgencyServiceReference;

    /*The record of a specific qualification task*/
    @MetaField(0)
    private String qualificationTaskRecord;

    /*Description of the approach taken*/
    @MetaField(0)
    private String qualificationTaskDescription;

    /*Result from the qualification service request*/
    @MetaField(0)
    private String specialistAgencyRegulatorServiceRequestResult;

    /*Reference to documents used for authentication*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField(0)
    private String qualificationTaskWorkProducts;

    /*The outcome of the qualification workstep*/
    @MetaField(0)
    private String qualificationTaskResult;

    public void setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
    }

    public String getQualificationType() {
        return qualificationType;
    }

    public void setPublicDirectoryReference(org.museframework.bian.classes.Object publicDirectoryReference) {
        this.publicDirectoryReference = publicDirectoryReference;
    }

    public org.museframework.bian.classes.Object getPublicDirectoryReference() {
        return publicDirectoryReference;
    }

    public void setSpecialistAgencyServiceReference(org.museframework.bian.classes.Object specialistAgencyServiceReference) {
        this.specialistAgencyServiceReference = specialistAgencyServiceReference;
    }

    public org.museframework.bian.classes.Object getSpecialistAgencyServiceReference() {
        return specialistAgencyServiceReference;
    }

    public void setQualificationTaskRecord(String qualificationTaskRecord) {
        this.qualificationTaskRecord = qualificationTaskRecord;
    }

    public String getQualificationTaskRecord() {
        return qualificationTaskRecord;
    }

    public void setQualificationTaskDescription(String qualificationTaskDescription) {
        this.qualificationTaskDescription = qualificationTaskDescription;
    }

    public String getQualificationTaskDescription() {
        return qualificationTaskDescription;
    }

    public void setSpecialistAgencyRegulatorServiceRequestResult(String specialistAgencyRegulatorServiceRequestResult) {
        this.specialistAgencyRegulatorServiceRequestResult = specialistAgencyRegulatorServiceRequestResult;
    }

    public String getSpecialistAgencyRegulatorServiceRequestResult() {
        return specialistAgencyRegulatorServiceRequestResult;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setQualificationTaskWorkProducts(String qualificationTaskWorkProducts) {
        this.qualificationTaskWorkProducts = qualificationTaskWorkProducts;
    }

    public String getQualificationTaskWorkProducts() {
        return qualificationTaskWorkProducts;
    }

    public void setQualificationTaskResult(String qualificationTaskResult) {
        this.qualificationTaskResult = qualificationTaskResult;
    }

    public String getQualificationTaskResult() {
        return qualificationTaskResult;
    }
}