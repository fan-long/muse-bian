package org.museframework.bian.parlifman.dto;

public class RetrievePrecedentsResponse {
    private org.museframework.bian.parlifman.dto.bq.Precedents precedents;

    public void setPrecedents(org.museframework.bian.parlifman.dto.bq.Precedents precedents) {
        this.precedents = precedents;
    }

    public org.museframework.bian.parlifman.dto.bq.Precedents getPrecedents() {
        return precedents;
    }
}