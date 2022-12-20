package org.museframework.bian.syndicatedloan.dto;

public class RetrieveSyndicateAssemblyRequest {
    private String syndicatedloanid;

    private String syndicateassemblyid;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setSyndicateassemblyid(String syndicateassemblyid) {
        this.syndicateassemblyid = syndicateassemblyid;
    }

    public String getSyndicateassemblyid() {
        return syndicateassemblyid;
    }
}