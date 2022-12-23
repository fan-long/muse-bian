package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlTechnologyStandardsSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.cr.TechnologyStandardsSpecification technologyStandardsSpecification;

    public void setTechnologyStandardsSpecification(org.museframework.bian.itstaandgui.dto.cr.TechnologyStandardsSpecification technologyStandardsSpecification) {
        this.technologyStandardsSpecification = technologyStandardsSpecification;
    }

    public org.museframework.bian.itstaandgui.dto.cr.TechnologyStandardsSpecification getTechnologyStandardsSpecification() {
        return technologyStandardsSpecification;
    }
}