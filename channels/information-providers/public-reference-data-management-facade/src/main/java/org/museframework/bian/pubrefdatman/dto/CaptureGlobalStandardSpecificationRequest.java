package org.museframework.bian.pubrefdatman.dto;

public class CaptureGlobalStandardSpecificationRequest {
    private String publicreferencedatamanagementid;

    private org.museframework.bian.pubrefdatman.dto.cr.GlobalStandardSpecification globalStandardSpecification;

    public void setPublicreferencedatamanagementid(String publicreferencedatamanagementid) {
        this.publicreferencedatamanagementid = publicreferencedatamanagementid;
    }

    public String getPublicreferencedatamanagementid() {
        return publicreferencedatamanagementid;
    }

    public void setGlobalStandardSpecification(org.museframework.bian.pubrefdatman.dto.cr.GlobalStandardSpecification globalStandardSpecification) {
        this.globalStandardSpecification = globalStandardSpecification;
    }

    public org.museframework.bian.pubrefdatman.dto.cr.GlobalStandardSpecification getGlobalStandardSpecification() {
        return globalStandardSpecification;
    }
}