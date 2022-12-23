package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveVerifyMandateRequest {
    @MetaField
    private String directdebitid;

    @MetaField
    private String verifymandateid;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setVerifymandateid(String verifymandateid) {
        this.verifymandateid = verifymandateid;
    }

    public String getVerifymandateid() {
        return verifymandateid;
    }
}