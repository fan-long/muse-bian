/*An object classified as something of value.
It is some tangible or intangible thing that the bank has ownership and/or influence over and has one or more inherent uses or purposes that create commercial value
Comment
BIAN has defined the likely assets found in any bank and uses this approach to isolate the specific types of asset that are acted on by the ServiceDomains. The role or purpose of each and every ServiceDomain is to apply its specific functional pattern to instances of one type of asset.
Is the tangible or intangible item that can have associated 'replacement' value/worth and purpose/use for which the bank has ownership or some level of control. It is exploited/leveraged in the execution of business through the application of some business behavior/control as effected by a ServiceDomain. Some asset types are obvious - for example a machine or building, some are intangible but easily identified such as knowhow, knowledge, relationships, reputation. Some are less obvious - most common is the 'capacity to perform' type which applies to many BIAN Service Domains. For example in the case of product fulfillment and support activities like party authentication the asset is the bank's possession of the capacity to perform these activities - the combination of the people/processes/systems to execute if you will...


*/
package org.museframework.bian.classes;

public class Asset {
    /*Describing elements expressing valuation of the object classified as something that has value. */
    private String assetProperties;

    /**/
    private String assetTitle;

    /*An identifier that allows to uniquely refer to an instance of an Asset.
*/
    private String assetIdentification;

    /*classification of an asset according to a specific Asset classification hierarchy*/
    private String assetType;

    /**/
    private String assetDescription;

    /**/
    private String assetStatus;

    public void setAssetProperties(String assetProperties) {
        this.assetProperties = assetProperties;
    }

    public String getAssetProperties() {
        return assetProperties;
    }

    public void setAssetTitle(String assetTitle) {
        this.assetTitle = assetTitle;
    }

    public String getAssetTitle() {
        return assetTitle;
    }

    public void setAssetIdentification(String assetIdentification) {
        this.assetIdentification = assetIdentification;
    }

    public String getAssetIdentification() {
        return assetIdentification;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    public String getAssetDescription() {
        return assetDescription;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public String getAssetStatus() {
        return assetStatus;
    }
}