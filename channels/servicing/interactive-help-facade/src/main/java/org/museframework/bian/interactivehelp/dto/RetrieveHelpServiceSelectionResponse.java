package org.museframework.bian.interactivehelp.dto;

public class RetrieveHelpServiceSelectionResponse {
    private org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection helpServiceSelection;

    public void setHelpServiceSelection(org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection helpServiceSelection) {
        this.helpServiceSelection = helpServiceSelection;
    }

    public org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection getHelpServiceSelection() {
        return helpServiceSelection;
    }
}