package org.museframework.bian.syndicatedloan.dto;

public class RetrieveSyndicateAssemblyResponse {
    private org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly syndicateAssembly;

    public void setSyndicateAssembly(org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly syndicateAssembly) {
        this.syndicateAssembly = syndicateAssembly;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly getSyndicateAssembly() {
        return syndicateAssembly;
    }
}