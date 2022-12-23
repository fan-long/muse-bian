package org.museframework.bian.interactivehelp.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureHelpServiceSelectionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection helpServiceSelection;

    public void setHelpServiceSelection(org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection helpServiceSelection) {
        this.helpServiceSelection = helpServiceSelection;
    }

    public org.museframework.bian.interactivehelp.dto.bq.HelpServiceSelection getHelpServiceSelection() {
        return helpServiceSelection;
    }
}