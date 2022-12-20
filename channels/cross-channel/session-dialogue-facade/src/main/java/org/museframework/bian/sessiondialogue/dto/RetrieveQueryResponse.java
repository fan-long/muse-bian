package org.museframework.bian.sessiondialogue.dto;

public class RetrieveQueryResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.Query query;

    public void setQuery(org.museframework.bian.sessiondialogue.dto.bq.Query query) {
        this.query = query;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Query getQuery() {
        return query;
    }
}