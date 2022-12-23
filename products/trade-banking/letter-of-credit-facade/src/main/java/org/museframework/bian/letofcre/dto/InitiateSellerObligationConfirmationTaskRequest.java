package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSellerObligationConfirmationTaskRequest {
    @MetaField
    private String letterofcreditid;

    @MetaField
    private String sellerobligationconfirmationtaskid;

    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask sellerObligationConfirmationTask;

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

    public void setSellerObligationConfirmationTask(org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask sellerObligationConfirmationTask) {
        this.sellerObligationConfirmationTask = sellerObligationConfirmationTask;
    }

    public org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask getSellerObligationConfirmationTask() {
        return sellerObligationConfirmationTask;
    }
}