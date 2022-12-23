package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteVerifyMandateRequest {
    @MetaField
    private String directdebitid;

    @MetaField
    private String verifymandateid;

    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate;

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

    public void setVerifyMandate(org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate) {
        this.verifyMandate = verifyMandate;
    }

    public org.museframework.bian.directdebit.dto.bq.VerifyMandate getVerifyMandate() {
        return verifyMandate;
    }
}