package org.museframework.bian.cortaxadv.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCorporateTaxAdvisoryFacilityRequest {
    @MetaField
    private String corporatetaxadvisoryid;

    @MetaField(ref=true)
    private org.museframework.bian.cortaxadv.dto.cr.CorporateTaxAdvisoryFacility corporateTaxAdvisoryFacility;

    public void setCorporatetaxadvisoryid(String corporatetaxadvisoryid) {
        this.corporatetaxadvisoryid = corporatetaxadvisoryid;
    }

    public String getCorporatetaxadvisoryid() {
        return corporatetaxadvisoryid;
    }

    public void setCorporateTaxAdvisoryFacility(org.museframework.bian.cortaxadv.dto.cr.CorporateTaxAdvisoryFacility corporateTaxAdvisoryFacility) {
        this.corporateTaxAdvisoryFacility = corporateTaxAdvisoryFacility;
    }

    public org.museframework.bian.cortaxadv.dto.cr.CorporateTaxAdvisoryFacility getCorporateTaxAdvisoryFacility() {
        return corporateTaxAdvisoryFacility;
    }
}