package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifySensitivityTestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest;

    public void setSensitivityTest(org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest) {
        this.sensitivityTest = sensitivityTest;
    }

    public org.museframework.bian.finstaass.dto.bq.SensitivityTest getSensitivityTest() {
        return sensitivityTest;
    }
}