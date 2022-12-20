package org.museframework.bian.syndicatedloan.dto;

public class RequestSyndicateAssemblyRequest {
    private String syndicatedloanid;

    private String syndicateassemblyid;

    private org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly syndicateAssembly;

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

    public void setSyndicateAssembly(org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly syndicateAssembly) {
        this.syndicateAssembly = syndicateAssembly;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly getSyndicateAssembly() {
        return syndicateAssembly;
    }
}