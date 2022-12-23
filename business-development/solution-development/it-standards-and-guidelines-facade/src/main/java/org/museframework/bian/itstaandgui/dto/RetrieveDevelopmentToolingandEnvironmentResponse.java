package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDevelopmentToolingandEnvironmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.DevelopmentToolingandEnvironment developmentToolingandEnvironment;

    public void setDevelopmentToolingandEnvironment(org.museframework.bian.itstaandgui.dto.bq.DevelopmentToolingandEnvironment developmentToolingandEnvironment) {
        this.developmentToolingandEnvironment = developmentToolingandEnvironment;
    }

    public org.museframework.bian.itstaandgui.dto.bq.DevelopmentToolingandEnvironment getDevelopmentToolingandEnvironment() {
        return developmentToolingandEnvironment;
    }
}