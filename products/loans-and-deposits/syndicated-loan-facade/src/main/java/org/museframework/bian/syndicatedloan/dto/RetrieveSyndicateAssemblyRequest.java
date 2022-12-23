package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSyndicateAssemblyRequest {
    @MetaField
    private String syndicatedloanid;

    @MetaField
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