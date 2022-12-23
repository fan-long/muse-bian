package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteLetterOfCreditTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction;

    public void setLetterOfCreditTransaction(org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction) {
        this.letterOfCreditTransaction = letterOfCreditTransaction;
    }

    public org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction getLetterOfCreditTransaction() {
        return letterOfCreditTransaction;
    }
}