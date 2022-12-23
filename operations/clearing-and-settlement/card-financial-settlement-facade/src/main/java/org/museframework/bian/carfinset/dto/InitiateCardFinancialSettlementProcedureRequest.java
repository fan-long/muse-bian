package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCardFinancialSettlementProcedureRequest {
    @MetaField(ref=true)
    private org.museframework.bian.carfinset.dto.cr.CardFinancialSettlementProcedure cardFinancialSettlementProcedure;

    public void setCardFinancialSettlementProcedure(org.museframework.bian.carfinset.dto.cr.CardFinancialSettlementProcedure cardFinancialSettlementProcedure) {
        this.cardFinancialSettlementProcedure = cardFinancialSettlementProcedure;
    }

    public org.museframework.bian.carfinset.dto.cr.CardFinancialSettlementProcedure getCardFinancialSettlementProcedure() {
        return cardFinancialSettlementProcedure;
    }
}