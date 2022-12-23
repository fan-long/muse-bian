package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSellerObligationConfirmationTaskRequest {
    @MetaField
    private String letterofcreditid;

    @MetaField
    private String sellerobligationconfirmationtaskid;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setSellerobligationconfirmationtaskid(String sellerobligationconfirmationtaskid) {
        this.sellerobligationconfirmationtaskid = sellerobligationconfirmationtaskid;
    }

    public String getSellerobligationconfirmationtaskid() {
        return sellerobligationconfirmationtaskid;
    }
}