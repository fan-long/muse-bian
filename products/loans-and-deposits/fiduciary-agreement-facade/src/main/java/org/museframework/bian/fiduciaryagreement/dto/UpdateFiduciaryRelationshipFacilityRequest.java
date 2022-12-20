package org.museframework.bian.fiduciaryagreement.dto;

public class UpdateFiduciaryRelationshipFacilityRequest {
    private String fiduciaryagreementid;

    private org.museframework.bian.fiduciaryagreement.dto.cr.FiduciaryRelationshipFacility fiduciaryRelationshipFacility;

    public void setFiduciaryagreementid(String fiduciaryagreementid) {
        this.fiduciaryagreementid = fiduciaryagreementid;
    }

    public String getFiduciaryagreementid() {
        return fiduciaryagreementid;
    }

    public void setFiduciaryRelationshipFacility(org.museframework.bian.fiduciaryagreement.dto.cr.FiduciaryRelationshipFacility fiduciaryRelationshipFacility) {
        this.fiduciaryRelationshipFacility = fiduciaryRelationshipFacility;
    }

    public org.museframework.bian.fiduciaryagreement.dto.cr.FiduciaryRelationshipFacility getFiduciaryRelationshipFacility() {
        return fiduciaryRelationshipFacility;
    }
}