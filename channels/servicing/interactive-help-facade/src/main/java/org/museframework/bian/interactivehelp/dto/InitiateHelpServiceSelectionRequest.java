package org.museframework.bian.interactivehelp.dto;

public class InitiateHelpServiceSelectionRequest {
    private String interactivehelpid;

    private String helpserviceselectionid;

    private org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection helpServiceSelection;

    public void setInteractivehelpid(String interactivehelpid) {
        this.interactivehelpid = interactivehelpid;
    }

    public String getInteractivehelpid() {
        return interactivehelpid;
    }

    public void setHelpserviceselectionid(String helpserviceselectionid) {
        this.helpserviceselectionid = helpserviceselectionid;
    }

    public String getHelpserviceselectionid() {
        return helpserviceselectionid;
    }

    public void setHelpServiceSelection(org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection helpServiceSelection) {
        this.helpServiceSelection = helpServiceSelection;
    }

    public org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection getHelpServiceSelection() {
        return helpServiceSelection;
    }
}