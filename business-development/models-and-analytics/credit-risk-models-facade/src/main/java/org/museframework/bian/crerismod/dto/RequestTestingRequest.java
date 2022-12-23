package org.museframework.bian.crerismod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTestingRequest {
    @MetaField
    private String creditriskmodelsid;

    @MetaField
    private String testingid;

    @MetaField(ref=true)
    private org.museframework.bian.crerismod.dto.bq.Testing testing;

    public void setCreditriskmodelsid(String creditriskmodelsid) {
        this.creditriskmodelsid = creditriskmodelsid;
    }

    public String getCreditriskmodelsid() {
        return creditriskmodelsid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }

    public void setTesting(org.museframework.bian.crerismod.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.crerismod.dto.bq.Testing getTesting() {
        return testing;
    }
}