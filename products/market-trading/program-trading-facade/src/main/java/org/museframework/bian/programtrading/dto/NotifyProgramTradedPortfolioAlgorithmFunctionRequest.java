package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyProgramTradedPortfolioAlgorithmFunctionRequest {
    @MetaField
    private String programtradingid;

    @MetaField
    private String programtradedportfolioalgorithmfunctionid;

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
}