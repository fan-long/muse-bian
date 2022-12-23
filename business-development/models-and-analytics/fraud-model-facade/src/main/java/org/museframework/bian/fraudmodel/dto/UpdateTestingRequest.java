package org.museframework.bian.fraudmodel.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTestingRequest {
    @MetaField
    private String fraudmodelid;

    @MetaField
    private String testingid;

    @MetaField(ref=true)
    private org.museframework.bian.fraudmodel.dto.bq.Testing testing;

    public void setFraudmodelid(String fraudmodelid) {
        this.fraudmodelid = fraudmodelid;
    }

    public String getFraudmodelid() {
        return fraudmodelid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }

    public void setTesting(org.museframework.bian.fraudmodel.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.fraudmodel.dto.bq.Testing getTesting() {
        return testing;
    }
}