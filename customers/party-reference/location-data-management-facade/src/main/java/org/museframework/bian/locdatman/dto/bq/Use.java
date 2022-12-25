/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.locdatman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Use {
    /*The planning or zoning status (e.g. residential, commercial, industrial)*/
    @MetaField(0)
    private String locationZoningType;

    /*The allowed usage for the property at the location (e.g. domestic residence, manufacturing, retail)*/
    @MetaField(0)
    private String locationUsage;

    public void setLocationZoningType(String locationZoningType) {
        this.locationZoningType = locationZoningType;
    }

    public String getLocationZoningType() {
        return locationZoningType;
    }

    public void setLocationUsage(String locationUsage) {
        this.locationUsage = locationUsage;
    }

    public String getLocationUsage() {
        return locationUsage;
    }
}