package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteTradeCaptureandReportingFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TradeCaptureandReportingFunction tradeCaptureandReportingFunction;

    public void setTradeCaptureandReportingFunction(org.museframework.bian.traposope.dto.bq.TradeCaptureandReportingFunction tradeCaptureandReportingFunction) {
        this.tradeCaptureandReportingFunction = tradeCaptureandReportingFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeCaptureandReportingFunction getTradeCaptureandReportingFunction() {
        return tradeCaptureandReportingFunction;
    }
}