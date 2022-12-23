package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifySensitivityTestRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField
    private String sensitivitytestid;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setSensitivitytestid(String sensitivitytestid) {
        this.sensitivitytestid = sensitivitytestid;
    }

    public String getSensitivitytestid() {
        return sensitivitytestid;
    }
}