package org.museframework.bian.traconmat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteUnmatchedMarketTradeEscalationFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction unmatchedMarketTradeEscalationFunction;

    public void setUnmatchedMarketTradeEscalationFunction(org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction unmatchedMarketTradeEscalationFunction) {
        this.unmatchedMarketTradeEscalationFunction = unmatchedMarketTradeEscalationFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction getUnmatchedMarketTradeEscalationFunction() {
        return unmatchedMarketTradeEscalationFunction;
    }
}