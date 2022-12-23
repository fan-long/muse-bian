package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifySellerObligationConfirmationTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask sellerObligationConfirmationTask;

    public void setSellerObligationConfirmationTask(org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask sellerObligationConfirmationTask) {
        this.sellerObligationConfirmationTask = sellerObligationConfirmationTask;
    }

    public org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask getSellerObligationConfirmationTask() {
        return sellerObligationConfirmationTask;
    }
}