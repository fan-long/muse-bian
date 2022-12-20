package org.museframework.bian.privateplacement.dto;

public class RequestPrivatePlacementFacilityRequest {
    private String privateplacementid;

    private org.museframework.bian.privateplacement.dto.cr.PrivatePlacementFacility privatePlacementFacility;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivatePlacementFacility(org.museframework.bian.privateplacement.dto.cr.PrivatePlacementFacility privatePlacementFacility) {
        this.privatePlacementFacility = privatePlacementFacility;
    }

    public org.museframework.bian.privateplacement.dto.cr.PrivatePlacementFacility getPrivatePlacementFacility() {
        return privatePlacementFacility;
    }
}