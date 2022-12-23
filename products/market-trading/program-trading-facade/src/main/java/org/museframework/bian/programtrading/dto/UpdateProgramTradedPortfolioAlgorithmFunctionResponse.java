package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateProgramTradedPortfolioAlgorithmFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction programTradedPortfolioAlgorithmFunction;

    public void setProgramTradedPortfolioAlgorithmFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction programTradedPortfolioAlgorithmFunction) {
        this.programTradedPortfolioAlgorithmFunction = programTradedPortfolioAlgorithmFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction getProgramTradedPortfolioAlgorithmFunction() {
        return programTradedPortfolioAlgorithmFunction;
    }
}