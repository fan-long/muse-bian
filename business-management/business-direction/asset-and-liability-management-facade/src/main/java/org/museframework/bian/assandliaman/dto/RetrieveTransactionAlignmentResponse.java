package org.museframework.bian.assandliaman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTransactionAlignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.assandliaman.dto.bq.TransactionAlignment transactionAlignment;

    public void setTransactionAlignment(org.museframework.bian.assandliaman.dto.bq.TransactionAlignment transactionAlignment) {
        this.transactionAlignment = transactionAlignment;
    }

    public org.museframework.bian.assandliaman.dto.bq.TransactionAlignment getTransactionAlignment() {
        return transactionAlignment;
    }
}