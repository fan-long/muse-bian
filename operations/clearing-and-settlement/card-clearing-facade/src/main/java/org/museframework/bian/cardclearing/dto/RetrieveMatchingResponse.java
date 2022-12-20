package org.museframework.bian.cardclearing.dto;

public class RetrieveMatchingResponse {
    private org.museframework.bian.cardclearing.dto.bq.Matching matching;

    public void setMatching(org.museframework.bian.cardclearing.dto.bq.Matching matching) {
        this.matching = matching;
    }

    public org.museframework.bian.cardclearing.dto.bq.Matching getMatching() {
        return matching;
    }
}