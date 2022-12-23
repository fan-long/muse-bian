/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FacilityApplication {
    /*Product feature selected in the customer offering*/
    @MetaField
    private String facilityOption;

    /*Description of the facility option*/
    @MetaField
    private String facilityOptionDescription;

    /*The option setting as agreed/defined with the customer*/
    @MetaField
    private String facilityOptionSetting;

    /*The allowed pricing includes ranges by customer measures e.g. credit grade*/
    @MetaField
    private String facilityPricing;

    /*Guidelines for the allowed situation-based pricing adjustments (to maximize margins)*/
    @MetaField
    private String negotiationGuidelinesRules;

    /*The agreed pricing  (covers all negotiable prices/fees/penalties as necessary)*/
    @MetaField
    private String agreedPricing;

    /**/
    @MetaField
    private String pricingAdjustments;

    /*Duration of facility e.g., duration of loan*/
    @MetaField
    private String facilitySchedule;

    public void setFacilityOption(String facilityOption) {
        this.facilityOption = facilityOption;
    }

    public String getFacilityOption() {
        return facilityOption;
    }

    public void setFacilityOptionDescription(String facilityOptionDescription) {
        this.facilityOptionDescription = facilityOptionDescription;
    }

    public String getFacilityOptionDescription() {
        return facilityOptionDescription;
    }

    public void setFacilityOptionSetting(String facilityOptionSetting) {
        this.facilityOptionSetting = facilityOptionSetting;
    }

    public String getFacilityOptionSetting() {
        return facilityOptionSetting;
    }

    public void setFacilityPricing(String facilityPricing) {
        this.facilityPricing = facilityPricing;
    }

    public String getFacilityPricing() {
        return facilityPricing;
    }

    public void setNegotiationGuidelinesRules(String negotiationGuidelinesRules) {
        this.negotiationGuidelinesRules = negotiationGuidelinesRules;
    }

    public String getNegotiationGuidelinesRules() {
        return negotiationGuidelinesRules;
    }

    public void setAgreedPricing(String agreedPricing) {
        this.agreedPricing = agreedPricing;
    }

    public String getAgreedPricing() {
        return agreedPricing;
    }

    public void setPricingAdjustments(String pricingAdjustments) {
        this.pricingAdjustments = pricingAdjustments;
    }

    public String getPricingAdjustments() {
        return pricingAdjustments;
    }

    public void setFacilitySchedule(String facilitySchedule) {
        this.facilitySchedule = facilitySchedule;
    }

    public String getFacilitySchedule() {
        return facilitySchedule;
    }
}