package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSecuritizationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization;

    public void setSecuritization(org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}