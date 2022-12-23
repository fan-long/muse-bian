package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestSecuritizationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization;

    public void setSecuritization(org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}