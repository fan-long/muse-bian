/*Parameter used for configuring options.*/
package org.museframework.bian.classes;

public class ConfigurationParameter {
    /**/
    private String configurationParameterType;

    /**/
    private String configurationParameterDescription;

    /**/
    private String configurationParameterValueRange;

    public void setConfigurationParameterType(String configurationParameterType) {
        this.configurationParameterType = configurationParameterType;
    }

    public String getConfigurationParameterType() {
        return configurationParameterType;
    }

    public void setConfigurationParameterDescription(String configurationParameterDescription) {
        this.configurationParameterDescription = configurationParameterDescription;
    }

    public String getConfigurationParameterDescription() {
        return configurationParameterDescription;
    }

    public void setConfigurationParameterValueRange(String configurationParameterValueRange) {
        this.configurationParameterValueRange = configurationParameterValueRange;
    }

    public String getConfigurationParameterValueRange() {
        return configurationParameterValueRange;
    }
}