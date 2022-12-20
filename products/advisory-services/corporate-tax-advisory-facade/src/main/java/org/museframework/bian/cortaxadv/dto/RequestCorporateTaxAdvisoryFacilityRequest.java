package org.museframework.bian.cortaxadv.dto;

public class RequestCorporateTaxAdvisoryFacilityRequest {
    private String corporatetaxadvisoryid;

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