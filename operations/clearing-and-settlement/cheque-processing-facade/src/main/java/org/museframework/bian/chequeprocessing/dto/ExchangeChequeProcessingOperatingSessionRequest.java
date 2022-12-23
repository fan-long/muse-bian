package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeChequeProcessingOperatingSessionRequest {
    @MetaField
    private String chequeprocessingid;

    @MetaField(ref=true)
    private org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setChequeProcessingOperatingSession(org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession) {
        this.chequeProcessingOperatingSession = chequeProcessingOperatingSession;
    }

    public org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession getChequeProcessingOperatingSession() {
        return chequeProcessingOperatingSession;
    }
}