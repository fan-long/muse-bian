package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateAssetandLiabilityValuationTestRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField
    private String assetandliabilityvaluationtestid;

    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest assetandLiabilityValuationTest;

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

    public void setAssetandLiabilityValuationTest(org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest assetandLiabilityValuationTest) {
        this.assetandLiabilityValuationTest = assetandLiabilityValuationTest;
    }

    public org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest getAssetandLiabilityValuationTest() {
        return assetandLiabilityValuationTest;
    }
}