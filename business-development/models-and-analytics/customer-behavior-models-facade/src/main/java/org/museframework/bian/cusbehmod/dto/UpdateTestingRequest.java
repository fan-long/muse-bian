package org.museframework.bian.cusbehmod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTestingRequest {
    @MetaField
    private String customerbehaviormodelsid;

    @MetaField
    private String testingid;

    @MetaField(ref=true)
    private org.museframework.bian.cusbehmod.dto.bq.Testing testing;

    public void setCustomerbehaviormodelsid(String customerbehaviormodelsid) {
        this.customerbehaviormodelsid = customerbehaviormodelsid;
    }

    public String getCustomerbehaviormodelsid() {
        return customerbehaviormodelsid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }

    public void setTesting(org.museframework.bian.cusbehmod.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.cusbehmod.dto.bq.Testing getTesting() {
        return testing;
    }
}