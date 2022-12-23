package org.museframework.bian.syndicatemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlSyndicateMembershipResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership syndicateMembership;

    public void setSyndicateMembership(org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership syndicateMembership) {
        this.syndicateMembership = syndicateMembership;
    }

    public org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership getSyndicateMembership() {
        return syndicateMembership;
    }
}