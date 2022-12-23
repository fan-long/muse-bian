package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteSensitivityTestRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField
    private String sensitivitytestid;

    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest;

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

    public void setSensitivityTest(org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest) {
        this.sensitivityTest = sensitivityTest;
    }

    public org.museframework.bian.finstaass.dto.bq.SensitivityTest getSensitivityTest() {
        return sensitivityTest;
    }
}