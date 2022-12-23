package org.museframework.bian.productdesign.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTestingRequest {
    @MetaField
    private String productdesignid;

    @MetaField
    private String testingid;

    @MetaField(ref=true)
    private org.museframework.bian.productdesign.dto.bq.Testing testing;

    public void setProductdesignid(String productdesignid) {
        this.productdesignid = productdesignid;
    }

    public String getProductdesignid() {
        return productdesignid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }

    public void setTesting(org.museframework.bian.productdesign.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.productdesign.dto.bq.Testing getTesting() {
        return testing;
    }
}