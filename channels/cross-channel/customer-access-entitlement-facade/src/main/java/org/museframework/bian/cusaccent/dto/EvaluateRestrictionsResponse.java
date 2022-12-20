package org.museframework.bian.cusaccent.dto;

public class EvaluateRestrictionsResponse {
    private org.museframework.bian.cusaccent.dto.bq.Restrictions restrictions;

    public void setRestrictions(org.museframework.bian.cusaccent.dto.bq.Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    public org.museframework.bian.cusaccent.dto.bq.Restrictions getRestrictions() {
        return restrictions;
    }
}