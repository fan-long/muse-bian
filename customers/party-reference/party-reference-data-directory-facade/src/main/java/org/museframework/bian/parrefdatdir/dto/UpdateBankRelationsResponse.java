package org.museframework.bian.parrefdatdir.dto;

public class UpdateBankRelationsResponse {
    private org.museframework.bian.parrefdatdir.dto.bq.BankRelations bankRelations;

    public void setBankRelations(org.museframework.bian.parrefdatdir.dto.bq.BankRelations bankRelations) {
        this.bankRelations = bankRelations;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.BankRelations getBankRelations() {
        return bankRelations;
    }
}