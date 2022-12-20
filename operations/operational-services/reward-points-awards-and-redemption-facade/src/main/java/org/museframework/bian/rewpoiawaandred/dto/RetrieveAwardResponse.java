package org.museframework.bian.rewpoiawaandred.dto;

public class RetrieveAwardResponse {
    private org.museframework.bian.rewpoiawaandred.dto.bq.Award award;

    public void setAward(org.museframework.bian.rewpoiawaandred.dto.bq.Award award) {
        this.award = award;
    }

    public org.museframework.bian.rewpoiawaandred.dto.bq.Award getAward() {
        return award;
    }
}