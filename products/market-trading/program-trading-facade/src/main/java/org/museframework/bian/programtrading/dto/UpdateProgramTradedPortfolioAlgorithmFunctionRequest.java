package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProgramTradedPortfolioAlgorithmFunctionRequest {
    @MetaField
    private String programtradingid;

    @MetaField
    private String programtradedportfolioalgorithmfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction programTradedPortfolioAlgorithmFunction;

    public void setProgramtradingid(String programtradingid) {
        this.programtradingid = programtradingid;
    }

    public String getProgramtradingid() {
        return programtradingid;
    }

    public void setProgramtradedportfolioalgorithmfunctionid(String programtradedportfolioalgorithmfunctionid) {
        this.programtradedportfolioalgorithmfunctionid = programtradedportfolioalgorithmfunctionid;
    }

    public String getProgramtradedportfolioalgorithmfunctionid() {
        return programtradedportfolioalgorithmfunctionid;
    }

    public void setProgramTradedPortfolioAlgorithmFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction programTradedPortfolioAlgorithmFunction) {
        this.programTradedPortfolioAlgorithmFunction = programTradedPortfolioAlgorithmFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction getProgramTradedPortfolioAlgorithmFunction() {
        return programTradedPortfolioAlgorithmFunction;
    }
}