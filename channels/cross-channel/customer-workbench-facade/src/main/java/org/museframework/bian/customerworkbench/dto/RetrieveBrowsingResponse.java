package org.museframework.bian.customerworkbench.dto;

public class RetrieveBrowsingResponse {
    private org.museframework.bian.customerworkbench.dto.bq.Browsing browsing;

    public void setBrowsing(org.museframework.bian.customerworkbench.dto.bq.Browsing browsing) {
        this.browsing = browsing;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Browsing getBrowsing() {
        return browsing;
    }
}