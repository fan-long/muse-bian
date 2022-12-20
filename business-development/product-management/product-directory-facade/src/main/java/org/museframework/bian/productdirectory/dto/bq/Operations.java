/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.productdirectory.dto.bq;

public class Operations {
    /*The intended schedule of operational tasks and product service availability*/
    private String productandServiceOperatingSchedule;

    /*Parameter used to configuring operations*/
    private String productandServiceConfigurationParameterType;

    /*Description describing the purpose, options and impact of the parameter*/
    private String productandServiceConfigurationParameterDescription;

    /*The default parameter setting and possible value range*/
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