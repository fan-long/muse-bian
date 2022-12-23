/**/
package org.museframework.bian.parlifman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Authentication extends org.museframework.bian.classes.Authentication {
    /*The method used to authenticate (e.g. public directory, document, 3rd party service providers)*/
    @MetaField
    private String authenticationType;

    /*Reference to an external verification source (e.g. for registered address/location verification)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicDirectoryReference;

    /*Reference to an external verification service (e.g. to perform background verification checks)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object specialistAgencyServiceReference;

    /*The record of a specific verification task*/
    @MetaField
    private String authenticationTaskRecord;

    /*Description of the authentication procedure*/
    @MetaField
    private String authenticationTaskDescription;

    /*Result from the authentication service request*/
    @MetaField
    private String specialistAgencyServiceRequestResult;

    /*Reference to documents used for authentication*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField
    private String authenticationTaskWorkProducts;

    /*The outcome of the authentication workstep*/
    @MetaField
    private String authenticationTaskResult;

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getAuthenticationType() {
        return authenticationType;
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

    public void setAuthenticationTaskRecord(String authenticationTaskRecord) {
        this.authenticationTaskRecord = authenticationTaskRecord;
    }

    public String getAuthenticationTaskRecord() {
        return authenticationTaskRecord;
    }

    public void setAuthenticationTaskDescription(String authenticationTaskDescription) {
        this.authenticationTaskDescription = authenticationTaskDescription;
    }

    public String getAuthenticationTaskDescription() {
        return authenticationTaskDescription;
    }

    public void setSpecialistAgencyServiceRequestResult(String specialistAgencyServiceRequestResult) {
        this.specialistAgencyServiceRequestResult = specialistAgencyServiceRequestResult;
    }

    public String getSpecialistAgencyServiceRequestResult() {
        return specialistAgencyServiceRequestResult;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setAuthenticationTaskWorkProducts(String authenticationTaskWorkProducts) {
        this.authenticationTaskWorkProducts = authenticationTaskWorkProducts;
    }

    public String getAuthenticationTaskWorkProducts() {
        return authenticationTaskWorkProducts;
    }

    public void setAuthenticationTaskResult(String authenticationTaskResult) {
        this.authenticationTaskResult = authenticationTaskResult;
    }

    public String getAuthenticationTaskResult() {
        return authenticationTaskResult;
    }
}