/**/
package org.museframework.bian.parlifman.dto.bq;

public class Documentation {
    /*Describes documents that need to be available and evaluated*/
    private String partyLife_cycleRequiredDocumentation;

    /*Describes and records timing required and actual for obtaining and evaluating documents*/
    private String partyLife_cycleDocumentSchedule;

    /*Reference to specific documents used in the life-cycle check*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    public void setPartyLife_cycleRequiredDocumentation(String partyLife_cycleRequiredDocumentation) {
        this.partyLife_cycleRequiredDocumentation = partyLife_cycleRequiredDocumentation;
    }

    public String getPartyLife_cycleRequiredDocumentation() {
        return partyLife_cycleRequiredDocumentation;
    }

    public void setPartyLife_cycleDocumentSchedule(String partyLife_cycleDocumentSchedule) {
        this.partyLife_cycleDocumentSchedule = partyLife_cycleDocumentSchedule;
    }

    public String getPartyLife_cycleDocumentSchedule() {
        return partyLife_cycleDocumentSchedule;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }
}