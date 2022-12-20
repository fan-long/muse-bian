package org.museframework.bian.interactivehelp.dto;

public class RetrieveHelpServiceSelectionRequest {
    private String interactivehelpid;

    private String helpserviceselectionid;

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
}