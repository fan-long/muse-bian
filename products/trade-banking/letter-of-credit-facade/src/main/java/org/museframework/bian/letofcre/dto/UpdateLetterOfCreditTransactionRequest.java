package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLetterOfCreditTransactionRequest {
    @MetaField
    private String letterofcreditid;

    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setLetterOfCreditTransaction(org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction) {
        this.letterOfCreditTransaction = letterOfCreditTransaction;
    }

    public org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction getLetterOfCreditTransaction() {
        return letterOfCreditTransaction;
    }
}