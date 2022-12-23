package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyAssetandLiabilityValuationTestRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField
    private String assetandliabilityvaluationtestid;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setAssetandliabilityvaluationtestid(String assetandliabilityvaluationtestid) {
        this.assetandliabilityvaluationtestid = assetandliabilityvaluationtestid;
    }

    public String getAssetandliabilityvaluationtestid() {
        return assetandliabilityvaluationtestid;
    }
}