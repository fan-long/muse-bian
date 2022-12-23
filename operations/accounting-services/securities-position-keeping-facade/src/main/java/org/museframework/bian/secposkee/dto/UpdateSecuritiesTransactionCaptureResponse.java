package org.museframework.bian.secposkee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSecuritiesTransactionCaptureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture securitiesTransactionCapture;

    public void setSecuritiesTransactionCapture(org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture securitiesTransactionCapture) {
        this.securitiesTransactionCapture = securitiesTransactionCapture;
    }

    public org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture getSecuritiesTransactionCapture() {
        return securitiesTransactionCapture;
    }
}