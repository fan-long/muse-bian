package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSyndicateAssemblyRequest {
    @MetaField
    private String syndicatedloanid;

    @MetaField
    private String syndicateassemblyid;

    @MetaField(ref=true)
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