package org.museframework.bian.interactivehelp.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureHelpServiceSelectionRequest {
    @MetaField
    private String interactivehelpid;

    @MetaField
    private String helpserviceselectionid;

    @MetaField(ref=true)
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