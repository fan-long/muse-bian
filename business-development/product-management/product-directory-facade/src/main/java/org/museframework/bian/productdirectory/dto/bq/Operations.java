/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.productdirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Operations {
    /*The intended schedule of operational tasks and product service availability*/
    @MetaField(0)
    private String productandServiceOperatingSchedule;

    /*Parameter used to configuring operations*/
    @MetaField(0)
    private String productandServiceConfigurationParameterType;

    /*Description describing the purpose, options and impact of the parameter*/
    @MetaField(0)
    private String productandServiceConfigurationParameterDescription;

    /*The default parameter setting and possible value range*/
    @MetaField(0)
    private String productandServiceConfigurationParameterSetting;

    public void setProductandServiceOperatingSchedule(String productandServiceOperatingSchedule) {
        this.productandServiceOperatingSchedule = productandServiceOperatingSchedule;
    }

    public String getProductandServiceOperatingSchedule() {
        return productandServiceOperatingSchedule;
    }

    public void setProductandServiceConfigurationParameterType(String productandServiceConfigurationParameterType) {
        this.productandServiceConfigurationParameterType = productandServiceConfigurationParameterType;
    }

    public String getProductandServiceConfigurationParameterType() {
        return productandServiceConfigurationParameterType;
    }

    public void setProductandServiceConfigurationParameterDescription(String productandServiceConfigurationParameterDescription) {
        this.productandServiceConfigurationParameterDescription = productandServiceConfigurationParameterDescription;
    }

    public String getProductandServiceConfigurationParameterDescription() {
        return productandServiceConfigurationParameterDescription;
    }

    public void setProductandServiceConfigurationParameterSetting(String productandServiceConfigurationParameterSetting) {
        this.productandServiceConfigurationParameterSetting = productandServiceConfigurationParameterSetting;
    }

    public String getProductandServiceConfigurationParameterSetting() {
        return productandServiceConfigurationParameterSetting;
    }
}