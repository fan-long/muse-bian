package org.museframework.bian.archiveservices.dto;

public class UpdateArchiveOperatingSessionRequest {
    private String archiveservicesid;

    private org.museframework.bian.archiveservices.dto.cr.ArchiveOperatingSession archiveOperatingSession;

    public void setArchiveservicesid(String archiveservicesid) {
        this.archiveservicesid = archiveservicesid;
    }

    public String getArchiveservicesid() {
        return archiveservicesid;
    }

    public void setArchiveOperatingSession(org.museframework.bian.archiveservices.dto.cr.ArchiveOperatingSession archiveOperatingSession) {
        this.archiveOperatingSession = archiveOperatingSession;
    }

    public org.museframework.bian.archiveservices.dto.cr.ArchiveOperatingSession getArchiveOperatingSession() {
        return archiveOperatingSession;
    }
}