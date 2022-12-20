/*An operational service or function supported within the Document Capture Function for doing Document Capture Function*/
package org.museframework.bian.archiveservices.dto.bq;

public class ArchiveServicesOutcome {
    /**/
    private org.museframework.bian.classes.Event archiveServicesIncident;

    /**/
    private String archiveServicesProvision;

    public void setArchiveServicesIncident(org.museframework.bian.classes.Event archiveServicesIncident) {
        this.archiveServicesIncident = archiveServicesIncident;
    }

    public org.museframework.bian.classes.Event getArchiveServicesIncident() {
        return archiveServicesIncident;
    }

    public void setArchiveServicesProvision(String archiveServicesProvision) {
        this.archiveServicesProvision = archiveServicesProvision;
    }

    public String getArchiveServicesProvision() {
        return archiveServicesProvision;
    }
}